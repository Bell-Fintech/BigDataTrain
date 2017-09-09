package cn.edu360.sm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu360.sm.model.User;
import cn.edu360.sm.service.UserService;
import cn.edu360.sm.service.impl.UserServiceImpl;
import cn.edu360.sm.vo.LoginStatus;

@Controller
public class LoginAction {
	
	@RequestMapping("/toLogin.shtml")
	public String toLogin(){
		return "login";
	}
	/**
	 * Springmvc支持pojo来绑定请求参数
	 * 但是pojo属性名必须得和参数的名字一致
	 * @throws Exception 
	 */
	//@RequestMapping("/login.shtml")
	/**requestBody注解将请求的主体当中的json数据，转换为java对象(一般搭配客户端的ajax请求)
	 * responseBody注解将处理器的方法的返回值的对象转换为json字符串响应给客户端
	 * 现在互联网上的产品大多使用http+json的开发模式
	 */
	@RequestMapping(value={"/login.shtml","/logins.shtml"})
	public @ResponseBody LoginStatus login(@RequestBody User user,HttpSession session,HttpServletRequest request) throws Exception{
		/**post请求参数重新编码	
		 单独处理:request.setCharacterEncoding("UTF-8");
		 全局处理:在web.xml里配置统一编码的过滤器
		**/
		System.out.println(user);
		//调用userService去进行数据库的校验
		UserService userService=new UserServiceImpl();
		User checkUser=userService.findUserByusernameAndPassword(user);
		LoginStatus status=new LoginStatus();
		if(checkUser==null){
			status.setStatus("0");
		}else{
			session.setAttribute("user", checkUser);
			status.setStatus("1");
		}
		return status;
	}
	
	@RequestMapping("/index.shtml")
	public String index(){
		return "index";
	}
	
	/**
	 * 根据id查询用户的restful写法
	 * 1:restful的架构设计，springmvc的核心控制器处理所有的请求（不配置后缀）
	 *  注意：由于配置了第一步，所以必须得指定静态资源 css js images ，
	 *  否则项目当中的静态资源就无法访问
	 * 2:严格限制请求的url，不能包含任何动词和参数
	 * 3:通过解析url，和判断请求的方式，来完成对数据库的增删改查
	 * springmvc提供了pathVariable注解用来读取url中定义的占位符变量的值
	 * {id}是占位符变量
	 * 
	 */
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public @ResponseBody User findUser(@PathVariable(value="id") int id,HttpServletRequest request){
		UserService userService=new UserServiceImpl();
		User user=userService.findUserById(id);
		return user;
	}
	

}

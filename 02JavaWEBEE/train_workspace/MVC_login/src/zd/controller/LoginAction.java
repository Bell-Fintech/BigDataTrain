package zd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zd.model.User;
import zd.service.UserService;
import zd.service.impl.UserServiceImpl;

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
	@RequestMapping("/login.shtml")
	public void login(User user,HttpServletResponse response,HttpSession session,HttpServletRequest request) throws Exception{
		/**post请求参数重新编码	
		 单独处理:request.setCharacterEncoding("UTF-8");
		 全局处理:在web.xml里配置统一编码的过滤器
		**/
		//调用userService去进行数据库的校验
		UserService userService=new UserServiceImpl();
		User checkUser=userService.findUserByusernameAndPassword(user);
		if(checkUser==null){
			response.getWriter().write("0");
		}else{
			session.setAttribute("user", checkUser);
			response.getWriter().write("1");
		}
		
	}
	
	@RequestMapping("/index.shtml")
	public String index(){
		return "index";
	}
	

}

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
	 * Springmvc֧��pojo�����������
	 * ����pojo����������úͲ���������һ��
	 * @throws Exception 
	 */
	//@RequestMapping("/login.shtml")
	/**requestBodyע�⽫��������嵱�е�json���ݣ�ת��Ϊjava����(һ�����ͻ��˵�ajax����)
	 * responseBodyע�⽫�������ķ����ķ���ֵ�Ķ���ת��Ϊjson�ַ�����Ӧ���ͻ���
	 * ���ڻ������ϵĲ�Ʒ���ʹ��http+json�Ŀ���ģʽ
	 */
	@RequestMapping(value={"/login.shtml","/logins.shtml"})
	public @ResponseBody LoginStatus login(@RequestBody User user,HttpSession session,HttpServletRequest request) throws Exception{
		/**post����������±���	
		 ��������:request.setCharacterEncoding("UTF-8");
		 ȫ�ִ���:��web.xml������ͳһ����Ĺ�����
		**/
		System.out.println(user);
		//����userServiceȥ�������ݿ��У��
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
	 * ����id��ѯ�û���restfulд��
	 * 1:restful�ļܹ���ƣ�springmvc�ĺ��Ŀ������������е����󣨲����ú�׺��
	 *  ע�⣺���������˵�һ�������Ա����ָ����̬��Դ css js images ��
	 *  ������Ŀ���еľ�̬��Դ���޷�����
	 * 2:�ϸ����������url�����ܰ����κζ��ʺͲ���
	 * 3:ͨ������url�����ж�����ķ�ʽ������ɶ����ݿ����ɾ�Ĳ�
	 * springmvc�ṩ��pathVariableע��������ȡurl�ж����ռλ��������ֵ
	 * {id}��ռλ������
	 * 
	 */
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public @ResponseBody User findUser(@PathVariable(value="id") int id,HttpServletRequest request){
		UserService userService=new UserServiceImpl();
		User user=userService.findUserById(id);
		return user;
	}
	

}

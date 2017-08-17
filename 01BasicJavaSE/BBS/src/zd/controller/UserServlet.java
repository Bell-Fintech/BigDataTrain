package zd.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import zd.model.User;
import zd.impl.UserServiceImpl;
import zd.service.UserService;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       //login.jsp 在WEB-INF下 受保护 不可以直接访问 在Servlet里面判断 可以就登陆
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String md=request.getParameter("md");
		//redirect 2次请求   dispatcher 1次请求
		if ("toLogin".equals(md)) {
			toLogin(request,response);
		}else if ("toRegister".equals(md)) {
			toRegister(request,response);
		}else if ("doRegister".equals(md)) {
			doRegister(request,response);
		}else if ("doLogin".equals(md)) {
			doLogin(request,response);
		}else if ("toPortal".equals(md)) {
			toPortal(request,response);
		}
	}
	private void toPortal(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//判断用户是否登陆 如果登陆就转发到protal.jsp 如果没有登陆就转发到login.jsp
		//用session 每一个用户都有一个独立的session对象  我们在登陆的时候如果登陆成功就忘session中存放一个user对象
		User user =(User)request.getSession().getAttribute("USER");
		String path=null;
		if (user!=null) {
			path="/WEB-INF/pages/portal.jsp";
		}else {
			path="/WEB-INF/pages/login.jsp";
		}
		request.getRequestDispatcher(path).forward(request, response);
	}
	private void toRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/pages/register.jsp").forward(request, response);
	}
	//toLogin方法就是进行转发 转发达到login.jsp
	private void toLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//更安全  每次更改后注意重新启动服务器
		request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
	}
	private void doRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		
		String account=request.getParameter("account");
		String password=request.getParameter("password");
		String nickname=request.getParameter("nickname");
		String bdString=request.getParameter("birthday");
		Date birthday=null;
		if(bdString !=null){
			birthday=dateFormat.parse(bdString);
		}
		User user=new User((Integer) null,account,password,nickname,birthday);
		UserService userService=new UserServiceImpl();
		boolean flag=userService.register(user);
		response.sendRedirect(request.getContextPath()+"/UserServlet?md=");
		}
	private void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//接受参数
		String account=request.getParameter("account");
		String password=request.getParameter("password");
		User user =new User((Integer)null,account, password, null, null);
		//调用service层 实现登陆业务
		UserService userService=(UserService) new UserServiceImpl();
		User existUser = userService.login(user);
		if (existUser!=null) {
			//获得一个session对象 每个用户都会有自己的一个session对象
			HttpSession session=request.getSession();
			session.setAttribute("user", existUser);
			request.getRequestDispatcher("/PostServlet?method=toList").forward(request, response);
		}
		else {
			String msg="登陆失败，用户名或者密码错误";
			request.setAttribute("message", msg);
			request.getRequestDispatcher("message.jsp").forward(request, response);
		}
	}
}

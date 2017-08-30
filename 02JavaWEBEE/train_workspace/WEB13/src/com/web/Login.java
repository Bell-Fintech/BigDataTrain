package com.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.User;
import com.service.AccountService;
import com.service.AccountServiceImpl;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    AccountService service = new AccountServiceImpl() ;
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		try {
			//接收页面的参数   account  pwd
			String account = request.getParameter("account");
			String pwd = request.getParameter("pwd");
			//调用service
			User user = service.login(account, pwd);
			if(null!=user){//登录成功
				//将用户信息放在session中
				request.getSession().setAttribute("user", user);
				//跳转页面
				response.sendRedirect(request.getContextPath()+"/index.jsp");
			}else{//登录失败
				response.sendRedirect(request.getContextPath()+"/login.jsp");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.eems.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eems.dao.UserDao;
import com.eems.entity.User;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private UserDao userDao=new UserDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		//处理乱码
//		req.setCharacterEncoding("utf-8");	
		//数据封装
		User user=new User();
		user.setName(req.getParameter("name"));
		user.setPwd(req.getParameter("pwd"));
		//调用相应的业务bean进行业务逻辑处理 并返回结果
		//控制页面的流向，并处理结果
		if(userDao.findAll(user)==true)//登陆成功
		{
			req.getSession().setAttribute("user", user);
			req.getSession().setAttribute("flag", "123");
			
			resp.sendRedirect("index.html");
		}else{//登录失败
			req.setAttribute("message", "用户名或密码不正确");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}

package com.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.ProductServiceImpl;

public class DeletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductServiceImpl service = new ProductServiceImpl();
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//接收id  参数
		String id = request.getParameter("id");
		//调用service
		try {
			int i = service.deleteProductById(id);
			if(i==1){ //删除成功
				request.getRequestDispatcher("/Sercher").forward(request, response);
				//response.sendRedirect("/com.lol/Sercher");
			}else{
				request.getRequestDispatcher("/Sercher").forward(request, response);
				//response.sendRedirect("/com.lol/Sercher");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Product;
import com.service.ProductServiceImpl;

public class Sercher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductServiceImpl service = new ProductServiceImpl();
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		// 接收页面传递过来的参数
		String serch = request.getParameter("sercher");
		try {
			if (null==serch) {// 查询所有商品
				//查询所有的商品信息
				List<Product> list = service.getAllP();
				//将商品信息放在request域中  然后转发到  jsp页面
				request.setAttribute("pList", list);
				//转发
				request.getRequestDispatcher("/products.jsp").forward(request, response);
			} else {// 根据条件查询
				List<Product> list = service.getProductsByName(serch);
				//将商品信息放在request域中  然后转发到  jsp页面
				request.setAttribute("pList", list);
				//转发
				request.getRequestDispatcher("/products.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package zd.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//获取session对象
		HttpSession session = request.getSession();
		//获取session的id
		String id = session.getId();
		System.out.println(id);
		//session中放东西
		session.setAttribute("name", "张丹");
		//半小时存活时间
		session.setMaxInactiveInterval(30*60);
		session.getAttribute("name");
		
	}

}

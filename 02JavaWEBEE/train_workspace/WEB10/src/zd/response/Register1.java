package zd.response;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import service.userService;
import service.userServiceImpl;
import zd.bean.User;

public class Register1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		userService ser=new userServiceImpl();
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		// 使用工具类封装
		try {
			User user = new User();
			// 接收页面的参数
			Map<String, String[]> map = request.getParameterMap();
			BeanUtils.populate(user, map);
			System.out.println(user);
			int i= ser.register(user);
			if(i==1){
				response.sendRedirect("/WEB10/login.html");
			}
			else{
				response.sendRedirect("/WEB10/register.html");
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}
}

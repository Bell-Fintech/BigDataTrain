package zd.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zd.ssm.model.User;
import zd.ssm.service.UserService;

@Controller
public class LoginAction {
	@Resource
	private UserService userService;

	@RequestMapping("/toLogin.shtml")
	public String toLogin() {
		return "login";
	}

	@RequestMapping("/login.shtml")
	public void login(User user, HttpServletResponse response, HttpSession session) throws Exception {
		// userService userService=new UserServiceImpl();
		user = userService.findUserByUsernameAndPassword(user);
		if (user == null) {
			response.getWriter().write("0");
		} else {
			session.setAttribute("user", user);
			response.getWriter().write("1");
		}
	}

	@RequestMapping("/index.shtml")
	public String index() {
		return "index";
	}
}

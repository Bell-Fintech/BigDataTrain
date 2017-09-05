package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	//第一种写法，返回一个ModelAndview对象
	@RequestMapping("/first.shtml")
	public ModelAndView first(HttpServletRequest request, HttpServletResponse response, Integer id) {
		System.out.println(id);
		//操作数据库
		ModelAndView view = new ModelAndView();
		view.addObject("str", "基于注解开发的springmvc");
		view.setViewName("/index.jsp");
		return view;
	}
	//第二种写法,返回字符串即可
	@RequestMapping("/second.shtml")
	public String second(HttpServletRequest request){
		request.setAttribute("str", "处理器的方法返回值是string的时候，代表返回的是真正视图的地址");
		return "/index.jsp";
	}
	////第三种写法，返回void，这里使用的就是原生的servletApi进行开发
	@RequestMapping("/third.shtml")
	public void third(HttpServletRequest request, HttpServletResponse response) throws Exception, IOException{
		request.setAttribute("str", "使用原生的servletApi开发，不需要返回视图");
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}

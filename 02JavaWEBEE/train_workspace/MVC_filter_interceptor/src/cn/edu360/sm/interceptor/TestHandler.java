package cn.edu360.sm.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestHandler {
   @RequestMapping("/test.shtml")
	public String test(){
		System.out.println("我是处理器，我在处理请求");
		return "index";
	}
}

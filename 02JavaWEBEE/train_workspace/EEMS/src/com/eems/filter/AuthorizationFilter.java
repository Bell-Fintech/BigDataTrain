package com.eems.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *用户权限过滤器
 *只能从login.jsp登陆进入
 *
 */
public class AuthorizationFilter implements Filter{

	public void destroy() {
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
	//检查是否登陆的过滤器
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse resp=(HttpServletResponse)response;
//		System.out.println("url:"+req.getRequestURL());
//		System.out.println("uri:"+req.getRequestURI());
		//获取login.jsp字符串  让login.jsp和login过去
//		String path=req.getRequestURL().substring(req.getRequestURL().lastIndexOf("/")+1);
//		System.out.println(path);
//		if("login.jsp".equals(path)||"login".equals(path))
//		{
//			chain.doFilter(request, response);
//			return;
//		}
//		Object obj = req.getSession().getAttribute("user");
//		if(obj==null)
//		{
//			resp.sendRedirect("login.jsp");
//			return;
//		}
//		chain.doFilter(request, response);
		
		Object obj = req.getSession().getAttribute("user");
		//System.out.println("jhuk"+req.getSession().getAttribute("flag"));
		if(obj==null)//session中没有用户信息
		{
			String path=req.getRequestURL().substring(req.getRequestURL().lastIndexOf("/")+1);
			System.out.println(path);
			if(
				"login.jsp".equals(path)||("equipment".equals(path)&&"123".equals(req.getSession().getAttribute("flag")))||"login".equals(path)||
				"login-background.png".equals(path)||"loginBigLogo.png".equals(path)||"loginTitleLogo.png".equals(path)||"animate.min.css".equals(path)||
				"bootstrap.min.css".equals(path)||"font-awesome.min93e3.css".equals(path)||"login.min.css".equals(path)||"style.min.css".equals(path)||
			    "locked.png".equals(path)||"user.png".equals(path)
				)
			{
				chain.doFilter(request, response);
			    return;
			}else{
				resp.sendRedirect("login.jsp");
			}
		}else{
			chain.doFilter(request, response);
		}
		
//		Object obj = req.getSession().getAttribute("user");
//		if(obj==null)//session中没有用户信息
//		{
//			String path=req.getRequestURL().substring(req.getRequestURL().lastIndexOf("/")+1);
//			if(!("login.jsp".equals(path)||"login".equals(path)))
//			{
//				resp.sendRedirect("login.jsp");
//				return;
//			}
//		}
//		chain.doFilter(request, response);
	}
}

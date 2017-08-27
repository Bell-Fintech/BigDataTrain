package com.eems.filter;

import java.io.IOException;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
/*
 * 中文乱码的过滤器
 */
public class CharacterEncodingFilter implements Filter{
	String encoding=null;//编码方式
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	//从web.xml文件中读取encoding的值
	public void init(FilterConfig filterConfig) throws ServletException {
		encoding=filterConfig.getInitParameter("encoding");
		System.out.println(encoding);
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if(encoding==null||"".equals(encoding))
		{
			encoding="utf-8";
		}
		//解决的是post请求
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		chain.doFilter(new HttpServletRequestWrapper((HttpServletRequest) request){
			@Override
			public String getParameter(String name) {
				//对于get请求的特殊处理
				if("get".equals(this.getMethod().toLowerCase()))
				{
					String value=super.getParameter(name);
//					try {
//						String temp=new String(value.getBytes("iso-8859-1"),"utf-8");
//						System.out.println("--"+temp);
//						return temp;
//					} catch (UnsupportedEncodingException e) {
//						e.printStackTrace();
//					}
					return value;
				}
				return super.getParameter(name);
			}
		}, response);
	}	
}

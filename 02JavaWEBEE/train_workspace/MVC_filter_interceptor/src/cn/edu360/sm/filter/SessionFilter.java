package cn.edu360.sm.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	/**
	 * ʹ��filter�����session�Ĺ���
	 */
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain filterChain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		//�ж������·���Ƿ�����Ҫ�����ص�·��,��Щ�ǲ���Ҫ�����ص�
		HttpServletRequest request=(HttpServletRequest)arg0;
        HttpServletResponse response=(HttpServletResponse)arg1;
        //ȡ������·��
        String requestPath=request.getRequestURI();
        if(requestPath.contains("toLogin")||requestPath.contains("login")){
        	//����
        	filterChain.doFilter(request, response);
        }else{
        	HttpSession session=request.getSession(false);
        	String context=request.getContextPath();
        	if(session==null){
        		response.sendRedirect(context+"/toLogin.shtml");
        	}else{
        		if(session.getAttribute("user")!=null){
        			filterChain.doFilter(request, response);
        		}else{
        			response.sendRedirect(context+"/toLogin.shtml");
        		}
        	}
        }
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}

package cn.edu360.sm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SessionInteceptor implements HandlerInterceptor {
	private Logger logger=LoggerFactory.getLogger(SessionInteceptor.class);

	/**
	 * 是在处理器返回视图之后进行处理
	 * 可以在这个方法里面做一个日志的统一处理工作
	 */
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("我是拦截器，afterCompletion是在处理器返回视图之后，进行拦截处理");
		logger.info("客户端的ip地址=="+request.getRemoteAddr()+"请求的路径=="+request.getRequestURI());
		
	}

	/**
	 * 是在处理器处理完毕之后，返回视图之前
	 * 这里可在返回用户前对模型数据进行加工处理，比如这里加入公用信息以便页面显示
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse arg1,
			Object arg2, ModelAndView view) throws Exception {
		view.addObject("path", request.getContextPath());
		System.out.println("我是拦截器，postHandle在处理器返回视图之前，进行拦截处理");
		
		
	}

	/**
	 * 该方法是指请求到达处理器之前，进行拦截的作用
	 * 使用springmvc提供的拦截器的机制来进行session的拦截处理工作
	 */
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		//System.out.println("我是拦截器,prehandler方法是进入处理器之前，我进行了拦截和处理");
		HttpServletRequest request=(HttpServletRequest)arg0;
        HttpServletResponse response=(HttpServletResponse)arg1;
        //取到请求路径
        String requestPath=request.getRequestURI();
        if(requestPath.contains("toLogin")||requestPath.contains("login")){
        	//放行
        	return true;
        }else{
        	HttpSession session=request.getSession(false);
        	String context=request.getContextPath();
        	if(session==null){
        		response.sendRedirect(context+"/toLogin.shtml");
        		return false;
        	}else{
        		if(session.getAttribute("user")!=null){
        			return true;
        		}else{
        			response.sendRedirect(context+"/toLogin.shtml");
        			return false;
        		}
        	}
        }
		
	}

}

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
	 * ���ڴ�����������ͼ֮����д���
	 * �������������������һ����־��ͳһ������
	 */
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("������������afterCompletion���ڴ�����������ͼ֮�󣬽������ش���");
		logger.info("�ͻ��˵�ip��ַ=="+request.getRemoteAddr()+"�����·��=="+request.getRequestURI());
		
	}

	/**
	 * ���ڴ������������֮�󣬷�����ͼ֮ǰ
	 * ������ڷ����û�ǰ��ģ�����ݽ��мӹ���������������빫����Ϣ�Ա�ҳ����ʾ
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse arg1,
			Object arg2, ModelAndView view) throws Exception {
		view.addObject("path", request.getContextPath());
		System.out.println("������������postHandle�ڴ�����������ͼ֮ǰ���������ش���");
		
		
	}

	/**
	 * �÷�����ָ���󵽴ﴦ����֮ǰ���������ص�����
	 * ʹ��springmvc�ṩ���������Ļ���������session�����ش�����
	 */
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		//System.out.println("����������,prehandler�����ǽ��봦����֮ǰ���ҽ��������غʹ���");
		HttpServletRequest request=(HttpServletRequest)arg0;
        HttpServletResponse response=(HttpServletResponse)arg1;
        //ȡ������·��
        String requestPath=request.getRequestURI();
        if(requestPath.contains("toLogin")||requestPath.contains("login")){
        	//����
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

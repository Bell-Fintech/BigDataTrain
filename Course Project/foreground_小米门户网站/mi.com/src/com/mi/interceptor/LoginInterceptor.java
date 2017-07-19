package com.mi.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.mi.domain.Admin;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		
		if(isCheck(request.getRequestURI())){
		    Map session=ai.getInvocationContext().getSession();
		    Admin a=(Admin) session.get("a3");
		    if(a==null){
		    	ActionContext ac=ai.getInvocationContext();
				ac.put("popedom", "Äú»¹Ã»ÓÐµÇÂ¼£¬ÇëµÇÂ¼");
				return Action.LOGIN;
		     }
		}
		return ai.invoke();
		    
	}
	private boolean isCheck(String path){
		if(path.endsWith("/Login")){
			return false;
		}
		return true;
	}

}

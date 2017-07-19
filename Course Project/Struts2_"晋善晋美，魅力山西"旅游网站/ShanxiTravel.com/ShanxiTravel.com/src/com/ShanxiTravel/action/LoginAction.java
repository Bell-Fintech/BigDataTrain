package com.ShanxiTravel.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import com.ShanxiTravel.entity.user;;

public class LoginAction extends ActionSupport implements ModelDriven<user>{
	private user u=new user();
	public user getModel() {
		// TODO Auto-generated method stub
		return u;
	}
  @Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
	  if(u.getUsername().equals("hz")&&u.getPassword().equals("123")&&u.getType().equals("管理员")){
			ActionContext.getContext().getSession().put("loginUser",u.getUsername());
			ActionContext.getContext().getSession().put("loginPass",u.getPassword());
			ActionContext.getContext().getSession().put("loginType",u.getType());
			return SUCCESS;
		}
	  else  if(u.getType().equals("游客")){
			ActionContext.getContext().getSession().put("loginUser",u.getUsername());
			ActionContext.getContext().getSession().put("loginPass",u.getPassword());
			ActionContext.getContext().getSession().put("loginType",u.getType());
			return "ok";
		}
		else{
			ActionContext.getContext().put("error", "错误");
			return ERROR;
		}
}
}

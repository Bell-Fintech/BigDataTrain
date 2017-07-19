package com.mi.action;

import com.mi.dao.impl.UserDaoImpl;
import com.mi.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegistProAction extends ActionSupport {
	private UserDaoImpl userdao = new UserDaoImpl();
	private User user;
	private String rand;
	

	public String execute() throws Exception {
		int result = 0;
		String gRand = (String) ActionContext.getContext().getSession().get("uRand");
		if(gRand.equals(rand)){
			result =  userdao.addUser(user);
			if (result == 2) {
				this.addFieldError("info", "�û����Ѿ�����!");
				return ERROR;
			}
		}else{
			this.addFieldError("info", "��֤���������������!");
			return ERROR;
		}

		return SUCCESS;
	}



	public String getRand() {
		return rand;
	}

	public void setRand(String rand) {
		this.rand = rand;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

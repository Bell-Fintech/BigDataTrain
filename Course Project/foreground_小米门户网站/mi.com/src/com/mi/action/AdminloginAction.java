package com.mi.action;

import org.apache.struts2.ServletActionContext;

import com.mi.domain.Admin;
import com.mi.service.impl.AdminServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class AdminloginAction extends ActionSupport {
	private AdminServiceImpl s = new AdminServiceImpl();
	private Admin admin;
    private String aname;
    private String apassword;
	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApassword() {
		return apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	

	public String login(){
		Admin a3 = s.login(aname,apassword);
		if(a3 == null){
			return LOGIN;
		}else{
			ServletActionContext.getRequest().getSession().setAttribute("a3", a3);
			return SUCCESS;
		}
	}
}

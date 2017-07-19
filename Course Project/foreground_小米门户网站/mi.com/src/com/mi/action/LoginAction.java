package com.mi.action;

import com.mi.dao.impl.UserDaoImpl;
import com.mi.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private User user;
	private UserDaoImpl userdao = new UserDaoImpl();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDaoImpl getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDaoImpl userdao) {
		this.userdao = userdao;
	}

	public String execute() {
		boolean u = userdao.login(user);
		if (u == true) {
			int uid = userdao.findIdByUname(user.getUname());
			ActionContext.getContext().getSession().put("uname", user.getUname());
			ActionContext.getContext().getSession().put("uid", uid);
			return SUCCESS;
		} else {
			addFieldError("loginerror", "用户名或密码错误!");
			return INPUT;
		}
	}
}

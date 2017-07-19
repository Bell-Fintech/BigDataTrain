package com.ShanxiTravel.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ShanxiTravel.entity.user;
import com.ShanxiTravel.service.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class ManagerUserAction extends ActionSupport {
	/**
	 * 
	 */
	user u=new user();
	private List<user> userList=new ArrayList<user>();
	private String username;
	private String password;
	private String surepass;
	private String type;
	private String phone;
	private String email;
	public user getU() {
		return u;
	}

	public void setU(user u) {
		this.u = u;
	}

	public List<user> getUserList() {
		return userList;
	}

	public void setUserList(List<user> userList) {
		this.userList = userList;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSurepass() {
		return surepass;
	}

	public void setSurepass(String surepass) {
		this.surepass = surepass;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//添加书籍信息
	public String addUser(){
		u.setUsername(username);
		u.setPassword(password);
		u.setSurepass(surepass);
		u.setType(type);
		u.setPhone(phone);
	    u.setEmail(email);
		UserServiceImpl ss=new UserServiceImpl();
		ss.addOne(u);
		return "addUserOK";
	}
	
	public String findAllUsers(){
		UserServiceImpl bs=new UserServiceImpl();
		userList=bs.findAll();
		return "UserListOK";
	}
	
	
	public String findPartNameUsers(){
		UserServiceImpl bs=new UserServiceImpl();
		userList=bs.findByName(username);
		return "UserListOK";
	}
	public String findNameUsers(){
		UserServiceImpl bs=new UserServiceImpl();
		u=bs.findByUsername(username);
		return "UserListOK";
	}
	public String findTypeUsers(){
		UserServiceImpl bs=new UserServiceImpl();
		userList=bs.findByType(type);
		return "UserListOK";
	}
	//修改景点信息方法
	public String updateUser() throws IOException{
		UserServiceImpl bs=new UserServiceImpl();
		//先找到对应的才能修改
		u=bs.findByUsername(username);
		u.setUsername(username);
		u.setPassword(password);
		u.setSurepass(surepass);
		u.setType(type);
		u.setPhone(phone);
	    u.setEmail(email);
		bs.updateByUsername(u);
		ActionContext.getContext().getSession().put("u",u);
		return "updateOK";
	}
	
	//删景点信息方法
	public String deleteUser(){
		UserServiceImpl bs=new UserServiceImpl();
		//先找到对应的才能修改
		u=bs.findByUsername(username);
		bs.deleteUser(u);
		//因为findById找到的是一个对象，所以不能返回空或者其他
		//bs.deleteById(u.getId());
		//删除后，应该查找所有
		userList=bs.findAll();
		ActionContext.getContext().getSession().put("u",userList);
		return "deleteOK";
	}
}

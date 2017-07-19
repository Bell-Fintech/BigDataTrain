package com.ShanxiTravel.entity;

import java.sql.Timestamp;

/**
 * City entity. @author MyEclipse Persistence Tools
 */

public class user implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7906025936629221L;
	
	private String username;
	private String password;
	private String surepass;
	private String type;
	private String phone;
	private String email;

	// Constructors

	/** default constructor */
	public user() {
	}

	public user(String username, String password, String surepass, String type, String phone, String email) {
		super();
		this.username = username;
		this.password = password;
		this.surepass = surepass;
		this.type = type;
		this.phone = phone;
		this.email = email;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	// Property accessors

	
}
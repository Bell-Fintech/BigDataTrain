package com.mi.domain;

public class Cart {

	private int carid;
	private int uid;
	private int pid;
	private int cpamount;
	private int price;
	private String name;
	
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public int getCpamount() {
		return cpamount;
	}
	
	
	public void setCpamount(int cpamount) {
		this.cpamount = cpamount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

package com.eems.entity;

public class IsScrap {
	private int id;
	private String value;//是否报废值
	public IsScrap() {
	}
	public IsScrap(int id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}

package com.eems.entity;

public class EquipmentStatus {
	private int id;
	private String value;//设备状态值
	public EquipmentStatus() {
	}
	public EquipmentStatus(int id, String value) {
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

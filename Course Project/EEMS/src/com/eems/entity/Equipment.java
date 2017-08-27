package com.eems.entity;

public class Equipment {
	private int equipmentNo;//设备编号
	private String equipmentName;//设备名称
	private String person;//领用人
	private int equipmentTypeId;//设备类型id
	private int equipmentStatusId;//设备状态id
	private int isScrapId;//是否报废id
	public Equipment() {
	}
	public Equipment(int equipmentNo, String equipmentName, String person,
			int equipmentTypeId, int equipmentStatusId, int isScrapId) {
		super();
		this.equipmentNo = equipmentNo;
		this.equipmentName = equipmentName;
		this.person = person;
		this.equipmentTypeId = equipmentTypeId;
		this.equipmentStatusId = equipmentStatusId;
		this.isScrapId = isScrapId;
	}
	public int getEquipmentNo() {
		return equipmentNo;
	}
	public void setEquipmentNo(int equipmentNo) {
		this.equipmentNo = equipmentNo;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public int getEquipmentTypeId() {
		return equipmentTypeId;
	}
	public void setEquipmentTypeId(int equipmentTypeId) {
		this.equipmentTypeId = equipmentTypeId;
	}
	public int getEquipmentStatusId() {
		return equipmentStatusId;
	}
	public void setEquipmentStatusId(int equipmentStatusId) {
		this.equipmentStatusId = equipmentStatusId;
	}
	public int getIsScrapId() {
		return isScrapId;
	}
	public void setIsScrapId(int isScrapId) {
		this.isScrapId = isScrapId;
	}
	
}

package com.ShanxiTravel.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class count implements java.io.Serializable {
    String spotName;
    int aHitCount;
	public String getSpotName() {
		return spotName;
	}
	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}
	public int getaHitCount() {
		return aHitCount;
	}
	public void setaHitCount(int aHitCount) {
		this.aHitCount = aHitCount;
	}
	public count() {
		super();
		// TODO Auto-generated constructor stub
	}
	public count(String spotName, int aHitCount) {
		super();
		this.spotName = spotName;
		this.aHitCount = aHitCount;
	}
    
}
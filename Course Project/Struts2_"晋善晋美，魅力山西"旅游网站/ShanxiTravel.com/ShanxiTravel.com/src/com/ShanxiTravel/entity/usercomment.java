package com.ShanxiTravel.entity;

import java.sql.Timestamp;

/**
 * Spotcomment entity. @author MyEclipse Persistence Tools
 */

public class usercomment implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1461730574165178548L;
	
	private String id;
	private String mainspotId;
	private String content;
	private Timestamp contentDate;

	// Constructors

	/** default constructor */
	public usercomment() {
	}



	public usercomment(String id, String mainspotId, String content, Timestamp contentDate) {
		super();
		this.id = id;
		this.mainspotId = mainspotId;
		this.content = content;
		this.contentDate = contentDate;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getMainspotId() {
		return mainspotId;
	}



	public void setMainspotId(String mainspotId) {
		this.mainspotId = mainspotId;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public Timestamp getContentDate() {
		return contentDate;
	}



	public void setContentDate(Timestamp contentDate) {
		this.contentDate = contentDate;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public void setImageInfo(mainspot spot) {
		// TODO Auto-generated method stub
		
	}




}
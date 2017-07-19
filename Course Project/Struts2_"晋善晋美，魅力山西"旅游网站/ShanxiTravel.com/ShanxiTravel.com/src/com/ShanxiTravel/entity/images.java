package com.ShanxiTravel.entity;

/**
 * Images entity. @author MyEclipse Persistence Tools
 */

public class images implements java.io.Serializable {

	private static final long serialVersionUID = 2946547722666686212L;
	
	private Long id;
	private String name;
	private String path;
	
	public images(Long id) {
		this.id = id;
	}

	// Constructors

	/** default constructor */
	public images() {
	}

	/** minimal constructor */
	public images(String name, String path, Byte type) {
		this.name = name;
		this.path = path;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}


	public String getFullPath(){
		return path+name;
	}
}
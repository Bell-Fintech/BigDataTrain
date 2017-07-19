package com.mi.domain;

import java.util.Date;

public class Announce {
	private int aid;//主键 
	private String acontent;//公告内容
	private Date acontenttime;//发布公告时间
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAcontent() {
		return acontent;
	}
	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}
	public Date getAcontenttime() {
		return acontenttime;
	}
	public void setAcontenttime(Date acontenttime) {
		this.acontenttime = acontenttime;
	}
}

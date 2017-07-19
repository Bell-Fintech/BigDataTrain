package com.mi.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.opensymphony.xwork2.ActionSupport;

public class Product extends ActionSupport implements Serializable {
     private int pid;//��Ʒid
     private String name;//��Ʒ��
     private String note;//��Ʒ����
     private int price;//��Ʒ�۸�
     private int pamount;//��Ʒ����
     private String photo;//��ƷͼƬ·��
     private String type;//��Ʒ����
     private String location;//��Ʒλ��
     private String detailsphoto;//����ͼƬ
     
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", note=" + note
				+ ", price=" + price + ", pamount=" + pamount + ", photo="
				+ photo + ", type=" + type + "]";
	}
	public int getPid() {
		return pid;
	}
	 public void setPid(int pid) {
		this.pid = pid;
	}
	 public String getName() {
		return name;
	}
	 public void setName(String name) {
	 	this.name = name;
	}
	 public String getNote() {
		return note;
	}
	 public void setNote(String note) {
		this.note = note;
	}
	 public int getPrice() {
		return price;
	}
	 public void setPrice(int price) {
		this.price = price;
	}
	 public int getPamount() {
		return pamount;
	}
	 public void setPamount(int pamount) {
		this.pamount = pamount;
	}
	 public String getPhoto() {
		return photo;
	}
	 public void setPhoto(String photo) {
		this.photo = photo;
	}
	 public String getType() {
		return type;
	}
	 public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDetailsphoto() {
		return detailsphoto;
	}
	public void setDetailsphoto(String detailsphoto) {
		this.detailsphoto = detailsphoto;
	}

	
//	public String toString() {
//		return "Product [pid=" + pid + ", name=" + name + ", note=" + note
//				+ ", price=" + price + ", pamount=" + pamount + ", photo="
//				+ photo + ", type=" + type + ", ptime=" + ptime + "]";
//	}
     
}

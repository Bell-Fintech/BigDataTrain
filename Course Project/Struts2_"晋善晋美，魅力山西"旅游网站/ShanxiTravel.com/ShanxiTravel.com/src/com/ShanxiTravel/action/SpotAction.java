package com.ShanxiTravel.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ShanxiTravel.entity.mainspot;
import com.ShanxiTravel.entity.images;
import com.ShanxiTravel.service.SpotServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



public class SpotAction extends ActionSupport {
	mainspot spot=new mainspot();
	images image=new images(); 
	private List<mainspot> SpotList=new ArrayList<mainspot>();
	private String spotId;
	private  String spotName;
	private String spotCity;
	private String spotType;
	private int  spotPrice;
	private String spotEditorial;
	private String spotRoute;
    private File upload;
	private String uploadFileName;
	private String uploadContentType;
	private String savePath;
	private Long imageID;

	public Long getImageID() {
		return imageID;
	}
	public void setImageID(Long imageID) {
		this.imageID = imageID;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	
	public mainspot getSpot() {
		return spot;
	}
	public void setSpot(mainspot spot) {
		this.spot = spot;
	}
	public images getImage() {
		return image;
	}
	public void setImage(images image) {
		this.image = image;
	}
	public List<mainspot> getSpotList() {
		return SpotList;
	}
	public void setSpotList(List<mainspot> spotList) {
		SpotList = spotList;
	}

	public String getSpotId() {
		return spotId;
	}
	public void setSpotId(String spotId) {
		this.spotId = spotId;
	}
	public String getSpotName() {
		return spotName;
	}
	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}
	public String getSpotCity() {
		return spotCity;
	}
	public void setSpotCity(String spotCity) {
		this.spotCity = spotCity;
	}
	public String getSpotType() {
		return spotType;
	}
	public void setSpotType(String spotType) {
		this.spotType = spotType;
	}
	public int getSpotPrice() {
		return spotPrice;
	}
	public void setSpotPrice(int spotPrice) {
		this.spotPrice = spotPrice;
	}
	public String getSpotEditorial() {
		return spotEditorial;
	}
	public void setSpotEditorial(String spotEditorial) {
		this.spotEditorial = spotEditorial;
	}
	public String getSpotRoute() {
		return spotRoute;
	}
	public void setSpotRoute(String spotRoute) {
		this.spotRoute = spotRoute;
	}
	//添加书籍信息
	public String addSpot() throws Exception{
		spot.setId(spotId);
		spot.setName(spotName);
		spot.setCity(spotCity);
		spot.setType(spotType);
		spot.setPrice(spotPrice);
		spot.setEditorial(spotEditorial);
		spot.setRoute(spotRoute);
	    spot.setImage(imageID);//外键
		image.setId(imageID);//主键
		
		
		FileInputStream fis=new FileInputStream(upload);
	    //输出流  
	    //上传两次一样的都会成功且显示两个，所以解决覆盖问题
	    FileOutputStream fos=new FileOutputStream(savePath+uploadFileName);
	    //字节为单位上传
	    byte[] buffer=new byte[1024];
	    //定义长度
	    int len=0;
	    //从0开始
	    while((len=fis.read(buffer))>0){
	    	   fos.write(buffer, 0, len);
	       }
		image.setName(uploadFileName);
		image.setPath(savePath);

		SpotServiceImpl ss=new SpotServiceImpl();
		ss.addImage(image);
		ss.addOne(spot);
		return "addSpotListOK";
	}
	
	public String findAllSpots(){
		SpotServiceImpl bs=new SpotServiceImpl();
		SpotList=bs.findAll();
		return "SpotListOK";
	}
	
	
	public String findPartNameSpots(){
		SpotServiceImpl bs=new SpotServiceImpl();
		SpotList=bs.findByName(spotName);
		return "SpotListOK";
	}
	public String findCitySpots(){
		SpotServiceImpl bs=new SpotServiceImpl();
		SpotList=bs.findByCity(spotCity);
		return "SpotListOK";
	}
	public String findTypeSpots(){
		SpotServiceImpl bs=new SpotServiceImpl();
		SpotList=bs.findByType(spotType);
		return "SpotListOK";
	}
	public String findRouteSpots(){
		SpotServiceImpl bs=new SpotServiceImpl();
		SpotList=bs.findByRoute(spotRoute);
		return "SpotListOK";
	}
	//修改景点信息方法
	public String updateSpot() throws IOException{
		
		
		
		SpotServiceImpl bs=new SpotServiceImpl();
		
		//先找到对应的才能修改
		spot=bs.findById(spotId);
				
		spot.setId(spotId);
		spot.setName(spotName);
		spot.setCity(spotCity);
		spot.setType(spotType);
		spot.setPrice(spotPrice);
		spot.setEditorial(spotEditorial);
		spot.setRoute(spotRoute);
	    spot.setImage(imageID);//外键
		image.setId(imageID);//主键
		
		
		FileInputStream fis=new FileInputStream(upload);
	    //输出流  
	    //上传两次一样的都会成功且显示两个，所以解决覆盖问题
	    FileOutputStream fos=new FileOutputStream(savePath+uploadFileName);
	    //字节为单位上传
	    byte[] buffer=new byte[1024];
	    //定义长度
	    int len=0;
	    //从0开始
	    while((len=fis.read(buffer))>0){
	    	   fos.write(buffer, 0, len);
	       }
		image.setName(uploadFileName);
		image.setPath(savePath);

		
		
		bs.updateById(spot);
		bs.addImage(image);
		ActionContext.getContext().getSession().put("Spot",spot);
		ActionContext.getContext().getSession().put("Spot1",SpotList);
		return "updateOK";
	}
	
	//删景点信息方法
	public String deleteSpot(){
		
		SpotServiceImpl bs=new SpotServiceImpl();
		//先找到对应的才能修改
		spot=bs.findById(spotId);
		
		bs.deleteSpot(spot);
		//因为findById找到的是一个对象，所以不能返回空或者其他
		//bs.deleteById(spot.getId());
		//删除后，应该查找所有
		SpotList=bs.findAll();
		ActionContext.getContext().getSession().put("Spot",SpotList);
		
		return "deleteOK";
	}
	
	
	
	
}

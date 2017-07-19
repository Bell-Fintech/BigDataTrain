package com.mi.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.mi.domain.Product;
import com.mi.service.impl.ProductServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class ProductAction extends ActionSupport {
	 private ProductServiceImpl s = new ProductServiceImpl();
     private Product product;
 	 private List<Product> ProductList;
 	 private int p=1;
     private int lastpage;
 	//文件的上传的东西
     private File image;
     private int pid;
	 private String imageFileName;
     public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getLastpage() {
		return lastpage;
	}
	public void setLastpage(int lastpage) {
		this.lastpage = lastpage;
	}
	public List<Product> getProductList() {
		return ProductList;
	}
	public void setProductList(List<Product> productList) {
		ProductList = productList;
	}

 	 public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	private String imageContentType;

    public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getImageContentType() {
		return imageContentType;
	}
	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}
	
    public String listProduct(){
    	 this.ProductList = s.findAllProduct();
    	 return SUCCESS;
    }
    
	 public String editProduct(){
		 boolean flag = false;
		if(image != null){
			String storePath = ServletActionContext.getServletContext().getRealPath("/img");
			product.setPhoto("img/"+imageFileName);
	  		try {
	 			FileUtils.copyFile(image, new File(storePath+"\\"+imageFileName));
	 		} catch (IOException e) {
	 			e.printStackTrace();
	 		}
	  		flag = true;
		}
		s.editProduct(product, flag);
		return "editOK";
	 }
     
     public String  addProduct(){
    	//单独处理photo
 		//得到img存放目录的真实路径
 		String storePath = ServletActionContext.getServletContext().getRealPath("/img");
 		//计算存放的子路径
 	    product.setPhoto("img/"+imageFileName);
 		//文件上传
 		try {
			FileUtils.copyFile(image, new File(storePath+"\\"+imageFileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
 		s.addProduct(product);
 		return "addOK";
     }
     
     public String delProduct(){
 		s.delProduct(pid);
 		return "delOk";
 	}
     
 	
 	public String findAll(){
 		int pageSize = 6;
 		int listLength=s.findAllProduct().size();
 		if(listLength == 0){
 			return SUCCESS;
 		}
 		if(listLength%pageSize==0){
 			lastpage=listLength/pageSize;
 		}else{
 			lastpage=listLength/pageSize+1;
 		}
 	
 		if(this.getP()<1)
 			this.p=1;
 		if(this.getP()>lastpage)
 			this.p=lastpage;
 		
 		ProductList=new ArrayList<Product>();
 	    ProductList=s.findALL(this.p, pageSize);	

 		return SUCCESS;
 	}
 	
	 public String findProductById(){
		this.product = s.findProductById(pid);
		return SUCCESS;
	 }
}

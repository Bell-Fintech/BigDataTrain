package com.mi.action;

import java.util.List;

import com.mi.domain.Announce;
import com.mi.domain.Product;
import com.mi.service.impl.AnnounceServiceImpl;
import com.mi.service.impl.ProductServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MainPageAction extends ActionSupport{
	private AnnounceServiceImpl as; 
	private ProductServiceImpl ps;
	private List<Product> ProductList1;
	private List<Product> ProductList2;
	private List<Announce> announce;
	
	private ProductServiceImpl s;
	
	public MainPageAction() {
		this.ps = new ProductServiceImpl();
		this.as = new AnnounceServiceImpl();
	}
	
	public String execute(){
	 this.announce = as.findAllAnnounce();
   	 this.ProductList1 = ps.findAllProductByLocation("star");
   	 this.ProductList2 = ps.findAllProductByLocation("intelligent");
   	 
   	 return SUCCESS;
   }

	public List<Product> getProductList1() {
		return ProductList1;
	}

	public void setProductList(List<Product> productList1) {
		this.ProductList1 = productList1;
	}

	public List<Product> getProductList2() {
		return ProductList2;
	}

	public void setProductList2(List<Product> productList2) {
		this.ProductList2 = productList2;
	}
	
	public List<Announce> getAnnounce() {
		return announce;
	}

	public void setAnnounce(List<Announce> announce) {
		this.announce = announce;
	}
	
	
}

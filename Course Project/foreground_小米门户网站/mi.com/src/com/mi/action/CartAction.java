package com.mi.action;

import java.util.ArrayList;
import java.util.List;

import com.mi.dao.impl.CartDaoImpl;
import com.mi.domain.Cart;
import com.mi.domain.Product;
import com.mi.service.impl.ProductServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport{
	private int uid;
	private int pid;
	private CartDaoImpl cartdao = new CartDaoImpl();
	private ProductServiceImpl s = new ProductServiceImpl();
	private int allmoney;
	private int cartsize;
	private List<Cart> cart = new ArrayList<Cart>();
	
	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}

	public List<Cart> getCart() {
		return cart;
	}


	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	public int getAllmoney() {
		return allmoney;
	}


	public void setAllmoney(int allmoney) {
		this.allmoney = allmoney;
	}


	
	public int getCartsize() {
		return cartsize;
	}


	public void setCartsize(int cartsize) {
		this.cartsize = cartsize;
	}


	public String findCart(){
		if(ActionContext.getContext().getSession().get("uid")==null) return ERROR;
		this.uid = (Integer) ActionContext.getContext().getSession().get("uid");
		this.cart = cartdao.findCart(uid);
		this.allmoney = 0;
		for(Cart c:cart){
			pid = c.getPid();
			Product product = s.findProductById(pid);
			c.setPrice(product.getPrice());
			c.setName(product.getName());
			this.allmoney += product.getPrice();
		}
		this.cartsize = this.cart.size();
		return SUCCESS;
	}
	
	public String addCart(){
		this.uid = (Integer) ActionContext.getContext().getSession().get("uid");
		cartdao.addCart(uid, pid);	
		return SUCCESS;
	}
	
	
	public String delCart(){
		this.uid = (Integer) ActionContext.getContext().getSession().get("uid");
		cartdao.delCart(uid,pid);
		return SUCCESS;
	}
}

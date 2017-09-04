package zd.vo;

import zd.model.Items;
import zd.model.Orders;
import zd.model.Posts;

public class OrdersVo {
	private Items items;
	private Orders orders;
	private Posts posts;
	
	public Posts getPosts() {
		return posts;
	}
	public void setPosts(Posts posts) {
		this.posts = posts;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	
	

}

package zd.model;

public class Items {
	private int items_id;
	private String items_name;
	private String price;
	public int getItems_id() {
		return items_id;
	}
	public void setItems_id(int items_id) {
		this.items_id = items_id;
	}
	public String getItems_name() {
		return items_name;
	}
	public void setItems_name(String items_name) {
		this.items_name = items_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Items [items_id=" + items_id + ", items_name=" + items_name
				+ ", price=" + price + "]";
	}
	
	
	

}

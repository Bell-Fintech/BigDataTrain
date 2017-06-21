
/*
 5、类和对象使用题
写一个程序，模拟生成5个商品对象，比如：
 商品对象1：
    id=“pdt_001”
    name = “小米5sPlus”
    price = 1999.00

然后模拟生成一个订单对象，比如
   订单1：
      id="order_001"
      username = "远哥"
      items = [商品对象1，商品对象2，商品对象3，商品对象4]
      amount = <各商品价格累加>
      payment = <按照题4中描述的规则计算>

然后，在程序中打印该订单的所有信息；
*/

class ZdTest5{
	public static void main(String[] args){
		Itemm item1=new Itemm(1,"小米",1000);
		Itemm item2=new Itemm(2,"vivo",2000);
		Itemm item3=new Itemm(3,"oppo",3000);
		Itemm item4=new Itemm(4,"华为",4000);
		Itemm item5=new Itemm(5,"三星",5000);
		item1.showItem();
		item2.showItem();
		item3.showItem();
		item4.showItem();
		item5.showItem();
		Itemm[] items={item1,item2,item3,item4,item5};
		
		OrderItem order=new OrderItem();
		order.setId(1);
		order.setUsername("zd");
		order.setItems(items);
		order.setAmount(order.getAmount());
		order.setPayment(order.getPayment());
		order.showOrder();
	}
}
class OrderItem{
	private int id;
	private String username;
	private Itemm[] items;
	private int amount;
	private int payment;
	public OrderItem(){
	}
	public OrderItem(int id,String username,Itemm[] items,int amount,int payment){
		this.id=id;
		this.username=username;
		this.items=items;
		this.amount=amount;
		this.payment=payment;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Itemm[] getItems() {
		return items;
	}
	public void setItems(Itemm[] items) {
		this.items = items;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public int  getAmount(){
		this.amount=0;
		for(int i=0;i<items.length;i++){
			this.amount+=items[i].price;
		}
		return this.amount;
	} 
	public int  getPayment(){
		if(this.amount>=0&&this.amount<=99){
			this.payment=this.amount;
		}else if(this.amount>99&&this.amount<=199){
			this.payment=(int) (this.amount*0.9);
		}else if(this.amount>=200){
			this.payment=(int) (this.amount*0.8);
		}else{
			System.out.println("Order's amount is not true");
		}
		return this.payment;
	} 
	public void showOrder(){
		System.out.println("Order's id="+id+",username="+username+",amount="+amount+",payment="+payment);
	}
}
class Itemm{
	private int id;
	private String name;
	public int price;
	public Itemm(){
	}
	public Itemm(int id,String name,int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void showItem(){
		System.out.println("Item's id="+id+",name="+name+",price="+price);
	}
}

/*
4、复杂类定义题
写一个订单类，用来描述用户生成的订单Order，订单包含以下属性：
   订单id   订单所属的用户名username  商品数组items（数组中存放的是多个商品对象）
   订单总金额amount（不能让调用者直接赋值，应该在内部自动计算!!! 订单总金额=商品数组中各商品价格的总和）
   订单实际应支付额payment
     （不能让调用者直接赋值，应该在内部自动计算!!!
      实际应支付额的计算逻辑：
       如果 订单总金额 在[0-99] 之间，则应支付额=总金额
       如果 订单总金额 在[100-99] 之间，则应支付额=总金额*0.9
       如果 订单总金额 在[199-200] 之间，则应支付额=总金额*0.85
       如果 订单总金额  >200，则应支付额=总金额*0.8）*/
class ZdTest4{
	public static void main(String[] args){
		Item item1=new Item(513,"computer",14000);
		Item item2=new Item(950,"mobile",4000);
		item1.showItem();
		item2.showItem();
		Item[] items={item1,item2};
		
		Order order=new Order();
		order.setId(1);
		order.setUsername("zd");
		order.setItems(items);
		order.setAmount(order.getAmount());
		order.setPayment(order.getPayment());
		order.showOrder();
	}
}
class Order{
	private int id;
	private String username;
	private Item[] items;
	private int amount;
	private int payment;
	public Order(){
	}
	public Order(int id,String username,Item[] items,int amount,int payment){
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
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
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
class Item{
	private int id;
	private String name;
	public int price;
	public Item(){
	}
	public Item(int id,String name,int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void showItem(){
		System.out.println("Item's id="+id+",name="+name+",price="+price);
	}
}

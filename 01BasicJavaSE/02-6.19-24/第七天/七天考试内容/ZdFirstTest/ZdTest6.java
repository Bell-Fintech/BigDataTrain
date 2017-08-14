
/*
 6、扩展提升题（对以上订单模型进行增强）
再写一个类描述客户Customer，客户包含以下属性：
   客户名称username
   客户等级（等级的值可以是“至尊钻石VIP”“尊享白金VIP”“普通客户”）

然后将题4中的订单类的username属性改成用客户对象来表示,其他属性与题4一致，即：
   订单id
   订单所属用户，如 Customer c;
   商品数组items（数组中存放的是多个商品对象）
   订单总金额amount（订单总金额=商品数组中各商品价格的总和）
   订单实际应支付额payment（改变之前逻辑：在之前的总金额打折基础上，
   根据客户的等级再打折，比如：至尊钻石VIP叠加一个8折，尊享白金vip叠加一个9折，普通客户不叠加折扣）
然后写程序模拟创建几个商品，一个订单，然后打印订单信息
（扩展需求：可以通过调用订单对象上的一个自定义方法直接获取该订单中最贵的商品）*/
class ZdTest6{
	public static void main(String[] args){
		Itemmer item1=new Itemmer(1,"小米",1000);
		Itemmer item2=new Itemmer(2,"vivo",2000);
		Itemmer item3=new Itemmer(3,"oppo",3000);
		Itemmer item4=new Itemmer(4,"华为",4000);
		Itemmer item5=new Itemmer(5,"三星",5000);
		item1.showItem();
		item2.showItem();
		item3.showItem();
		item4.showItem();
		item5.showItem();
		Itemmer[] items={item1,item2,item3,item4,item5};
		
		
		Orders order=new Orders();
		order.setId(1);
		order.setC(new Customer("zd","至尊钻石VIP"));
		order.setItems(items);
		order.setAmount(order.getAmount());
		order.setPayment(order.getPayment());
		order.showOrder();
		order.max(items);
	}
}
class Orders{
	private int id;
	private Customer c=new Customer();
	private Itemmer[] items;
	private int amount;
	private int payment;
	public Orders(){
	}
	
	
	public Orders(int id, Customer c, Itemmer[] items, int amount, int payment) {
		this.id = id;
		this.c = c;
		this.items = items;
		this.amount = amount;
		this.payment = payment;
	}

 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	public Itemmer[] getItems() {
		return items;
	}
	public void setItems(Itemmer[] items) {
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
		// 根据客户的等级再打折，比如：至尊钻石VIP叠加一个8折，尊享白金vip叠加一个9折，普通客户不叠加折扣）
		if(this.c.getType()=="至尊钻石VIP"){
			discount();
			return (int) (this.payment*0.8);
		}
		else if(this.c.getType()=="尊享白金vip"){
			discount();
			return (int) (this.payment*0.9);
		}
		else{
			discount();
			return this.payment;
		}
	} 
	public void showOrder(){
		System.out.println("Order's id="+id+",username="+c.getUsername()+",amount="+amount+",payment="+payment);
	}
	public void discount(){
		if(this.amount>=0&&this.amount<=99){
			this.payment=this.amount;
		}else if(this.amount>99&&this.amount<=199){
			this.payment=(int) (this.amount*0.9);
		}else if(this.amount>=200){
			this.payment=(int) (this.amount*0.8);
		}else{
			System.out.println("Order's amount is not true");
		}
	}
	public void max(Itemmer[] items){
		Itemmer it=new Itemmer();
		int max=items[0].price;
		int i=0;
		for (i=0;i<items.length;i++){
			if(items[i].price>max)
			  max=items[i].price;
			  it=items[i];
		}
		System.out.println("max item is:"+"id="+it.getId()+",name="+it.getName()+",price="+it.getPrice());
		
	}
}
class Itemmer{
	private int id;
	private String name;
	public int price;
	public Itemmer(){
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Itemmer(int id,String name,int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void showItem(){
		System.out.println("Item's id="+id+",name="+name+",price="+price);
	}
}
class Customer{
	private String username;
	private String type;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Customer() {
	}
	public Customer(String username, String type) {
		this.username = username;
		this.type = type;
	}
	
	  
}

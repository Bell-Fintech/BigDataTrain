/*
4、复杂类定义题
写一个订单类，用来描述用户生成的订单Order，订单包含以下属性：
   订单id
   订单所属的用户名username
   商品数组items（数组中存放的是多个商品对象）
   订单总金额amount（不能让调用者直接赋值，应该在内部自动计算!!! 订单总金额=商品数组中各商品价格的总和）
   订单实际应支付额payment
     （不能让调用者直接赋值，应该在内部自动计算!!!
      实际应支付额的计算逻辑：
       如果 订单总金额 在[0-99] 之间，则应支付额=总金额
       如果 订单总金额 在[100-199] 之间，则应支付额=总金额*0.9
       如果 订单总金额  >=200，则应支付额=总金额*0.8）
*/
class Order{
	private String id;
	private String username;
	private Item[] items;
	private float amount;
	private float payment;
	
	public Order(){
		
	}
	public Order(String id,String username,Item[] items){
		this.id = id;
		this.username = username;
		this.items = items;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return username;
	}
	public void setItems(Item[] items){
		this.items = items;
	}
	public Item[] getItems(){
		return items;
	}
	public float getAmount(){
		//计算所有商品的价格
		float sum = 0;
		for(int i=0; i<items.length; i++){
			sum += items[i].getPrice();
		}
		return sum;
	}
	public float getPayment(){
		float money = getAmount();
		if(money>=0 && money<=99){
			return money;
		}else if(money >=100 && money<=199){
			return money*0.9f;
		}else{
			return money*0.8f;
		}
	}
	
	public void show(){
		System.out.println("订单号："+getId());
		System.out.println("订单买家："+getUsername());
		for(int i=0; i<items.length; i++){
			items[i].show();
		}
		System.out.println("订单应付金额："+getAmount());
		System.out.println("订单实付金额："+getPayment());
	}
}
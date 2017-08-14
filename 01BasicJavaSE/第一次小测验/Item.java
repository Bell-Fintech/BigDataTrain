/*
3、简单类定义题
写一个类，用来描述商品Item，商品包含以下属性：
   商品id
   商品名称
   商品单价
*/
class Item{
	//商品id
	private String id;
	//商品名称
	private String pName;
	//商品单价
	private float price;
	
	public Item(){
		
	}
	public Item(String id,String pName,float price){
		this.id = id;
		this.pName = pName;
		this.price = price;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setPName(String pName){
		this.pName = pName;
	}
	public String getPName(){
		return pName;
	}
	public void setPrice(float price){
		this.price = price;
	}
	public float getPrice(){
		return price;
	}
	
	public void show(){
		System.out.println("商品单号："+id+",商品名称："+pName+",商品单价："+price);
	}
}
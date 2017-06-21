/*
3、简单类定义题
写一个类，用来描述商品Item，商品包含以下属性：
   商品id
   商品名称
   商品单价
*/
class ZdTest3{
	public static void main(String[] args){
		Item item=new Item(513,"computer",14000);
		item.show();
	}
}
class Item{
	private int id;
	private String name;
	private int price;
	public Item(){
	}
	public Item(int id,String name,int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void show(){
		System.out.println("Item's id="+id+",name="+name+",price="+price);
	}
}
/*
3�����ඨ����
дһ���࣬����������ƷItem����Ʒ�����������ԣ�
   ��Ʒid
   ��Ʒ����
   ��Ʒ����
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
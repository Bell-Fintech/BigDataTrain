class MobileDemo{
	public static void main(String[] args){
	Mobile mo=new Mobile();
	mo.show();
	Mobile mo1=new Mobile("oppo",3500);
	mo1.show();
	mo1.setName("Huawei");
	mo1.show();
	Mobile mo2=new Mobile();
	mo2.setName("vivo");
	mo2.setPrice(2500);
	mo2.show();
	}
}
class Mobile{
	private String name="apple";
	private int price=5000;
	public Mobile(){
		System.out.println("�����޲εĹ��췽��");
	}
	public Mobile(String name,int price){
		this.name=name;
		this.price=price;
		System.out.println("�����вεĹ��췽��");
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	public void show(){
		System.out.println("mobile's name="+name+",price="+price);
	}
}
/*
3�����ඨ����
дһ���࣬����������ƷItem����Ʒ�����������ԣ�
   ��Ʒid
   ��Ʒ����
   ��Ʒ����
*/
class Item{
	//��Ʒid
	private String id;
	//��Ʒ����
	private String pName;
	//��Ʒ����
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
		System.out.println("��Ʒ���ţ�"+id+",��Ʒ���ƣ�"+pName+",��Ʒ���ۣ�"+price);
	}
}
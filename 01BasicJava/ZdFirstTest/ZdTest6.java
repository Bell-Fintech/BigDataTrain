
/*
 6����չ�����⣨�����϶���ģ�ͽ�����ǿ��
��дһ���������ͻ�Customer���ͻ������������ԣ�
   �ͻ�����username
   �ͻ��ȼ����ȼ���ֵ�����ǡ�������ʯVIP��������׽�VIP������ͨ�ͻ�����

Ȼ����4�еĶ������username���Ըĳ��ÿͻ���������ʾ,������������4һ�£�����
   ����id
   ���������û����� Customer c;
   ��Ʒ����items�������д�ŵ��Ƕ����Ʒ����
   �����ܽ��amount�������ܽ��=��Ʒ�����и���Ʒ�۸���ܺͣ�
   ����ʵ��Ӧ֧����payment���ı�֮ǰ�߼�����֮ǰ���ܽ����ۻ����ϣ�
   ���ݿͻ��ĵȼ��ٴ��ۣ����磺������ʯVIP����һ��8�ۣ�����׽�vip����һ��9�ۣ���ͨ�ͻ��������ۿۣ�
Ȼ��д����ģ�ⴴ��������Ʒ��һ��������Ȼ���ӡ������Ϣ
����չ���󣺿���ͨ�����ö��������ϵ�һ���Զ��巽��ֱ�ӻ�ȡ�ö�����������Ʒ��*/
class ZdTest6{
	public static void main(String[] args){
		Itemmer item1=new Itemmer(1,"С��",1000);
		Itemmer item2=new Itemmer(2,"vivo",2000);
		Itemmer item3=new Itemmer(3,"oppo",3000);
		Itemmer item4=new Itemmer(4,"��Ϊ",4000);
		Itemmer item5=new Itemmer(5,"����",5000);
		item1.showItem();
		item2.showItem();
		item3.showItem();
		item4.showItem();
		item5.showItem();
		Itemmer[] items={item1,item2,item3,item4,item5};
		
		
		Orders order=new Orders();
		order.setId(1);
		order.setC(new Customer("zd","������ʯVIP"));
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
		// ���ݿͻ��ĵȼ��ٴ��ۣ����磺������ʯVIP����һ��8�ۣ�����׽�vip����һ��9�ۣ���ͨ�ͻ��������ۿۣ�
		if(this.c.getType()=="������ʯVIP"){
			discount();
			return (int) (this.payment*0.8);
		}
		else if(this.c.getType()=="����׽�vip"){
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

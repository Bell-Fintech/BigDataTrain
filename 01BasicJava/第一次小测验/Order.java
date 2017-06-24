/*
4�������ඨ����
дһ�������࣬���������û����ɵĶ���Order�����������������ԣ�
   ����id
   �����������û���username
   ��Ʒ����items�������д�ŵ��Ƕ����Ʒ����
   �����ܽ��amount�������õ�����ֱ�Ӹ�ֵ��Ӧ�����ڲ��Զ�����!!! �����ܽ��=��Ʒ�����и���Ʒ�۸���ܺͣ�
   ����ʵ��Ӧ֧����payment
     �������õ�����ֱ�Ӹ�ֵ��Ӧ�����ڲ��Զ�����!!!
      ʵ��Ӧ֧����ļ����߼���
       ��� �����ܽ�� ��[0-99] ֮�䣬��Ӧ֧����=�ܽ��
       ��� �����ܽ�� ��[100-199] ֮�䣬��Ӧ֧����=�ܽ��*0.9
       ��� �����ܽ��  >=200����Ӧ֧����=�ܽ��*0.8��
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
		//����������Ʒ�ļ۸�
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
		System.out.println("�����ţ�"+getId());
		System.out.println("������ң�"+getUsername());
		for(int i=0; i<items.length; i++){
			items[i].show();
		}
		System.out.println("����Ӧ����"+getAmount());
		System.out.println("����ʵ����"+getPayment());
	}
}
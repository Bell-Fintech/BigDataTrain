/*
5����Ͷ���ʹ����
дһ������ģ������5����Ʒ���󣬱��磺
 ��Ʒ����1��
    id=��pdt_001��
    name = ��С��5sPlus��
    price = 1999.00

Ȼ��ģ������һ���������󣬱���
   ����1��
      id="order_001"
      username = "Զ��"
      items = [��Ʒ����1����Ʒ����2����Ʒ����3����Ʒ����4]
      amount = <����Ʒ�۸��ۼ�>
      payment = <������4�������Ĺ������>

Ȼ���ڳ����д�ӡ�ö�����������Ϣ��
*/
class Test3{
	public static void main(String[] args){
		Item item = new Item("pdt_001","apple4",500);
		Item item2 = new Item("pdt_002","apple5",1000);
		Item item3 = new Item("pdt_003","apple5s",1500);
		Item item4 = new Item("pdt_004","apple6",2000);
		Item item5 = new Item("pdt_005","apple6s",3500);
		Order order = new Order("order_001","����ʦ",new Item[]{item,item2,item3,item4,item5});
		order.show();
	}
}
/*
5、类和对象使用题
写一个程序，模拟生成5个商品对象，比如：
 商品对象1：
    id=“pdt_001”
    name = “小米5sPlus”
    price = 1999.00

然后模拟生成一个订单对象，比如
   订单1：
      id="order_001"
      username = "远哥"
      items = [商品对象1，商品对象2，商品对象3，商品对象4]
      amount = <各商品价格累加>
      payment = <按照题4中描述的规则计算>

然后，在程序中打印该订单的所有信息；
*/
class Test3{
	public static void main(String[] args){
		Item item = new Item("pdt_001","apple4",500);
		Item item2 = new Item("pdt_002","apple5",1000);
		Item item3 = new Item("pdt_003","apple5s",1500);
		Item item4 = new Item("pdt_004","apple6",2000);
		Item item5 = new Item("pdt_005","apple6s",3500);
		Order order = new Order("order_001","许老师",new Item[]{item,item2,item3,item4,item5});
		order.show();
	}
}
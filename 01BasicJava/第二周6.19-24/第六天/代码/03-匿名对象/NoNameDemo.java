/*
匿名对象：没有名字的对象
使用场景：
	当仅仅需要调用类里面么方法一次的时候使用匿名对象
	当类的对象作为实参传递时
*/
class NoNameDemo{
	public static void main(String[] args){
		//当仅仅需要调用类里面么方法一次的时候使用匿名对象
		//Demo d = new Demo();
		//d.test();
		//new Demo().test();
		
		//Demo d = new Demo();
		//show(d);
		show(new Demo());
	}
	
	public static void show(Demo d){
		d.test();
	}
}
class Demo{
	public void test(){
		System.out.println("测试");
	}
}
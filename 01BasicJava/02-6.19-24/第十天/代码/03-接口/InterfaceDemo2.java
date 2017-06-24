/*
接口的成员特点：
	成员变量：接口里面只能有常量，而且有默认修饰符：public static final
	成员方法：接口里面只能用抽象方法，而且有默认修饰符：public abstract
	构造方法：没有构造方法
*/
class InterfaceDemo2{
	public static void main(String[] args){
		System.out.println(InterTest.NAME);
	}
}
interface InterTest{
	//int age;
	String NAME = "哈哈";
	void show();
	/*
	public InterTest(){
		
	}*/
	
	/*接口抽象方法不能带有主体
	public void test(){
		
	}*/
}
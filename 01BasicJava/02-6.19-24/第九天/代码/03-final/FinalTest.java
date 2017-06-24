/*
final修饰成员变量的初始化时机
	成员常量必须在对象创建成功之前被赋值
*/
class FinalTest{
	public static void main(String[] args){
		new Test().show();
	}
}
class Test{
	// 变量 AGE 未在默认构造器中初始化
	private final int AGE;
	
	{//构造代码块
		AGE = 10;
	}
	
	public Test(){
		//AGE = 10;
	}
	
	public void show(){
		//无法为最终变量AGE分配值
		//AGE = 20;
		System.out.println(AGE);
	}
}
/*
final修饰局部变量的问题
	修饰基本数据类型，基本数据类型的值无法改变
	修饰引用数据类型，引用数据类型的值也无法改变，但是引用类型指向对象中的变量的值是可以改变的
*/
class FinalTest2{
	public static void main(String[] args){
		final int A = 10;
		System.out.println(A);
		//无法为最终变量A分配值
		//A = 20;
		
		final Test2 T = new Test2();
		System.out.println(T.getAge());
		//T = new Test2();//无法为最终变量T分配值
		//引用常量的值无法改变，但是引用常量指向对象中的变量的值是可以改变的
		T.setAge(20);
		System.out.println(T.getAge());
	}
}
class Test2{
	private int age = 10;
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
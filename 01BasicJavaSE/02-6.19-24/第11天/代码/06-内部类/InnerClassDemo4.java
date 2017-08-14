/*
局部内部类：就是在方法体的内部定义的一个类
局部内部类的成员只能在所在方法的内部通过创建对象的方式进行访问
局部内部类访问局部成员必须要加final(JDK1.7以及之前)：
	因为内部类在使用局部变量的时候可能不知道外部的变量变化，所以必须在使用之前就固定死这个变量的值
在JDK1.8的时候前面可以省略final，但是本质上还是以常量
*/
public class InnerClassDemo4{
	public static void main(String[] args){
		new OuterClass2().show();
	}
}
class OuterClass2{
	public void show(){
		int a = 10;
		class InnerClass2{
			public void test(){
				//从内部类引用的本地变量必须是最终变量或实际上的最终变量
				System.out.println(a);
			}
		}
		//a = 20;
		InnerClass2 ic =new  InnerClass2();
		ic.test();
	}
	
}
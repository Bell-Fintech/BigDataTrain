/*
要求请填空分别输出30，20，10。
		
注意：
	1.内部类和外部类没有继承关系。
	2.通过外部类名限定this对象
		Outer.this

*/
class InnerClass{
	int age = 10;
	class InnerOuter{
		int age = 20;
		public void show(){
			int age = 30;
			//分别输出30，20，10	
			System.out.println(age);
			System.out.println(this.age);
			System.out.println(InnerClass.this.age);
		}
	}
}
public class InnerClassTest{
	public static void main(String[] args){
		new InnerClass().new InnerOuter().show();
	}
}

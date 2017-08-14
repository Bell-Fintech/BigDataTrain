/*
继承的注意事项：
	父类中的私有成员子类不能继承
	父类的构造方法子类不能继承
	不要为了一部分功能而去继承一个父类
	
		class A{
			public void show(){}
			public void show2(){}
			public void show3(){}
			private String name;
			private String address;
		}
		我有一个类B想拥有show方法
		class B extends A{}
		class B{
			public void show(){}
		}
*/
class ExtendsDemo3{
	public static void main(String[] args){
		new Son2().test();
	}
}
class Father2{
	private String name;
	private void show(){
		System.out.println("父类的show");
	}
	public void test(){
		//做一些事情
		show();
	}
}
class Son2 extends Father2{
	
}
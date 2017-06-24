/*
多态中成员访问的特点：
	成员变量
		编译看左边，运行看左边
	成员方法
		编译看左边，运行看右边
	静态方法(没有方法重写的特点，所以本质上不能算方法的重写)
		编译看左边，运行看左边
*/
class DuoTaiDemo2{
	public static void main(String[] args){
		Father2 f = new Son2();
		System.out.println(f.age);//10
		f.show();//son show
		f.test();//father test
	}
}
class Father2{
	public int age = 10;
	public void show(){
		System.out.println("father show");
	}
	public static void test(){
		System.out.println("father test");
	}
}
class Son2 extends Father2{
	public int age = 20;
	public void show(){
		System.out.println("son show");
	}
	public static void test(){
		System.out.println("son test");
	}
}
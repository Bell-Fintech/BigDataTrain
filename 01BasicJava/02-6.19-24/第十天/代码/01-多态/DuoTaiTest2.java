//2.看程序写结果（先判断有没有问题，如果没有，写出结果）
class A{
	public void show(){
		show2();
	}
	
	public void show2(){
		System.out.println("我");
	}
}
class B extends A {
	public void show2(){
		System.out.println("是");
	}
}
class C extends B {
	public void show(){
		super.show();
	}
	
	public void show2(){
		System.out.println("神");
	}
}

class DuoTaiTest2 {
	public static void main(String[] args) {
		A a = new A();
		a.show();//我
		
		A b = new B();
		b.show();//是
		
		B c = new C();
		c.show();//神
	}
}

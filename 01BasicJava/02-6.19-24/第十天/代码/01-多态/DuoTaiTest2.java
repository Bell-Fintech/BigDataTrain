//2.������д��������ж���û�����⣬���û�У�д�������
class A{
	public void show(){
		show2();
	}
	
	public void show2(){
		System.out.println("��");
	}
}
class B extends A {
	public void show2(){
		System.out.println("��");
	}
}
class C extends B {
	public void show(){
		super.show();
	}
	
	public void show2(){
		System.out.println("��");
	}
}

class DuoTaiTest2 {
	public static void main(String[] args) {
		A a = new A();
		a.show();//��
		
		A b = new B();
		b.show();//��
		
		B c = new C();
		c.show();//��
	}
}

/*
��̬�г�Ա���ʵ��ص㣺
	��Ա����
		���뿴��ߣ����п����
	��Ա����
		���뿴��ߣ����п��ұ�
	��̬����(û�з�����д���ص㣬���Ա����ϲ����㷽������д)
		���뿴��ߣ����п����
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
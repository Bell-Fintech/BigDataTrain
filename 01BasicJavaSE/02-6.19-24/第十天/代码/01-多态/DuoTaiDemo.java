/*
��̬������һ�������ڲ�ͬ�����±�ʾ�Ĳ�ͬ״̬
ˮ��
	���£�Һ̬
	������¶��£���̬
	�ܸߵ��¶��£���̬
��̬��ǰ������֣�
	������֮ǰ���ڹ�ϵ
	���ڷ�������д
	��������ָ���������
*/
class DuoTaiDemo{
	public static void main(String[] args){
		//Son s = new Son();
		Father f = new Son();
		f.show();
		//����������޷�ָ�������
		//Son s = new Father();
		
		/*
		Dog d = new Dog();
		d.test();
		Pig p = new Pig();
		p.test();
		Animal d = new Dog();
		d.test();
		Animal p = new Pig();
		p.test();*/
		show(new Dog());
		show(new Pig());
		
		sop(123);
		sop("����");
	}
	
	//���е��඼ֱ�ӻ��߼�ӵļ̳�Object
	public static void sop(Object obj){
		System.out.println(obj);
	}
	
	public static void show(Animal a){
		a.test();
	}
}
class Animal{
	public void test(){
		System.out.println("Animal Test");
	}
}
class Dog extends Animal{
	public void test(){
		System.out.println("dog Test");
	}
}
class Pig extends Animal{
	public void test(){
		System.out.println("pig Test");
	}
}


class Father{
	public void show(){
		System.out.println("����");
	}
}
class Son extends Father{
	public void show(){
		System.out.println("�Ǻ�");
	}
}
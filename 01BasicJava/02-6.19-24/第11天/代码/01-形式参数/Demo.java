/*
��ʽ������
	��ͨ���ࣺҪ�ľ�����ͨ��Ķ���
	�����ࣺҪ�ľ���ʵ�������г��󷽷����������
	�ӿڣ�Ҫ�ľ���ʵ�������г��󷽷����������
*/
class Demo{
	public static void main(String[] args){
		test(new Son2());
	}
	public static void test(Inter f){
		f.show();
	}
}

interface Inter{
	void show();
}

class Son2 implements Inter{
	public void show(){
		System.out.println("show");
	}
}

abstract class Father2{
	public abstract void show();
}

class Son extends Father2{
	public void show(){
		System.out.println("show");
	}
}

class Father{
	public void show(){
		System.out.println("show");
	}
}
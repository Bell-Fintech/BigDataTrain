/*
����ֵ����
	��ͨ���ࣺҪ�ľ��Ƕ���
	�����ࣺҪ�ľ���ʵ�������г��󷽷����������
	�ӿڣ�Ҫ�ľ���ʵ�������г��󷽷����������
*/

class Demo2{
	public static void main(String[] args){
		getInstance().show();
	}
	public static Inter2 getInstance(){
		return new InterImpl();
	}
}

interface Inter2{
	void show();
}

class InterImpl implements Inter2{
	public void show(){
		System.out.println("show");
	}
}

abstract class Person2{
	public abstract void show();
}

class Son3 extends Person2{
	public void show(){
		System.out.println("show");
	}
}

class Person{
	public void show(){
		System.out.println("show");
	}
}
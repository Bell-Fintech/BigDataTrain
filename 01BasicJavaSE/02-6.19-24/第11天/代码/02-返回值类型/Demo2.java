/*
返回值类型
	普通的类：要的就是对象
	抽象类：要的就是实现了所有抽象方法的子类对象
	接口：要的就是实现了所有抽象方法的子类对象
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
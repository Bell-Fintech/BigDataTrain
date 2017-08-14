/*
形式参数：
	普通的类：要的就是普通类的对象
	抽象类：要的就是实现了所有抽象方法的子类对象
	接口：要的就是实现了所有抽象方法的子类对象
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
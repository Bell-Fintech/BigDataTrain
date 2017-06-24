/*
多态：就是一个事物在不同环境下表示的不同状态
水：
	常温：液态
	很冷的温度下：固态
	很高的温度下：气态
多态的前提和体现：
	类与类之前存在关系
	存在方法的重写
	父类引用指向子类对象
*/
class DuoTaiDemo{
	public static void main(String[] args){
		//Son s = new Son();
		Father f = new Son();
		f.show();
		//子类的引用无法指向父类对象
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
		sop("哈哈");
	}
	
	//所有的类都直接或者间接的继承Object
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
		System.out.println("哈哈");
	}
}
class Son extends Father{
	public void show(){
		System.out.println("呵呵");
	}
}
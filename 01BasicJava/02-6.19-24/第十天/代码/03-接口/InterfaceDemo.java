/*
接口概述：有一些额外的功能不是某一类事物都具有的时候，
	可以将这些功能定义到接口中，将来有些事物需要具有这些功能时只需要实现这个接口即可
接口的格式：
	interface 接口名
	
	jump():跳高
	compute():计算
接口如何实例化？
	可以让一个子类来实现，然后实例化子类，这个也叫作接口多态
怎么实现呢？
	可以通过implements关键字进行实现
	class 子类 implements 接口名
接口的子类特点：
	要么实现接口里面的所有抽象方法
	要么自身的类定义为抽象类
*/
class InterfaceDemo{
	public static void main(String[] args){
		// AnimalInter是抽象的; 无法实例化
		//new AnimalInter();
		AnimalInter ai = new DogHuang();
		ai.jump();
		ai.compute();
		//DogHuang a = (DogHuang)ai;
		//a.eatFood();
		//ai.eatFood();
		Animal ai2 = new DogHuang();
		ai2.eatFood();
		//ai2.jump();
	}
}
interface AnimalInter{
	public abstract void jump();
	public abstract void compute();
}
abstract class Animal{
	private String name;
	private int age;
	private String color;
	
	public abstract void eatFood();
	
	public Animal(){
		
	}
	
	public Animal(String name,int age,String color){
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public void sop(Object obj){
		System.out.println(obj);
	}
}
class DogWang extends Animal{
	public void eatFood(){
		System.out.println("狗吃排骨");
	}
}
class DogHuang extends Animal implements AnimalInter{
	public void eatFood(){
		System.out.println("狗吃狗粮");
	}
	public void jump(){
		System.out.println("训练大黄跳高");
	}
	public void compute(){
		System.out.println("训练大黄计算");
	}
}
/*
继承：
	概述：就是将一些类中的相同属性和行为封装到一起，形成一个新的类；然后这些类继承这个新类，
		那么这个新类中的所有非私有的属性和行为这些类都具有了
	这些类可以通过extends关键字继承这个新类
	继承的这些类被称为子类或者派生类
	这个被继承的类称为父类，超类，基类
	子类可以定义自己的特有方法
*/
class ExtendsDemo{
	public static void main(String[] args){
		Dog d = new Dog();
		System.out.println("name="+d.getName()+",age="+d.getAge());
		d.sleep();
		d.test();
	}
}
class Animal{
	private String name;
	private int age;
	public void sleep(){
		System.out.println("动物睡觉");
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
class Dog extends Animal{
	//name可以在Animal中访问private
	public void test(){
		//子类只是拿到父类对象的一个引用
		System.out.println(name);
	}
}
class Cat extends Animal{

}
class Pig extends Animal{

}
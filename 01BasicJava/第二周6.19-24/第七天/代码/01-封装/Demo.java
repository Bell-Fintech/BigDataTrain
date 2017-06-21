/*
类：就是某一类事物的所有属性和行为的集合
对象：对象就是一个类的具体体现
面向对象开发：其实就是不断的创建对象，指挥对象做事情
面向对象的特征：
	封装
		概述：就是对外隐藏成员变量和实现的细节，仅对外提供公共的访问方法
		好处：
			提高了安全性
			提高了代码的复用性
		封装原则：
			当属性存在安全问题时，可以将属性通过提供一个公共的访问方法进行设置或者获取
	
		private：被private修饰的成员(成员变量和成员方法)只能在类的内部进行访问
		使用场景：一般是将一个类中属性用private修饰，然后提供对外的公共的setXxx和getXxx方法
		当成员变量和局部变量同名时，使用的时候遵从就近原则
		this：this所在的方法正在被哪个对象调用，this就代表该对象
	继承
	多态
*/
class Demo{
	public static void main(String[] args){
		Person p = new Person();
		//p.name = "张三";
		//p.age = -18;// age可以在Person中访问private
		//p.sex = '男';
		p.setName("张三");
		p.setAge(18);
		p.setSex('男');
		
		System.out.println("name="+p.getName()+",age="+p.getAge()+",sex="+p.getSex());
	}
}

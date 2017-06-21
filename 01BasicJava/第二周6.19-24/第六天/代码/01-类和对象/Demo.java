/*
类：就是一组属性和行为的封装
对象：就是一个具体的事物
如何定义一个类：
	属性：就是对现实生活中的事物的描述
	行为：就是现实生活中事物可以干什么
定义一个人的类：
	先从现实生活中分析：
		属性：姓名，年龄，性别，身高，体重
		行为：吃饭，睡觉，打游戏，学习
	再将人的属性和行为封装到类中：Person
		属性(成员变量)：name,age,sex...
		行为(成员方法，不需要加static)：eat,sleep,study...
类可以通过对象体现：
	创建一个对象：
		类名 对象名 = new 类名();
	使用成员变量：
		对象名.变量名
	使用成员方法：
		对象名.方法名
*/
class Demo{
	public static void main(String[] args){
		Person p = new Person();
		System.out.println("name="+p.name+",age="+p.age+",sex="+p.sex);//name=null,age=0,sex=
		p.name = "张三";
		p.age = 20;
		p.sex = '男';
		System.out.println("name="+p.name+",age="+p.age+",sex="+p.sex);//name=张三,age=20,sex=男
		p.eat("炸酱面");
		
		
		Person p2 = new Person();
		p2.name = "李四";
		p2.age = 18;
		p2.sex = '男';
		System.out.println("name="+p2.name+",age="+p2.age+",sex="+p2.sex);//name=张三,age=20,sex=男
		p2.eat("刀削面");
	}
}
class Person{
	//成员变量
	public String name;
	public int age;
	public char sex;
	
	//成员方法
	public void eat(String food){
		System.out.println(name+"吃的是"+food);
	}
	public void sleep(){
		System.out.println("人需要睡觉");
	}
	public void study(String classes){
		System.out.println(name+"学的是"+classes);
	}
}
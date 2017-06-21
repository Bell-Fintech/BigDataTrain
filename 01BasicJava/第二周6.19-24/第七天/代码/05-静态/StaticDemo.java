/*
static：可以修饰成员，被修饰的成员就变成静态的
静态的特点：
	静态的成员随着类的加载而加载，优先于对象而存在
	静态的成员被所有的对象所共享
静态的注意事项：
	静态方法只能访问静态成员(成员方法和成员变量);静态的只能访问静态的
	静态方法中不能含有this
一般使用static关键字封装工具类
使用一个类里面的方法：
	通过对象名调用
	如果方法是静态的，可以直接通过类名调用
*/
class StaticDemo{
	static int age = 30;//无法从静态上下文中引用非静态 变量 age
	public static void main(String[] args){
		Person p = new Person();
		p.age = 20;
		System.out.println(p.age);//20
		Person p2 = new Person();
		System.out.println(p2.age);//20
		System.out.println(age);
		show();
	}
	
	public static void show(){// 无法从静态上下文中引用非静态 方法 show()
		
	}
}
class Person{
	//静态的成员被所有的对象所共享
	public static int age = 10;
}
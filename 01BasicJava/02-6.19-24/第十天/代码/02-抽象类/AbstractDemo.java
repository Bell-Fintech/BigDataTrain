/*
抽象类：在父类中有些功能不能给出具体的实现时，可以将这个功能定义成抽象的，由于有抽象功能的类必须定义成抽象类
抽象类的定义格式：
	abstract class 类名
	public abstract void 方法名();
抽象类的成员特点：
	成员变量：可以是常量，可以是变量
	成员方法：
		可以是具体的方法：提高代码的复用性
		可以是抽象的方法：可以强制要求子类必须实现
	构造方法：有构造方法，用于子类初始化父类数据的
*/
class AbstractDemo{
	public static void main(String[] args){
		// Animal是抽象的; 无法实例化
		//new Animal();
	}
}
//Animal不是抽象的, 并且未覆盖Animal中的抽象方法eat()
abstract class Animal{
	//变量
	private String name;
	//常量
	private final int AGE = 10;
	
	public Animal(){
		
	}
	
	// 缺少方法主体, 或声明抽象
	public abstract void eat();
	public void show(){
		
	}
}
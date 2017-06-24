/*
抽象类如何进行实例化？
	抽象类是不能直接实例化的，可以通过多态的实现，让子类进行实现，然后创建子类的对象使用抽象的方法，这个也叫抽象多态
	抽象类的子类：
		要么是一个实现了所有抽象方法的类
		要么继续是一个抽象类
	抽象类中不一定有抽象方法，有抽象方法的类一定是一个抽象类
*/
class AbstractDemo2{
	public static void main(String[] args){
		new Son().show();
	}
}
abstract class Father{
	public int age;
	public abstract void show();
}
// Son不是抽象的, 并且未覆盖Father中的抽象方法show()
class Son extends Father{
	public void show(){
		System.out.println("哈哈");
	}
}
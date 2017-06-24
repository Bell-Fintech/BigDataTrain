/*
成员内部类一般用private进行修饰，提高安全
成员内部类还可以用static修饰，为了访问方便
成员内部类的成员如何访问？	
	使用非静态内部类的非静态成员：
		外部类名.内部类名 对象名 = new 外部类名().new 内部类名();
		对象名.成员(成员方法，成变量)
	使用静态内部类的非静态成员
		外部类名.内部类名 对象名 = new 外部类名.内部类名();
		对象名.成员
	使用静态内部类的静态成员
		上述方式可以继续使用
		或
		外部类名.内部类名.成员
	
静态内部类中不一定有静态成员，但是有静态成员的内部类一定是一个静态内部类
*/
public class InnerClassDemo2{
	public static void main(String[] args){
		/*
		使用非静态内部类的非静态成员：
			外部类名.内部类名 对象名 = new 外部类名().new 内部类名();
			对象名.成员(成员方法，成变量)
		
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
		System.out.println(ic.name);
		
		使用静态内部类的非静态成员
			外部类名.内部类名 对象名 = new 外部类名.内部类名();
			对象名.成员
		
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.show();
		System.out.println(ic.name);
		*/
		OuterClass.InnerClass.show();
	}
}
class OuterClass{
	private static int age = 10;
	public void show(){
		System.out.println("Outer show");
	}
	static class InnerClass{
		public static String name = "张三";
		public static void show(){
			System.out.println("Inner show"+age);
			//OuterClass.this.show();
		}
	}
}
/*
继承中子父类构造方法的关系：
	子类在初始化时，会默认访问父类的无参构造方法
	在子类所有的构造方法可执行代码第一行都有一个默认super();
	如果父类中没有无参的构造方法呢？
		可以在子类通过super显示的去调用有参构造方法
	也可以通过this调用本类的构造方法,对this的调用必须是构造器中的第一个语句
*/
class ExtendsDemo5{
	public static void main(String[] args){
		new Son4();
	}
}
class Father4{
	private String name;
	private int age;
	
	public Father4(){
		System.out.println("父类的构造方法被调用了");
	}
	public Father4(String name,int age){
		this.name = name;
		this.age = age;
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
class Son4 extends Father4{
	public Son4(String name,int age){
		super(name,age);
		//super();
		//如果父类不先初始化，可能在父类初始化之前就使用父类里面的东西了，所以一定要确保父类先初始化
		//setName("aaa");
		
	}
	public Son4(){
		this("张三",30);
	}
}
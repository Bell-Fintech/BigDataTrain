/*
一个类的组成部分：
	成员变量
		子类方法访问一个变量的查找顺序：
			首先在子类方法的局部范围找
			如果没有找到，再在子类的成员范围找
			如果还没有找到，就到父类的成员范围找
			如果父类中也没有找到，就会报错
	super：代表父类的引用		this：代表本类的引用
		访问成员变量：
			super.成员变量名;		this.成员变量名;
		访问构造方法：
			super(...);				this(...);
		访问成员方法：
			super.成员方法名(...);	this.成员方法名(...);
	
	成员方法
*/
class ExtendsDemo4{
	public static void main(String[] args){
		//Son3 s = new Son3();
		new Son3().show();
	}
}
class Father3{
	public int age = 10;
}
class Son3 extends Father3{
	public int age = 20;
	public void show(){
		int age = 30;
		System.out.println(super.age);
	}
}
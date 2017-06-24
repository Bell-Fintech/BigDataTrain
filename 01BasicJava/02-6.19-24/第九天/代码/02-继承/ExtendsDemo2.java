/*
java中所有的类都直接或者间接的基础Object
继承好处：
	提高了代码的复用性
		可以将一些重复的代码放在父类中
	提高了代码的维护性
	让类与类之间产生了关系，是多态的前提
特点：
	java中只支持单继承，不支持多继承，但是支持多层继承
*/
class Father{
	private String name;
	private int age;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age =age;
	}
	public int getAge(){
		return age;
	}
	
	public void sop(String msg){
		System.out.println();
	}
}
class A extends Father{
	public void test(){
		
	}
}
//Son想同时继承A和Father的最终意义是想同时拥有A和Father所有的属性和方法
class Son extends A{
	public void show(){
		sop("哈哈");
	}
}
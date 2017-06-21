/*
一个标准的JavaBean(domain)：
	成员方法
	构造方法
		无参
		有参
	成员方法
		setXxx和getXxx
		打印所有成员变量的方法
	赋值的方式：
		通过构造方法(只有在创建对象的时候可以赋值)
		通过sexXxx方法(通过对象名直接多次赋值)
*/
class TeacherDemo{
	public static void main(String[] args){
		Teacher t = new Teacher();
		t.show();
		Teacher t2 = new Teacher("李四",20,'女');
		t2.show();
	}
}
class Teacher{
	//第一步将所有的属性私有化
	private String name = "张三";
	private int age = 18;
	private char sex = '男';
	
	//第二步通过构造方法赋值
	public Teacher(){
		
	}
	public Teacher(String name,int age,char sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//第三步提供setXxx和getXxx方法
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
	public void setSex(char sex){
		this.sex = sex;
	}
	public char getSex(){
		return sex;
	}
	
	//第四步提供一个打印所有属性的方法
	public void show(){
		System.out.println("name="+name+",age="+age+",sex="+sex);
	}
}
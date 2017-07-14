package cn.edu360;

public class Person {
	public String name;
	protected int age;
	char sex;
	private String address;
	
	public Person(){
		System.out.println("无参构造方法");
	}
	
	protected Person(String name){
		this.name = name;
	}
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	private Person(String name,int age,char sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void show(){
		System.out.println("show");
	}
	protected void test(String msg){
		System.out.println(msg);
	}
	int getSum(int a,int b){
		return a+b;
	}
	private void sop(String msg){
		System.out.println(msg);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", address=" + address + "]";
	}
}

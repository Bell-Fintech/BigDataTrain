package cn.edu360;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) {
		// 升序：以姓名排序，如果姓名相同再以年龄排序
		//this对象的成员和o对象的成员进行比较是升序
		//return this.name.equals(o.name)?this.age-o.age:this.name.compareTo(o.name);
		
		// 降序：以年龄排序，如果年龄相同再以姓名排序
		//o对象的成员和this对象的成员进行比较是降序
		return o.age==this.age?o.name.compareTo(this.name):o.age-this.age;
	}
}

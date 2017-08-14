package cn.edu360;

public class Person implements Comparable<Person>{
	//学号，姓名，年龄，总分
	private int number;
	private String name;
	private int age;
	private int totalScore;
	public Person() {
		super();
	}
	public Person(int number, String name, int age, int totalScore) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
		this.totalScore = totalScore;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	@Override
	public String toString() {
		return "Person [number=" + number + ", name=" + name + ", age=" + age + ", totalScore=" + totalScore + "]";
	}
	//然后分别按照优先级学号、年龄、总分进行排序输出
	@Override
	public int compareTo(Person o) {
		//this的成员和o的成员比较是升序
		//判断学号是否相等
//		if(this.getNumber()==o.getNumber()){
//			//如果学号相等就再看年龄是否相等
//			if(this.getAge()==o.getAge()){
//				//如果学号和年龄都相等，就比较总分
//				return this.getTotalScore()-o.getTotalScore();
//			}
//			//如果年龄不相等就比较年龄
//			return this.getAge()-o.getAge();
//		}
//		//如果学号不相等就比较学号
//		return this.getNumber()-o.getNumber();
//	}
	
	//o的成员和this的成员比较是降序
	//判断学号是否相等
	if(this.getNumber()==o.getNumber()){
		//如果学号相等就再看年龄是否相等
		if(this.getAge()==o.getAge()){
			//如果学号和年龄都相等，就比较总分
			return o.getTotalScore()-this.getTotalScore();
		}
		//如果年龄不相等就比较年龄
		return o.getAge()-this.getAge();
	}
	//如果学号不相等就比较学号
	return o.getNumber()-this.getNumber();
}
}

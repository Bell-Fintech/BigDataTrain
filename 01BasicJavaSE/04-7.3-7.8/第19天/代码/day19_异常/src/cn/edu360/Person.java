package cn.edu360;

public class Person {
	private String name;
	private int age;
	public Person() {
		
	}
	
	public Person(String name, int age)throws AgeException {
		this.name = name;
		if(age<1 || age>260){
			//抛出一个我们自定义的异常
			throw new AgeException("人的年龄必须在1-260之间");
		}
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
	public void setAge(int age)throws AgeException {
		if(age<1 || age>260){
			//抛出一个我们自定义的异常
			throw new AgeException("人的年龄必须在1-260之间");
		}
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
class AgeException extends Exception{
	/*@Override
	public String getMessage() {
		return "人的年龄必须在1-260之间";
	}*/
	/*public AgeException(){
		super("人的年龄必须在1-260之间");
	}*/
	public AgeException(String msg){
		super(msg);
	}
}

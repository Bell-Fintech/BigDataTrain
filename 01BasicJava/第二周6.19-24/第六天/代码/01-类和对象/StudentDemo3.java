class StudentDemo3{
	public static void main(String[] args){
		Student s = new Student();
		s.name = "张三";
		s.age = 20;
		System.out.println("name="+s.name+",age="+s.age+",number="+s.number);//name=张三,age=20,number=0
		s.eat("牛肉盖饭");
		
		Student s2 = new Student();
		s2.name = "李四";
		s2.age = 21;
		s2.number = 110120119;
		System.out.println("name="+s2.name+",age="+s2.age+",number="+s2.number);//name=李四,age=21,number=110120119
		s2.eat("干煸豆角");
		
		Student s3 = s;
		s3.number = 10001010;
		System.out.println("name="+s.name+",age="+s.age+",number="+s.number);//name=张三,age=20,number=10001010
	}
}
class Student{
	public String name;
	public int age;
	public int number;
	
	public void eat(String food){
		System.out.println(name+"吃"+food);
	}
	public void sleep(){
		System.out.println("学生睡8小时");
	}
	public void study(String classes){
		System.out.println(name+"学的是"+classes);
	}
}
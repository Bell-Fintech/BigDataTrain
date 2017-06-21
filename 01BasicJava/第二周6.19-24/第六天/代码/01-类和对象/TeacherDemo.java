/*
老师在现实生活中的属性和行为：
	属性：姓名，年龄，性别，住址，身高，体重，教的什么课。。。
	行为：睡觉，吃饭，教课，下课。。。
定义成java中的类，类名：Teacher
	成员变量：name,age,sex...
	成员方法：sleep，eat，teach
*/
class TeacherDemo{
	public static void main(String[] args){
		//创建一个许老师
		Teacher t = new Teacher();
		t.name = "许志远";
		t.age = 25;
		t.sex = '男';
		t.show();
		t.sleep();
		t.eat();
		t.teach("JavaSE");
		
		System.out.println("--------------------");
		
		//创建一个张老师
		Teacher t2 = new Teacher();
		t2.name = "张森";
		t2.age = 26;
		t2.sex = '男';
		t2.show();
		
		System.out.println("--------------------");
		
		//创建一个杨老师
		Teacher t3 = new Teacher();
		t3.name = "杨家伟";
		t3.age = 30;
		t3.sex = '男';
		t3.show();
		
	}
}
class Teacher{
	public String name;
	public int age;
	public char sex;
	
	public void sleep(){
		System.out.println("老师睡7个小时");
	}
	public void eat(){
		System.out.println("老师吃的大盘鸡");
	}
	public void teach(String classes){
		System.out.println(name+"教的是"+classes);
	}
	public void show(){
		System.out.println("name="+name+",age="+age+",sex="+sex);
	}
}
/*
老师案例
	具体事物：什么老师讲什么课
	共性：姓名，年龄，讲课。
*/
class TeacherDemo{
	public static void main(String[] args){
		/*Teacher t = new TeacherXu();
		t.teach();
		t.show();
		Teacher t2 = new TeacherYang();
		t2.teach();
		t.show();*/
		show(new TeacherXu());
		show(new TeacherYang());
	}
	public static void show(Teacher t){
		t.teach();
		t.show();
	}
}
abstract class Teacher{
	private String name;
	private int age;
	
	public Teacher(){
		
	}
	public Teacher(String name,int age){
		this.name = name;
		this.age =age;
	}
	
	//什么老师讲什么课，应该在具体的老师类中给出实现
	public abstract void teach();
	
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
	public void show(){
		System.out.println("name="+name+",age="+age);
	}
}
class TeacherXu extends Teacher{
	public TeacherXu(){
		//setName("许老师");
		//setAge(18);
		super("许老师",18);
	}
	
	public void teach(){
		System.out.println("许老师讲JAVASE");
	}
}
class TeacherYang extends Teacher{
	public TeacherYang(){
		super("杨老师",20);
	}
	public void teach(){
		System.out.println("杨老师讲web");
	}
}

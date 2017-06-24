/*
��ʦ����
	�������ʲô��ʦ��ʲô��
	���ԣ����������䣬���Ρ�
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
	
	//ʲô��ʦ��ʲô�Σ�Ӧ���ھ������ʦ���и���ʵ��
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
		//setName("����ʦ");
		//setAge(18);
		super("����ʦ",18);
	}
	
	public void teach(){
		System.out.println("����ʦ��JAVASE");
	}
}
class TeacherYang extends Teacher{
	public TeacherYang(){
		super("����ʦ",20);
	}
	public void teach(){
		System.out.println("����ʦ��web");
	}
}

class StudentDemo{
	public static void main(String[] args){
	Student stu=new Student();
	stu.setName("zd");
	stu.setGrade(100);
	System.out.println(stu.getName()+"µÄ³É¼¨Îª:"+stu.getGrade());
	}
}
class Student{
	private String name;
	private int grade;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setGrade(int grade){
		this.grade=grade;
	}
	public int getGrade(){
		return grade;
	}
}
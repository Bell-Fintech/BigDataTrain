class StudentDemo2{
	public static void main(String[] args){
		Student s = new Student();
		s.name = "����";
		s.age = 20;
		System.out.println("name="+s.name+",age="+s.age+",number="+s.number);
		s.eat("ţ��Ƿ�");
		
		Student s2 = new Student();
		s2.name = "����";
		s2.age = 21;
		s2.number = 110120119;
		System.out.println("name="+s2.name+",age="+s2.age+",number="+s2.number);
		s2.eat("���Զ���");
	}
}
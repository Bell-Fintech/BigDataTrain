/*
һ����׼��JavaBean(domain)��
	��Ա����
	���췽��
		�޲�
		�в�
	��Ա����
		setXxx��getXxx
		��ӡ���г�Ա�����ķ���
	��ֵ�ķ�ʽ��
		ͨ�����췽��(ֻ���ڴ��������ʱ����Ը�ֵ)
		ͨ��sexXxx����(ͨ��������ֱ�Ӷ�θ�ֵ)
*/
class TeacherDemo{
	public static void main(String[] args){
		Teacher t = new Teacher();
		t.show();
		Teacher t2 = new Teacher("����",20,'Ů');
		t2.show();
	}
}
class Teacher{
	//��һ�������е�����˽�л�
	private String name = "����";
	private int age = 18;
	private char sex = '��';
	
	//�ڶ���ͨ�����췽����ֵ
	public Teacher(){
		
	}
	public Teacher(String name,int age,char sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//�������ṩsetXxx��getXxx����
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
	public void setSex(char sex){
		this.sex = sex;
	}
	public char getSex(){
		return sex;
	}
	
	//���Ĳ��ṩһ����ӡ�������Եķ���
	public void show(){
		System.out.println("name="+name+",age="+age+",sex="+sex);
	}
}
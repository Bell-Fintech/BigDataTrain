/*
��ʦ����ʵ�����е����Ժ���Ϊ��
	���ԣ����������䣬�Ա�סַ����ߣ����أ��̵�ʲô�Ρ�����
	��Ϊ��˯�����Է����̿Σ��¿Ρ�����
�����java�е��࣬������Teacher
	��Ա������name,age,sex...
	��Ա������sleep��eat��teach
*/
class TeacherDemo{
	public static void main(String[] args){
		//����һ������ʦ
		Teacher t = new Teacher();
		t.name = "��־Զ";
		t.age = 25;
		t.sex = '��';
		t.show();
		t.sleep();
		t.eat();
		t.teach("JavaSE");
		
		System.out.println("--------------------");
		
		//����һ������ʦ
		Teacher t2 = new Teacher();
		t2.name = "��ɭ";
		t2.age = 26;
		t2.sex = '��';
		t2.show();
		
		System.out.println("--------------------");
		
		//����һ������ʦ
		Teacher t3 = new Teacher();
		t3.name = "���ΰ";
		t3.age = 30;
		t3.sex = '��';
		t3.show();
		
	}
}
class Teacher{
	public String name;
	public int age;
	public char sex;
	
	public void sleep(){
		System.out.println("��ʦ˯7��Сʱ");
	}
	public void eat(){
		System.out.println("��ʦ�ԵĴ��̼�");
	}
	public void teach(String classes){
		System.out.println(name+"�̵���"+classes);
	}
	public void show(){
		System.out.println("name="+name+",age="+age+",sex="+sex);
	}
}
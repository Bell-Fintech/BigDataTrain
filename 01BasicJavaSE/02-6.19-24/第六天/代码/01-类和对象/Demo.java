/*
�ࣺ����һ�����Ժ���Ϊ�ķ�װ
���󣺾���һ�����������
��ζ���һ���ࣺ
	���ԣ����Ƕ���ʵ�����е����������
	��Ϊ��������ʵ������������Ը�ʲô
����һ���˵��ࣺ
	�ȴ���ʵ�����з�����
		���ԣ����������䣬�Ա���ߣ�����
		��Ϊ���Է���˯��������Ϸ��ѧϰ
	�ٽ��˵����Ժ���Ϊ��װ�����У�Person
		����(��Ա����)��name,age,sex...
		��Ϊ(��Ա����������Ҫ��static)��eat,sleep,study...
�����ͨ���������֣�
	����һ������
		���� ������ = new ����();
	ʹ�ó�Ա������
		������.������
	ʹ�ó�Ա������
		������.������
*/
class Demo{
	public static void main(String[] args){
		Person p = new Person();
		System.out.println("name="+p.name+",age="+p.age+",sex="+p.sex);//name=null,age=0,sex=
		p.name = "����";
		p.age = 20;
		p.sex = '��';
		System.out.println("name="+p.name+",age="+p.age+",sex="+p.sex);//name=����,age=20,sex=��
		p.eat("ը����");
		
		
		Person p2 = new Person();
		p2.name = "����";
		p2.age = 18;
		p2.sex = '��';
		System.out.println("name="+p2.name+",age="+p2.age+",sex="+p2.sex);//name=����,age=20,sex=��
		p2.eat("������");
	}
}
class Person{
	//��Ա����
	public String name;
	public int age;
	public char sex;
	
	//��Ա����
	public void eat(String food){
		System.out.println(name+"�Ե���"+food);
	}
	public void sleep(){
		System.out.println("����Ҫ˯��");
	}
	public void study(String classes){
		System.out.println(name+"ѧ����"+classes);
	}
}
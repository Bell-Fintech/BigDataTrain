/*
�̳У�
	���������ǽ�һЩ���е���ͬ���Ժ���Ϊ��װ��һ���γ�һ���µ��ࣻȻ����Щ��̳�������࣬
		��ô��������е����з�˽�е����Ժ���Ϊ��Щ�඼������
	��Щ�����ͨ��extends�ؼ��ּ̳��������
	�̳е���Щ�౻��Ϊ�������������
	������̳е����Ϊ���࣬���࣬����
	������Զ����Լ������з���
*/
class ExtendsDemo{
	public static void main(String[] args){
		Dog d = new Dog();
		System.out.println("name="+d.getName()+",age="+d.getAge());
		d.sleep();
		d.test();
	}
}
class Animal{
	private String name;
	private int age;
	public void sleep(){
		System.out.println("����˯��");
	}
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
}
class Dog extends Animal{
	//name������Animal�з���private
	public void test(){
		//����ֻ���õ���������һ������
		System.out.println(name);
	}
}
class Cat extends Animal{

}
class Pig extends Animal{

}
/*
static���������γ�Ա�������εĳ�Ա�ͱ�ɾ�̬��
��̬���ص㣺
	��̬�ĳ�Ա������ļ��ض����أ������ڶ��������
	��̬�ĳ�Ա�����еĶ���������
��̬��ע�����
	��̬����ֻ�ܷ��ʾ�̬��Ա(��Ա�����ͳ�Ա����);��̬��ֻ�ܷ��ʾ�̬��
	��̬�����в��ܺ���this
һ��ʹ��static�ؼ��ַ�װ������
ʹ��һ��������ķ�����
	ͨ������������
	��������Ǿ�̬�ģ�����ֱ��ͨ����������
*/
class StaticDemo{
	static int age = 30;//�޷��Ӿ�̬�����������÷Ǿ�̬ ���� age
	public static void main(String[] args){
		Person p = new Person();
		p.age = 20;
		System.out.println(p.age);//20
		Person p2 = new Person();
		System.out.println(p2.age);//20
		System.out.println(age);
		show();
	}
	
	public static void show(){// �޷��Ӿ�̬�����������÷Ǿ�̬ ���� show()
		
	}
}
class Person{
	//��̬�ĳ�Ա�����еĶ���������
	public static int age = 10;
}
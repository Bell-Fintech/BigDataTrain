/*
���췽����һ���Ǹ����еĳ�Ա�������и�ֵ�������Դ�ֵ
��ʽ��
	���������ֺ�����һ��
	û�з���ֵ���ͣ���void��û��
	Ҳ����Ҫͨ��return����ֵ
ע�����	
	ÿһ�δ�������ʱ�����췽����������
	�������û���Լ��������췽����ϵͳ���Զ�����һ���ղεĹ��췽������������Լ������ˣ���ôϵͳ�������ṩ
	���췽��Ҳ�ǿ������ص�
	���췽����Ҳ������return����
*/
class Demo{
	public static void main(String[] args){
		Person p = new Person("����");
		p.show();
		Person p2 = new Person();//�޷����� Person�еĹ����� PersonӦ�õ���������
		p2.show();
	}
}
class Person{
	private String name;
	private int age;
	private char sex;
	private String password;
	public Person(){
		System.out.println("�޲ι��췽����������");
	}
	public Person(String name){
		System.out.println("�вι��췽����������");
		this.name = name;
		//return;
	}
	
	public void setName(String name){
		//����Ա�����;ֲ�����ͬ��ʱ��ʹ�õ�ʱ����Ӿͽ�ԭ��
		//�����뽫�ֲ�������nameֵ��ֵ����Ա������nameֵ
		this.name = name;
	}
	public String getName(){
		/*
			1.��ȡ��ǰ������
			2.�жϵ�ǰ�������ǲ�����һ��ͯ��
			3.����ǣ��ͽ����ֺ���ƴ���ϡ�������
			
			�жϵ�ǰ�������ǲ��Ǹ�Ů���ҵ�ǰ���û��ǲ���Ů�ģ�����Ǽӡ�Ů��
		*/
		return name;
	}
	public void setSex(char sex){
		this.sex = sex;
	}
	public char getSex(){
		return sex;
	}
	
	//�õ����߱���ͨ�����ṩ�ķ������û��߻�ȡ��Ӧ����
	//���븳ֵ���������������
	public void setAge(int age){
		//�ڸ�ֵǰ���ҿ������ܶ�Ĳ���
		if(age<1 || age>260){
			System.out.println("�����õ����䲻������ʵ");
			return;
		}
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void setPassword(String password){
		//�����������ʱ�����
		this.password = password;
	}
	public String getPassword(){
		//��ȡ��ʱ�����
		return password;
	}
	public void show(){
		System.out.println("name="+name+",age="+age+",sex="+sex);
	}
}
/*
�̳����Ӹ��๹�췽���Ĺ�ϵ��
	�����ڳ�ʼ��ʱ����Ĭ�Ϸ��ʸ�����޲ι��췽��
	���������еĹ��췽����ִ�д����һ�ж���һ��Ĭ��super();
	���������û���޲εĹ��췽���أ�
		����������ͨ��super��ʾ��ȥ�����вι��췽��
	Ҳ����ͨ��this���ñ���Ĺ��췽��,��this�ĵ��ñ����ǹ������еĵ�һ�����
*/
class ExtendsDemo5{
	public static void main(String[] args){
		new Son4();
	}
}
class Father4{
	private String name;
	private int age;
	
	public Father4(){
		System.out.println("����Ĺ��췽����������");
	}
	public Father4(String name,int age){
		this.name = name;
		this.age = age;
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
class Son4 extends Father4{
	public Son4(String name,int age){
		super(name,age);
		//super();
		//������಻�ȳ�ʼ���������ڸ����ʼ��֮ǰ��ʹ�ø�������Ķ����ˣ�����һ��Ҫȷ�������ȳ�ʼ��
		//setName("aaa");
		
	}
	public Son4(){
		this("����",30);
	}
}
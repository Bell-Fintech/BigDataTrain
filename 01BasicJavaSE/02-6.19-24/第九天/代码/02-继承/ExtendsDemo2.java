/*
java�����е��඼ֱ�ӻ��߼�ӵĻ���Object
�̳кô���
	����˴���ĸ�����
		���Խ�һЩ�ظ��Ĵ�����ڸ�����
	����˴����ά����
	��������֮������˹�ϵ���Ƕ�̬��ǰ��
�ص㣺
	java��ֻ֧�ֵ��̳У���֧�ֶ�̳У�����֧�ֶ��̳�
*/
class Father{
	private String name;
	private int age;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age =age;
	}
	public int getAge(){
		return age;
	}
	
	public void sop(String msg){
		System.out.println();
	}
}
class A extends Father{
	public void test(){
		
	}
}
//Son��ͬʱ�̳�A��Father��������������ͬʱӵ��A��Father���е����Ժͷ���
class Son extends A{
	public void show(){
		sop("����");
	}
}
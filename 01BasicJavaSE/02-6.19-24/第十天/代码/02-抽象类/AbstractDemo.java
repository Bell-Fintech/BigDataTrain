/*
�����ࣺ�ڸ�������Щ���ܲ��ܸ��������ʵ��ʱ�����Խ�������ܶ���ɳ���ģ������г����ܵ�����붨��ɳ�����
������Ķ����ʽ��
	abstract class ����
	public abstract void ������();
������ĳ�Ա�ص㣺
	��Ա�����������ǳ����������Ǳ���
	��Ա������
		�����Ǿ���ķ�������ߴ���ĸ�����
		�����ǳ���ķ���������ǿ��Ҫ���������ʵ��
	���췽�����й��췽�������������ʼ���������ݵ�
*/
class AbstractDemo{
	public static void main(String[] args){
		// Animal�ǳ����; �޷�ʵ����
		//new Animal();
	}
}
//Animal���ǳ����, ����δ����Animal�еĳ��󷽷�eat()
abstract class Animal{
	//����
	private String name;
	//����
	private final int AGE = 10;
	
	public Animal(){
		
	}
	
	// ȱ�ٷ�������, ����������
	public abstract void eat();
	public void show(){
		
	}
}
/*
�ӿڸ�������һЩ����Ĺ��ܲ���ĳһ�����ﶼ���е�ʱ��
	���Խ���Щ���ܶ��嵽�ӿ��У�������Щ������Ҫ������Щ����ʱֻ��Ҫʵ������ӿڼ���
�ӿڵĸ�ʽ��
	interface �ӿ���
	
	jump():����
	compute():����
�ӿ����ʵ������
	������һ��������ʵ�֣�Ȼ��ʵ�������࣬���Ҳ�����ӿڶ�̬
��ôʵ���أ�
	����ͨ��implements�ؼ��ֽ���ʵ��
	class ���� implements �ӿ���
�ӿڵ������ص㣺
	Ҫôʵ�ֽӿ���������г��󷽷�
	Ҫô������ඨ��Ϊ������
*/
class InterfaceDemo{
	public static void main(String[] args){
		// AnimalInter�ǳ����; �޷�ʵ����
		//new AnimalInter();
		AnimalInter ai = new DogHuang();
		ai.jump();
		ai.compute();
		//DogHuang a = (DogHuang)ai;
		//a.eatFood();
		//ai.eatFood();
		Animal ai2 = new DogHuang();
		ai2.eatFood();
		//ai2.jump();
	}
}
interface AnimalInter{
	public abstract void jump();
	public abstract void compute();
}
abstract class Animal{
	private String name;
	private int age;
	private String color;
	
	public abstract void eatFood();
	
	public Animal(){
		
	}
	
	public Animal(String name,int age,String color){
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public void sop(Object obj){
		System.out.println(obj);
	}
}
class DogWang extends Animal{
	public void eatFood(){
		System.out.println("�����Ź�");
	}
}
class DogHuang extends Animal implements AnimalInter{
	public void eatFood(){
		System.out.println("���Թ���");
	}
	public void jump(){
		System.out.println("ѵ���������");
	}
	public void compute(){
		System.out.println("ѵ����Ƽ���");
	}
}
/*
��һȺ���ʨ�ӣ����ӣ����࣬���Ƕ���ë������ɫ���������ԣ�������˯����ѵ����Ϊ��������Ҫ�Ժ��������ٶȽ��е���ѵ����
������ѧ֪ʶ���������������������Щ�����࣬��Щ�ӿڣ���Щ�����ࡣ
������ࣺ
	ʨ�ӣ�lion
	���ӣ�monkey
	���ࣺdolphin
�����ࣺ
	���Animal
�ӿڣ�
	��������
*/
class Test3{
	public static void main(String[] args){
		/*Lion l = new Lion();
		l.sleep();
		l.train();*/
		show(new Lion());
		show(new Monkey());
		show(new Dolphin());
	}
	public static void show(Animal a){
		//�ж�a�ǲ��Ǻ�������
		if(a instanceof Monkey){
			ClimbTreeInter cti = (ClimbTreeInter)a;
			cti.climbTree();
		}
		a.sleep();
		a.train();
		System.out.println("-----------------------------");
	}
}
interface ClimbTreeInter{
	void climbTree();
}
abstract class Animal{
	private String name;
	private String color;
	private int age;
	
	public Animal(){
		
	}
	public Animal(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age =age;
	}
	
	public abstract void sleep();
	public abstract void train();
	public void sop(Object obj){
		System.out.println(obj);
	}
}
class Lion extends Animal{
	public Lion(){
		super("ʨ��","��ë",3);
	}
	public void sleep(){
		sop("ʨ�Ӱ���˯��");
	}
	public void train(){
		sop("ѵ��ʨ������Ȧ");
	}
}
class Monkey extends Animal implements ClimbTreeInter{
	public Monkey(){
		super("����","��ɫ",5);
	}
	public void sleep(){
		sop("��������˯��");
	}
	public void train(){
		sop("ѵ�������ﳵ");
	}
	public void climbTree(){
		sop("ѵ�����������ٶ�");
	}
}
class Dolphin extends Animal{
	public Dolphin(){
		super("����","��ɫ",2);
	}
	public void sleep(){
		sop("��������˯��");
	}
	public void train(){
		sop("ѵ�����ඥ��");
	}
}
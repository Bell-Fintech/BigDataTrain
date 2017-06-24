/*
有一群动物，狮子，猴子，海豚，他们都有毛发的颜色，年龄属性，还都有睡觉和训练行为，现在需要对猴子爬树速度进行单独训练，
请用所学知识：分析，这个案例中有哪些抽象类，哪些接口，哪些具体类。
具体的类：
	狮子：lion
	猴子：monkey
	海豚：dolphin
抽象类：
	动物：Animal
接口：
	猴子爬树
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
		//判断a是不是猴子类型
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
		super("狮子","金毛",3);
	}
	public void sleep(){
		sop("狮子白天睡觉");
	}
	public void train(){
		sop("训练狮子跳火圈");
	}
}
class Monkey extends Animal implements ClimbTreeInter{
	public Monkey(){
		super("猴子","棕色",5);
	}
	public void sleep(){
		sop("猴子晚上睡觉");
	}
	public void train(){
		sop("训练猴子骑车");
	}
	public void climbTree(){
		sop("训练猴子爬树速度");
	}
}
class Dolphin extends Animal{
	public Dolphin(){
		super("海豚","白色",2);
	}
	public void sleep(){
		sop("海豚晚上睡觉");
	}
	public void train(){
		sop("训练海豚顶球");
	}
}
class TestDemo3{
	public static void main(String[] args){
	  Person p=new Person("zd",513,421);
	  p.show();
	  Person p1=new Person();
	  p1.setName("xzh");
	  p1.setNum(950);
	  p1.setWage(423);
	  p1.show();
	}
}
class Person{
	private String name;
	private int num;
	private int wage;
	public Person(){
		
	}
	public Person(String name,int num,int wage){
		this.name=name;
		this.num=num;
		this.wage=wage;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setNum(int num){
		this.num=num;
	}
	public int getNum(){
		return num;
	}
	public void setWage(int wage){
		this.wage=wage;
	}
	public int getWage(){
		return wage;
	}
	public void show(){
		System.out.println("staff's name="+name+",num="+num+",wage"+wage);
	}
}
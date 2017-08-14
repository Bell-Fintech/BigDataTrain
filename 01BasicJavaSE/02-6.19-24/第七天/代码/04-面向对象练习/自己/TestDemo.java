class TestDemo{
	public static void main(String[] args){
		Demo d=new Demo();
		int rs=d.add(10,20);
		System.out.println("int两数之和为:"+rs);
		
		d.add1(20,29);
		
	}
}
class Demo{
	public int add(int a,int b){
		return a+b;
	}
	public void add1(int a,int b){
		System.out.println("void两数之和为:"+(a+b));
	}
}
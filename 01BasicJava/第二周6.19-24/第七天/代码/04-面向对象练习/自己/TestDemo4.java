class TestDemo4{
	public static void main(String[] args){
		MyMath my=new MyMath();
		int a=20;
		int b=20;
		//my.setA(10);
		//my.setB(20);
		my.add(a,b);
		my.sub(a,b);
		my.mul(a,b);
		my.div(a,b);
	}
}
class MyMath{
	//static  MyMath.add()
	public int add(int a,int b){
		System.out.println("addΪ:"+(a+b));
		return a+b;
	}
	public int sub(int a,int b){
		System.out.println("subΪ:"+(a-b));
		return a-b;
	}
	public int mul(int a,int b){
		System.out.println("mulΪΪ:"+(a*b));
		return a*b;
	}
	public int div(int a,int b){
		System.out.println("divΪ:"+(a/b));
		return a/b;
	}
	/*
	private int a;
	private int b;
	public MyMath(){
		
	}
	public MyMath(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void setA(int a){
		this.a=a;
	}
	public int getA(int a){
		return a;
	}
	public void setB(int b){
		this.b=b;
	}
	public int getB(int b){
		return b;
	}
	*/
	
}
//定义一个类MyMath,提供基本的加减乘除功能，然后进行测试。
//add，sub，mul，div   
class MyMathTest{
	public static void main(String[] args){
		int a = 10,b = 2;
		//MyMath mm = new MyMath();//MyMath()可以在MyMath中访问private
		MyMath mm = MyMath.getInstance();
		System.out.println("加法的结果："+mm.add(a,b));
		System.out.println("减法的结果："+mm.sub(a,b));
		System.out.println("乘法的结果："+mm.mul(a,b));
		System.out.println("除法的结果："+mm.div(a,b));
	}
}

//构造方法私有化了，但是里面的方法又不是静态的。如何调用里面的方法呢？
class MyMath{
	private MyMath(){
		
	}
	//因为外部无法创建本类的对象，所以这个提供本类对象方法只能是静态的
	public static MyMath getInstance(){
		return new MyMath();//类似于工厂设计模式
	}
	public  int add(int a,int b){
		return a+b;
	}
	public  int sub(int a,int b){
		return a-b;
	}
	public  int mul(int a,int b){
		return a*b;
	}
	public  int div(int a,int b){
		return a/b;
	}
}
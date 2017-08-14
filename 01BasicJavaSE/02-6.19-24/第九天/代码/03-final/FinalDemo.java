/*
final：最终的意思，它可以修饰类，方法，变量
	修饰类：被修饰的类无法被继承
	修饰方法：修饰的类无法被重写
	修饰变量：变量就成了常量，常量只能被赋值一次
*/
class FinalDemo{
	static final String PATH = "https://www.baidu.com/";
	public static void main(String[] args){
		final int A;
		A = 10;
		System.out.println(A);
		//A = 200;//无法为最终变量a分配值
		//System.out.println(A);
	}
}
class Father{
	public final void show(){
		
	}
}
//无法从最终Father进行继承
class Son extends Father{
	/*被覆盖的方法为final
	public void show(){
		
	}*/
}
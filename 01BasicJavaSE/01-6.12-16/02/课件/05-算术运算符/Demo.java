/*
运算符：运算符都会有一个结果进行返回

算术运算符：+、-、*、/

+：正号，加法，字符串拼接符

/：取的商值
%：取的余数

除法：如果两个整数之间做运算，最终的结果是整数，如果想要得到小数，可以在除数或者被除数后面乘以1.0f


*/
class Demo{
	public static void main(String[] args){
		int a = 10,b = 2;
		System.out.println(a+b);//12
		System.out.println(a-b);//8
		System.out.println(a*b);//20
		System.out.println(a/b);//5
		
		b = 3;
		System.out.println("商为："+a/b+",余数为："+a%b);//商为：3,余数为：1
		
		a = 1;
		b = 2;
		System.out.println(a/(b*1.0f));
	}
}
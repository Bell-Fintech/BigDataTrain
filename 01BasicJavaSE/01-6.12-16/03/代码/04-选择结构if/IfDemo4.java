/*
if语句格式2：
	if(关系表达式){
		语句体1；
	}else{
		语句体2
	}
三目运算符格式：关系表达式?表示1:表达式2；

三目运算符都实现的，用if语句都可以实现；反之不成立
什么时候不成立？
	当控制的语句是一条输出语句的时候，三目运算符就实现不了，因为三目运算符是一个运算符，必须有一个结果进行返回
*/
import java.util.Scanner;
class IfDemo4{
	public static void main(String[] args){
		//需求：将两个数值中的最大值取出，然后再输出
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();
		
		
		/*用if语句实现
		
		int max;
		
		if(a>b){
			max = a;
		}else{
			max = b;
		}
		
		//用三目运算符实现
		max = a>b?a:b;
		
		System.out.println("max="+max);*/
		
		//需求：将两个数值中的最大值直接输出
		/*用if语句实现
		if(a>b){
			System.out.println("最大值是"+a);
		}else{
			System.out.println("最大值是"+b);
		}*/
		//用三目运算符实现
		//a>b?System.out.println("最大值是"+a):System.out.println("最大值是"+b);
		
	}
}
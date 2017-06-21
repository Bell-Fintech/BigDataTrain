//定义一个类Demo,其中定义一个求两个数据和的方法，定义一个测试了Test，进行测试。

import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();
		
		int sum = new Demo().getSum(a,b);
		System.out.println("sum="+sum);
	}
	
}
class Demo{
	public int getSum(int a,int b){
		return a+b;
	}
}

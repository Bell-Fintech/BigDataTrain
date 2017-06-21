import java.util.Scanner;
class ReturnTest{
	public static void main(String[] args){
		/*
		键盘录入两个数据，返回两个数中的较大值
		键盘录入两个数据，比较两个数是否相等
		键盘录入三个数据，返回三个数中的最大值
		*/
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int maxAb=maxInt(a,b);
		System.out.println("两个数中的较大值为:"+maxAb);
		
		boolean equalsAb=equals(a,b);
		System.out.println("两个数是否相等:"+equalsAb);
		
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		float f3=sc.nextFloat();
		float maxF123=maxFloat(f1,f2,f3);
		System.out.println("三个数中的最大值:"+maxF123);
	}
	public static int maxInt(int a,int b){
		//缺少两个数据 写参数
		int maxAb=a>b?a:b;
		return maxAb;
	}
	public static boolean equals(int a,int b){
		return a==b;
	}
	public static float maxFloat(float f1,float f2,float f3){
		float maxF123=(maxF123=f1>f2?f1:f2)>f3?maxF123:f3;
		return maxF123;
	}
}
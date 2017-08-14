/*
键盘录入两个数据，返回两个数中的较大值
键盘录入两个数据，比较两个数是否相等
键盘录入三个数据，返回三个数中的最大值
*/
import java.util.Scanner;
class MethodTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int y = sc.nextInt();
		System.out.println("请输入第三个整数：");
		int z = sc.nextInt();
		
		System.out.println("max="+getMax(getMax(x,y),z));
		
		boolean result = equals(x,y);
		//通过返回的boolean类型的值，打印自己文案
		if(result){
			System.out.println("你输入的前两个数相等");
		}else{
			System.out.println("你输入的前两个数不相等");
		}
		System.out.println("max="+getMax(x,y,z));
	}
	//键盘录入两个数据，返回两个数中的较大值
	public static int getMax(int a,int b){
		return a>b?a:b;
	}
	
	//键盘录入两个数据，比较两个数是否相等
	public static boolean equals(int a,int b){
		return a==b;
	}
	
	//键盘录入三个数据，返回三个数中的最大值
	public static int getMax(int a,int b,int c){
		int max = (max=a>b?a:b)>c?max:c;
		return max;
	}
}
/*

键盘录入两个long类型数据，获取这两个数据中的最大值，输出其结果



*/
import java.util.Scanner;
class Test2{
	public static void main(String[] args){
		//可以换行输入 可以空格输入 不可以，分隔
		
		//键盘录入两个int类型数据，并对这两个数据求和，输出其结果
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
		
		//键盘录入两个long类型数据，获取这两个数据中的最大值，输出其结果
		long l1=sc.nextLong();
		long l2=sc.nextLong();
		long rs=(l1>l2)?l1:l2;
		System.out.println(rs);
		
		//键盘录入三个float类型数据，获取这三个 数据中的最大值，输出其结果
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		float f3=sc.nextFloat();
		//float max=(f1>f2)?f1:f2;//float max=(((f1>f2)?f1:f2)>f3)?((f1>f2)?f1:f2):f3;
		//System.out.println((max>f3)?max:f3);
		float max=(max=(f1>f2)?f1:f2)>f3?max:f3;
		System.out.println(max);
		//键盘录入两个byte类型数据，比较这两个数据是否相等，输出其结果
		byte b1=sc.nextByte();
		byte b2=sc.nextByte();
		System.out.println(b1==b2);
		
	}
	
}
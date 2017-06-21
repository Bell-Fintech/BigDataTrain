

import java.util.Scanner;
public class ZdDayFiveTest4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int[] score=new int[8];
		input(score);
	}
	
//1.输入8个整数存入数组
  public static void input(int[] num){
	  System.out.println("请输入数组中的8个数：");
	  for(int i=0;i<num.length;i++){
		  num[i]=sc.nextInt();
		  if(num[i]<0||num[i]>100){
			  System.out.println("输入的数据有错误.");
			  //break; //还会执行下面的输出方法
			  return;
		  }
	  }
	  System.out.println("数组中的8个数为：");
	  //输出数组中的 8个整数
	  for(int i=0;i<num.length;i++){
		  System.out.print(num[i]+"	");
	  }
	  
	  //判断有多少个分数高于或等于平均分，有多少个分数低于平均分
	  int low=0,high=0,sum=0;
	  float ave=0;
	  for(int i=0;i<num.length;i++){
		  sum+=num[i];
	  }
	  System.out.println("\n"+"总数为"+sum);
	  ave=sum*1.0f/num.length;
	  System.out.println("平均为"+ave);
	  for(int i=0;i<num.length;i++){
		  if(num[i]>=ave)
			  high++;
		  else
			  low++;
	  }
	  System.out.println("有"+high+"个分数高于或等于平均分，有"+low+"个分数低于平均分");
  
  }
}

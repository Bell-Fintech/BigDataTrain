
import java.util.Scanner;
public class ZdDayFiveTest3 {
  public static void main(String[] args){
	  int[] num=new int[10];
	  Scanner sc=new Scanner(System.in);
	  System.out.println("请输入10个整数：");
	  for(int i=0;i<num.length;i++){
		  num[i]=sc.nextInt();
		  for(int j=0;j<num.length&&j<i;j++){
			  if(num[j]==num[i]){
				  System.out.println("你输入的整数有重复，请重新输入。");
				  num[i]=sc.nextInt();
			  }
		  }
	  }
	  for(int i=0;i<num.length;i++){
		  System.out.print(num[i]+"	");
	  }
  }
}

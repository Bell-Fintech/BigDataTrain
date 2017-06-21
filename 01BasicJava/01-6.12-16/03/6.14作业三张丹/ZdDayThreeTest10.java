/*
根据用户键盘录入的整数值，打印对应层级的数字金字塔图案
列入用户输入3那么打印图案如下所示：
	  1
	 222
	33333
1.是第几行就输出对应的值
2.从第二层开始每一层输出的数值都+2
3.从第一行开始到最后一行为止，每一行输出的空格都在递减
*/
import java.util.Scanner;
class ZdDayThreeTest10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//最外层循环控制层数
		for(int i=1;i<=num;i++){
			/*
			for(int j=0;j<(2*num-1)/2+1-i;j++){
				System.out.print("  ");
			}
			*/
			//左边的符号个数递减
			for(int j=1;j<=num-i;j++){
				System.out.print("  ");
			}
			//控制每一行输出的列数
			for(int j=0;j<2*i-1;j++){
			System.out.print(i);
			}
			System.out.println();
		}
		
	}
}
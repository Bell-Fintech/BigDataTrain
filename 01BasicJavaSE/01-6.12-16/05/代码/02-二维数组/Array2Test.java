/*
二维数组遍历
打印杨辉三角形(行数可以键盘录入)
打印出100-999所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身
*/
import java.util.Scanner;
class Array2Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//杨辉三角的行数
		int n=sc.nextInt();
		int[][] trigle=new int[n][n];
		//调用输出杨辉三角的方法
		printTrigle(n,trigle);
		
		//水仙花数
		//定义二维数组一维数组存放：num/10;个位;十位;百位。
		int[][] num=new int[1000][4];
		//定义一个一维数组存放个十百位立方和
		int[] sum=new int[1000];
		//调用水仙花数方法
		number(num,sum);
		
	}
	public static void printTrigle(int n,int[][] trigle){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				//第一列 和 对角线为1
				if(j==0||i==j)
					trigle[i][j]=1;
				//第三行第二列开始=上一行本列值+上一行前一列的值
				if(j>0&&i>0)
					trigle[i][j]=trigle[i-1][j]+trigle[i-1][j-1];
			}
		}
		//输出杨辉三角
		for(int i=0;i<n;i++){
			//左三角
			for(int j=0;j<=i;j++){
				System.out.print(trigle[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void number(int[][] num,int[] sum){
		//二维数组一维数组存放：num/10（while循环）;个位;十位;百位。
		//前99个数据为空
		for(int i=100;i<=999;i++){
			num[i-1][0]=i;//赋值一次就可以 以后还需要改变
			for(int j=1;j<4;j++){
				num[i-1][j]=num[i-1][0]%10;//个位 十位 千位
				num[i-1][0]/=10;//类似于while循环
			}
			//System.out.print("	"+num[i-1][1]+" 	"+num[i-1][2]+" 	"+num[i-1][3]);
		}
	    //每行第一列=100-999
		for(int i=100;i<=999;i++){
			num[i-1][0]=i;
			//System.out.print(num[i-1][0]+" ");
		}
		System.out.println("100-999所有的'水仙花数'有：");
		for(int i=100;i<=999;i++){
			//个 十 百
			for(int j=1;j<4;j++){
				//求十百位立方和
				sum[i-1]+=num[i-1][j]*num[i-1][j]*num[i-1][j];
			}
			//System.out.print(sum[i-1]+" ");
			//判断本数是否等于十百位立方和
			if(sum[i-1]==num[i-1][0]){
				System.out.print(num[i-1][0]+"	");
			}
		}
	}
	
}
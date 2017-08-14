/*
打印杨辉三角形(行数可以键盘录入)
	1
	1 1	
	1 2 1
	1 3 3 1
	1 4 6 4 1 
	1 5 10 10 5 1
特点：
	1.是第几行就输出几列
	2.每一行的第一列和最后一列值都是1
	3.从第三行开始第二列到倒数第二列的值=上一行上一行的值+上一行左一列的值
*/
import java.util.Scanner;
class ArrayTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要打印的杨辉三角层数：");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		//每一行的第一列和最后一列值都是1
		for(int i=0; i<arr.length; i++){
			//给第一列的值赋值为1
			arr[i][0] = 1;
			//给最后一列的值赋值为1
			arr[i][i] = 1;
		}
		
		//从第三行开始
		for(int i=2; i<arr.length; i++){
			//第二列到倒数第二列的值=上一行上一行的值+上一行左一列的值
			for(int j=1; j<i; j++){
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
		
		//是第几行就输出几列
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<=i; j++){
				System.out.print(arr[i][j]+"\t");
			}
			//换行
			System.out.println();
		}
	}
}
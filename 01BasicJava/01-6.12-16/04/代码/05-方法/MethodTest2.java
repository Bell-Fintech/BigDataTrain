/*
键盘录入行数和列数，输出对应的星形
*/
import java.util.Scanner;
class MethodTest2{
	public static void main(String[] args){
		/*
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		//控制行的for循环
		for(int i=0; i<4; i++){
			System.out.println("*****");
		}*/
		Scanner sc = new Scanner(System.in);
		//定义一个变量表示行
		System.out.println("请输入指定的行数：");
		int row = sc.nextInt();
		//定义一个变量表示列
		System.out.println("请输入指定列数：");
		int colum = sc.nextInt();
		
		printStart(row,colum);
	}
	
	public static void printStart(int row,int colum){
		//控制行的for循环
		for(int i=0; i<row; i++){
			//控制列的for循环
			for(int j=0; j<colum; j++){
				System.out.print("*");
			}
			System.out.println();//仅仅只输出了一个换行分隔符，在windows中换行分隔符：\r\n
		}
	}
}
//键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表
import java.util.Scanner;
class MethodTest3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入想要打印的n乘法表(1<=n<=9)：");
		int n = sc.nextInt();
		showMultiTable(n);

	}
	
	public static void showMultiTable(int n){
		//判断数据的正确性
		if(n<1 || n>9){
			System.out.println("你想打印的乘法表不存在");
			return;
		}
		
		//最外层控制行数
		for(int i=1; i<=n; i++){
			//内层控制的是列数
			for(int j=1; j<=i; j++){
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			//当一行输出完毕，需要换行
			System.out.println();
		}
	}
}
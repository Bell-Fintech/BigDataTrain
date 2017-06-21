/*
选择结构if语句格式2：
	if(关系表达式){
		语句体1;
	}else{
		语句体2；
	}
	执行流程：
		首先计算出关系表达式的值，看其结果是true还是false
		如果是true就执行语句体1
		如果是false就执行语句体2
*/
import java.util.Scanner;
class IfDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();
		if(a==b){
			System.out.println("a和b是相等的");
		}else{
			System.out.println("a和b是不相等的");
		}
	}
}
/*键盘录入数据，判断两个数据是否相同，并输出结果
键盘录入数据，输出两个数中较大的值，并输出结果
键盘录入数据，判断数据是奇数还是偶数*/
import java.util.Scanner;
class If2Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b){
			System.out.println("a 和 b相等");
		}
		else{
			System.out.println("a 和 b不相等");
		}
		if(a>b){
			System.out.println("a较大");
		}
		else{
			System.out.println("b较大");
		}
		if(a%2==0){
			System.out.println("a是偶数");
		}
		else{
			System.out.println("a是奇数");
		}
		
		
}
}

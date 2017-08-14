/*
因为到现在为止，我们用的数据都是伪造的，都是固定死的。但是在开发中数据都是动态变化的，所以我们可以模仿一下实际开发的应用场景。
键盘录入：
	导包
		import java.util.Scanner;
	创建对象
		Scanner sc = new Scanner(System.in);
	接收值
		int a = sc.nextInt();
		long b = sc.nextLong();
		byte c = sc.nextByte();
		...
		如果想接收一个字符串类型的值呢？
		String s = sc.nextLine();
		
java.util.InputMismatchException：如果输入的内容和接收的内容数据类型不匹配就会报错
*/
//导包
import java.util.Scanner;
class Demo{
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		//接收数据
		//int a = sc.nextInt();//阻塞式
		
		String result = sc.nextLine();
		
		System.out.println(result);
		System.out.println("over");
	}
}
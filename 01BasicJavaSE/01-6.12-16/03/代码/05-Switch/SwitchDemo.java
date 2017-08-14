/*
选择结构switch语句：
	switch(表达式){
		case 常量值1:
			语句体1;
			break;
		case 常量值2:
			语句体2;
			break;
		case 常量值3:
			语句体3;
			break;
		default:
			语句体n+1;
			break;
	}
	格式解析：
		switch：是一个关键字，代表分支语句
		表达式：可以取值为byte,short,int,long,char,String（JDK1.7）
		case：是匹配的意思，是将表达式的值和后面的常量值进行匹配的
		语句体：可以是一条或者多条语句
		break：是结束switch语句
		default：当所有的case都不匹配时，就执行default里面的语句
	执行流程：
		首先计算出表达式的值，然后和case后面的一一匹配，一旦匹配成功就会执行对应的语句体；当所有的case都不匹配时且有default时，
		那么就会执行default里面的语句体，这个default语句就相当于if语句里面的else
	注意事项：
		case后面跟的只能是常量值，不能是变量
		break可以省略吗？
			可以的，但是省略之后switch语句不会立马结束，会紧接着执行底下的下一个case里面的语句
		default可以省略吗？
			是可以的，如果你不想要默认值时就可以省略
		default和case的顺序必须是有序吗？
			不必有序
		switch语句何时结束？
			当遇到break时
			自动执行到程序末尾
	根据键盘录入的数值1，2，3，…7输出对应的星期一，星期二，星期三…星期日。
*/
import java.util.Scanner;
class SwitchDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入星期(1-7)：");
		int week = sc.nextInt();
		int i = 1;
		switch(week){
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;	
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("你输入的星期不存在");
				break;
			case 1://需要常量表达式
				System.out.println("星期一");
				break;
		}
	}
}
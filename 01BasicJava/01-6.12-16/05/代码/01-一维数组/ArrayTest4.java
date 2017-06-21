//数组查表法(根据键盘录入索引,查找对应星期)
import java.util.Scanner;
class ArrayTest4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要查找的星期(1-7)：");
		int week = sc.nextInt();
		findWeek(week);
	}
	
	public static void findWeek(int week){
		//判断一下数据的正确性
		if(week<1 || week>7){
			System.out.println("你输入的星期不存在.");
			return;
		}
		
		String[] weeks = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		System.out.println(weeks[week-1]);
	}
}
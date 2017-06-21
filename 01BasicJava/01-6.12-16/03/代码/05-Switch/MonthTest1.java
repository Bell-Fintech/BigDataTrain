import java.util.Scanner;
class MonthTest1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String month=sc.nextLine();
		switch(month){
			case "春季":
				System.out.println("3-5月");
				break;
			case "夏季":
				System.out.println("6-8月");
				break;
			case "秋季":
				System.out.println("9-11月");
				break;
			case "冬季":
				System.out.println("12-2月");
				break;
			default:
				System.out.println("季节无效");
		}
	}
}
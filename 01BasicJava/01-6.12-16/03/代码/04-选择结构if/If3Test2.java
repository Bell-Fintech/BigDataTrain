import java.util.Scanner;
class If3Test2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		if(month<1||month>12){
			System.out.println("输入的数据有误");
		}else if(month==12||month<3){
			System.out.println("冬季");
		}else if(month>=3&&month<6){
			System.out.println("春季");
		}else if(month>=6&&month<9){
			System.out.println("夏季");
		}else{
			System.out.println("秋季");
		}
		
	}
}
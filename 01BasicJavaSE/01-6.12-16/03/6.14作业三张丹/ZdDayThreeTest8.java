import java.util.Scanner;
class ZdDayThreeTest8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>100||score<0){
			System.out.println("输入的数据有误");
		}else if(score>=90&&score<=100){
			System.out.println("A等");
		}else if(score>=80&&score<90){
			System.out.println("B等");
		}else if(score>=70&&score<80){
			System.out.println("C等");
		}else if(score>=60&&score<70){
			System.out.println("D等");
		}else{
			System.out.println("E等");
		}
		
	}
}
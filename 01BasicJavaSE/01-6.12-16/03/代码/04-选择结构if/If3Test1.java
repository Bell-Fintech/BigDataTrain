import java.util.Scanner;
class If3Test1{
	public static void main(String[] agrs){
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			int y;
			if(x>=3){
				y=2*x+1;
			}else if(x>=-1&&x<1){
				y=2*x;
			}else if(x<-1){
				y=2*x-1;
			}else{
				Syste.out.println("ÊäÈëÓÐÎó");
			}
			System.out.println("y="+y);
	}
}
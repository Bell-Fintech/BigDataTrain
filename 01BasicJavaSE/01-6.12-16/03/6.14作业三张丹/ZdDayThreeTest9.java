import java.util.Scanner;
class ZdDayThreeTest9{
	public static void main(String[] args){
		int rs=1;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1)
			rs=1;
		for(;num>0;num--){
			rs *= num;
		}
		System.out.println("½×³Ë:"+rs);
	}
}
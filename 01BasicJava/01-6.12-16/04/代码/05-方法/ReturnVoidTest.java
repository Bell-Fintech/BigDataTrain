/*
����¼�������������������Ӧ������
����¼��һ������n(1<=n<=9)�������Ӧ��nn�˷���
*/
import java.util.Scanner;
class ReturnVoidTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		star(row,col);
		mul(row);
	}
	public static void star(int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void mul(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"	");
			}
			System.out.println();
		}
	}
}
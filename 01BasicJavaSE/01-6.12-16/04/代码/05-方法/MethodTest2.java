/*
����¼�������������������Ӧ������
*/
import java.util.Scanner;
class MethodTest2{
	public static void main(String[] args){
		/*
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		//�����е�forѭ��
		for(int i=0; i<4; i++){
			System.out.println("*****");
		}*/
		Scanner sc = new Scanner(System.in);
		//����һ��������ʾ��
		System.out.println("������ָ����������");
		int row = sc.nextInt();
		//����һ��������ʾ��
		System.out.println("������ָ��������");
		int colum = sc.nextInt();
		
		printStart(row,colum);
	}
	
	public static void printStart(int row,int colum){
		//�����е�forѭ��
		for(int i=0; i<row; i++){
			//�����е�forѭ��
			for(int j=0; j<colum; j++){
				System.out.print("*");
			}
			System.out.println();//����ֻ�����һ�����зָ�������windows�л��зָ�����\r\n
		}
	}
}
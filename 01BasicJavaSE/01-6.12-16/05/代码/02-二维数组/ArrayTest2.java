/*
��ӡ���������(�������Լ���¼��)
	1
	1 1	
	1 2 1
	1 3 3 1
	1 4 6 4 1 
	1 5 10 10 5 1
�ص㣺
	1.�ǵڼ��о��������
	2.ÿһ�еĵ�һ�к����һ��ֵ����1
	3.�ӵ����п�ʼ�ڶ��е������ڶ��е�ֵ=��һ����һ�е�ֵ+��һ����һ�е�ֵ
*/
import java.util.Scanner;
class ArrayTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ��ӡ��������ǲ�����");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		//ÿһ�еĵ�һ�к����һ��ֵ����1
		for(int i=0; i<arr.length; i++){
			//����һ�е�ֵ��ֵΪ1
			arr[i][0] = 1;
			//�����һ�е�ֵ��ֵΪ1
			arr[i][i] = 1;
		}
		
		//�ӵ����п�ʼ
		for(int i=2; i<arr.length; i++){
			//�ڶ��е������ڶ��е�ֵ=��һ����һ�е�ֵ+��һ����һ�е�ֵ
			for(int j=1; j<i; j++){
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
		
		//�ǵڼ��о��������
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<=i; j++){
				System.out.print(arr[i][j]+"\t");
			}
			//����
			System.out.println();
		}
	}
}
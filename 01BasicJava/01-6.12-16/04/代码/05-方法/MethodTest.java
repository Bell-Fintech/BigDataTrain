/*
����¼���������ݣ������������еĽϴ�ֵ
����¼���������ݣ��Ƚ��������Ƿ����
����¼���������ݣ������������е����ֵ
*/
import java.util.Scanner;
class MethodTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��������");
		int x = sc.nextInt();
		System.out.println("������ڶ���������");
		int y = sc.nextInt();
		System.out.println("�����������������");
		int z = sc.nextInt();
		
		System.out.println("max="+getMax(getMax(x,y),z));
		
		boolean result = equals(x,y);
		//ͨ�����ص�boolean���͵�ֵ����ӡ�Լ��İ�
		if(result){
			System.out.println("�������ǰ���������");
		}else{
			System.out.println("�������ǰ�����������");
		}
		System.out.println("max="+getMax(x,y,z));
	}
	//����¼���������ݣ������������еĽϴ�ֵ
	public static int getMax(int a,int b){
		return a>b?a:b;
	}
	
	//����¼���������ݣ��Ƚ��������Ƿ����
	public static boolean equals(int a,int b){
		return a==b;
	}
	
	//����¼���������ݣ������������е����ֵ
	public static int getMax(int a,int b,int c){
		int max = (max=a>b?a:b)>c?max:c;
		return max;
	}
}
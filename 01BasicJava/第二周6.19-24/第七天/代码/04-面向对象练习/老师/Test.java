//����һ����Demo,���ж���һ�����������ݺ͵ķ���������һ��������Test�����в��ԡ�

import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��������");
		int a = sc.nextInt();
		System.out.println("������ڶ���������");
		int b = sc.nextInt();
		
		int sum = new Demo().getSum(a,b);
		System.out.println("sum="+sum);
	}
	
}
class Demo{
	public int getSum(int a,int b){
		return a+b;
	}
}

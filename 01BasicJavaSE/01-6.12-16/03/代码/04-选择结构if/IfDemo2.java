/*
ѡ��ṹif����ʽ2��
	if(��ϵ���ʽ){
		�����1;
	}else{
		�����2��
	}
	ִ�����̣�
		���ȼ������ϵ���ʽ��ֵ����������true����false
		�����true��ִ�������1
		�����false��ִ�������2
*/
import java.util.Scanner;
class IfDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��������");
		int a = sc.nextInt();
		System.out.println("������ڶ���������");
		int b = sc.nextInt();
		if(a==b){
			System.out.println("a��b����ȵ�");
		}else{
			System.out.println("a��b�ǲ���ȵ�");
		}
	}
}
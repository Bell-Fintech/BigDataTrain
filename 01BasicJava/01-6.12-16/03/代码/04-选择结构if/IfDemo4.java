/*
if����ʽ2��
	if(��ϵ���ʽ){
		�����1��
	}else{
		�����2
	}
��Ŀ�������ʽ����ϵ���ʽ?��ʾ1:���ʽ2��

��Ŀ�������ʵ�ֵģ���if��䶼����ʵ�֣���֮������
ʲôʱ�򲻳�����
	�����Ƶ������һ���������ʱ����Ŀ�������ʵ�ֲ��ˣ���Ϊ��Ŀ�������һ���������������һ��������з���
*/
import java.util.Scanner;
class IfDemo4{
	public static void main(String[] args){
		//���󣺽�������ֵ�е����ֵȡ����Ȼ�������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��������");
		int a = sc.nextInt();
		System.out.println("������ڶ���������");
		int b = sc.nextInt();
		
		
		/*��if���ʵ��
		
		int max;
		
		if(a>b){
			max = a;
		}else{
			max = b;
		}
		
		//����Ŀ�����ʵ��
		max = a>b?a:b;
		
		System.out.println("max="+max);*/
		
		//���󣺽�������ֵ�е����ֱֵ�����
		/*��if���ʵ��
		if(a>b){
			System.out.println("���ֵ��"+a);
		}else{
			System.out.println("���ֵ��"+b);
		}*/
		//����Ŀ�����ʵ��
		//a>b?System.out.println("���ֵ��"+a):System.out.println("���ֵ��"+b);
		
	}
}
/*

����¼������long�������ݣ���ȡ�����������е����ֵ���������



*/
import java.util.Scanner;
class Test2{
	public static void main(String[] args){
		//���Ի������� ���Կո����� �����ԣ��ָ�
		
		//����¼������int�������ݣ�����������������ͣ��������
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
		
		//����¼������long�������ݣ���ȡ�����������е����ֵ���������
		long l1=sc.nextLong();
		long l2=sc.nextLong();
		long rs=(l1>l2)?l1:l2;
		System.out.println(rs);
		
		//����¼������float�������ݣ���ȡ������ �����е����ֵ���������
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		float f3=sc.nextFloat();
		//float max=(f1>f2)?f1:f2;//float max=(((f1>f2)?f1:f2)>f3)?((f1>f2)?f1:f2):f3;
		//System.out.println((max>f3)?max:f3);
		float max=(max=(f1>f2)?f1:f2)>f3?max:f3;
		System.out.println(max);
		//����¼������byte�������ݣ��Ƚ������������Ƿ���ȣ��������
		byte b1=sc.nextByte();
		byte b2=sc.nextByte();
		System.out.println(b1==b2);
		
	}
	
}
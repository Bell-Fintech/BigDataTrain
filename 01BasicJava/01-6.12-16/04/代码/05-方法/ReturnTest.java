import java.util.Scanner;
class ReturnTest{
	public static void main(String[] args){
		/*
		����¼���������ݣ������������еĽϴ�ֵ
		����¼���������ݣ��Ƚ��������Ƿ����
		����¼���������ݣ������������е����ֵ
		*/
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int maxAb=maxInt(a,b);
		System.out.println("�������еĽϴ�ֵΪ:"+maxAb);
		
		boolean equalsAb=equals(a,b);
		System.out.println("�������Ƿ����:"+equalsAb);
		
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		float f3=sc.nextFloat();
		float maxF123=maxFloat(f1,f2,f3);
		System.out.println("�������е����ֵ:"+maxF123);
	}
	public static int maxInt(int a,int b){
		//ȱ���������� д����
		int maxAb=a>b?a:b;
		return maxAb;
	}
	public static boolean equals(int a,int b){
		return a==b;
	}
	public static float maxFloat(float f1,float f2,float f3){
		float maxF123=(maxF123=f1>f2?f1:f2)>f3?maxF123:f3;
		return maxF123;
	}
}
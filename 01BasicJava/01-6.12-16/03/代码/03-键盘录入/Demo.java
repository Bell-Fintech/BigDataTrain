/*
��Ϊ������Ϊֹ�������õ����ݶ���α��ģ����ǹ̶����ġ������ڿ��������ݶ��Ƕ�̬�仯�ģ��������ǿ���ģ��һ��ʵ�ʿ�����Ӧ�ó�����
����¼�룺
	����
		import java.util.Scanner;
	��������
		Scanner sc = new Scanner(System.in);
	����ֵ
		int a = sc.nextInt();
		long b = sc.nextLong();
		byte c = sc.nextByte();
		...
		��������һ���ַ������͵�ֵ�أ�
		String s = sc.nextLine();
		
java.util.InputMismatchException�������������ݺͽ��յ������������Ͳ�ƥ��ͻᱨ��
*/
//����
import java.util.Scanner;
class Demo{
	public static void main(String[] args){
		//��������
		Scanner sc = new Scanner(System.in);
		//��������
		//int a = sc.nextInt();//����ʽ
		
		String result = sc.nextLine();
		
		System.out.println(result);
		System.out.println("over");
	}
}
//������(���ݼ���¼������,���Ҷ�Ӧ����)
import java.util.Scanner;
class ArrayTest4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ�����(1-7)��");
		int week = sc.nextInt();
		findWeek(week);
	}
	
	public static void findWeek(int week){
		//�ж�һ�����ݵ���ȷ��
		if(week<1 || week>7){
			System.out.println("����������ڲ�����.");
			return;
		}
		
		String[] weeks = {"����һ","���ڶ�","������","������","������","������","������"};
		System.out.println(weeks[week-1]);
	}
}
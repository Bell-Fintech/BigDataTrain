/*����¼�����ݣ��ж����������Ƿ���ͬ����������
����¼�����ݣ�����������нϴ��ֵ����������
����¼�����ݣ��ж���������������ż��*/
import java.util.Scanner;
class If2Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b){
			System.out.println("a �� b���");
		}
		else{
			System.out.println("a �� b�����");
		}
		if(a>b){
			System.out.println("a�ϴ�");
		}
		else{
			System.out.println("b�ϴ�");
		}
		if(a%2==0){
			System.out.println("a��ż��");
		}
		else{
			System.out.println("a������");
		}
		
		
}
}

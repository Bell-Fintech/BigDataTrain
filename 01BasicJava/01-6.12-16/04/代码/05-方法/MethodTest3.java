//����¼��һ������n(1<=n<=9)�������Ӧ��nn�˷���
import java.util.Scanner;
class MethodTest3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ӡ��n�˷���(1<=n<=9)��");
		int n = sc.nextInt();
		showMultiTable(n);

	}
	
	public static void showMultiTable(int n){
		//�ж����ݵ���ȷ��
		if(n<1 || n>9){
			System.out.println("�����ӡ�ĳ˷�������");
			return;
		}
		
		//������������
		for(int i=1; i<=n; i++){
			//�ڲ���Ƶ�������
			for(int j=1; j<=i; j++){
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			//��һ�������ϣ���Ҫ����
			System.out.println();
		}
	}
}
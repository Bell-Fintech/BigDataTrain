/*
�����û�����¼�������ֵ����ӡ��Ӧ�㼶�����ֽ�����ͼ��
�����û�����3��ô��ӡͼ��������ʾ��
	  1
	 222
	33333
1.�ǵڼ��о������Ӧ��ֵ
2.�ӵڶ��㿪ʼÿһ���������ֵ��+2
3.�ӵ�һ�п�ʼ�����һ��Ϊֹ��ÿһ������Ŀո��ڵݼ�
*/
import java.util.Scanner;
class ZdDayThreeTest10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//�����ѭ�����Ʋ���
		for(int i=1;i<=num;i++){
			/*
			for(int j=0;j<(2*num-1)/2+1-i;j++){
				System.out.print("  ");
			}
			*/
			//��ߵķ��Ÿ����ݼ�
			for(int j=1;j<=num-i;j++){
				System.out.print("  ");
			}
			//����ÿһ�����������
			for(int j=0;j<2*i-1;j++){
			System.out.print(i);
			}
			System.out.println();
		}
		
	}
}
/*
��ά�������
��ӡ���������(�������Լ���¼��)
��ӡ��100-999���е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
*/
import java.util.Scanner;
class Array2Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//������ǵ�����
		int n=sc.nextInt();
		int[][] trigle=new int[n][n];
		//�������������ǵķ���
		printTrigle(n,trigle);
		
		//ˮ�ɻ���
		//�����ά����һά�����ţ�num/10;��λ;ʮλ;��λ��
		int[][] num=new int[1000][4];
		//����һ��һά�����Ÿ�ʮ��λ������
		int[] sum=new int[1000];
		//����ˮ�ɻ�������
		number(num,sum);
		
	}
	public static void printTrigle(int n,int[][] trigle){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				//��һ�� �� �Խ���Ϊ1
				if(j==0||i==j)
					trigle[i][j]=1;
				//�����еڶ��п�ʼ=��һ�б���ֵ+��һ��ǰһ�е�ֵ
				if(j>0&&i>0)
					trigle[i][j]=trigle[i-1][j]+trigle[i-1][j-1];
			}
		}
		//����������
		for(int i=0;i<n;i++){
			//������
			for(int j=0;j<=i;j++){
				System.out.print(trigle[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void number(int[][] num,int[] sum){
		//��ά����һά�����ţ�num/10��whileѭ����;��λ;ʮλ;��λ��
		//ǰ99������Ϊ��
		for(int i=100;i<=999;i++){
			num[i-1][0]=i;//��ֵһ�ξͿ��� �Ժ���Ҫ�ı�
			for(int j=1;j<4;j++){
				num[i-1][j]=num[i-1][0]%10;//��λ ʮλ ǧλ
				num[i-1][0]/=10;//������whileѭ��
			}
			//System.out.print("	"+num[i-1][1]+" 	"+num[i-1][2]+" 	"+num[i-1][3]);
		}
	    //ÿ�е�һ��=100-999
		for(int i=100;i<=999;i++){
			num[i-1][0]=i;
			//System.out.print(num[i-1][0]+" ");
		}
		System.out.println("100-999���е�'ˮ�ɻ���'�У�");
		for(int i=100;i<=999;i++){
			//�� ʮ ��
			for(int j=1;j<4;j++){
				//��ʮ��λ������
				sum[i-1]+=num[i-1][j]*num[i-1][j]*num[i-1][j];
			}
			//System.out.print(sum[i-1]+" ");
			//�жϱ����Ƿ����ʮ��λ������
			if(sum[i-1]==num[i-1][0]){
				System.out.print(num[i-1][0]+"	");
			}
		}
	}
	
}
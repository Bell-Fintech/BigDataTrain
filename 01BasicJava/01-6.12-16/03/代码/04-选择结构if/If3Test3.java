//����¼���������ݣ�Ȼ���ȡ���ֵ

import java.util.Scanner;
class If3Test3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//int max=(max=a>b?a:b)>c?max:c;
		int max=0;
		if(a>=b&&a>=c){
			max=a;
		}else if(b>=a&&b>=c){
			max=b;
		}else if(c>=a&&c>=b){
			max=c;
		}
		
		/*
		//���ȱȽ�a��b��ֵ
		if(a>b){
			//��������ߵ������ˣ�˵��a��b��
			//�Ƚ�a��c
			if(a>c){
				//��������ߵ������˵�����ֵ��a
				max = a;
			}else{
				//��������ߵ������˵�����ֵ��c
				max = c;
			}
		}else{
			//��������ߵ������ˣ�˵��b��a��
			//�Ƚ�b��c
			if(b>c){
				//��������ߵ����˵�����ֵ��b
				max = b;
			}else{
				//��������ߵ����˵�����ֵ��c
				max = c;
			}
		}*/
		/*
		if(a>b){
			//��������ߵ������ˣ�˵��a��b��
			//�Ƚ�a��c
			if(a>c){
				//��������ߵ������˵�����ֵ��a
				max = a;
			}else{
				//��������ߵ������˵�����ֵ��c
				max = c;
			}
		}else if(b>c){//��������ߵ������ˣ�˵��b��a��
			//��������ߵ����˵�����ֵ��b
			max = b;		
		}else{//��������ߵ����˵�����ֵ��c
			max = c;
		}
		*/
		System.out.println("max="+max);
	}
}
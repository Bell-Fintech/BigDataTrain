/*
�������(������������е�ÿһ��Ԫ��)
�����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
����Ԫ������ (���ǰ�Ԫ�ضԵ�)
������(���ݼ���¼������,���Ҷ�Ӧ����)
����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
*/
import java.util.Scanner;
class ArrayTest1

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		//�������(������������е�ÿһ��Ԫ��)
		int[] a={1,2,2};
		System.out.println("����a�е�ֵ������������");
		for(int  i=0;i<a.length;i++){
			System.out.print(a[i]+"	");
		}
		System.out.println();
		
		
		//����Ԫ������ (���ǰ�Ԫ�ضԵ�)
		System.out.println("����a�е�ֵ������������");
		for(int  i=a.length-1;i>=0;i--){
			System.out.print(a[i]+"	");
		}
		System.out.println();
		
		
		//����¼�������е����ݵķ�ʽ  ���������(������������е�ÿһ��Ԫ��)
		int[] b=new int[5];
		System.out.println("��������b�е�ֵ��");
		for(int  i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		}
		System.out.println("����b�е�ֵ������������");
		for(int  i=0;i<b.length;i++){
			System.out.print(b[i]+"	");
		}
		System.out.println();
		
		
		System.out.println("����b�е�ֵ������������");
		for(int  i=b.length-1;i>=0;i--){
			System.out.print(b[i]+"	");
		}
		System.out.println();
		
		//����b��ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
		int maxI=b[0];
		int minI=b[0];
	    for(int i=0;i<b.length;i++){
           if (b[i]<minI)
               minI=b[i];
           if(b[i]>maxI)
              maxI=b[i];
        }
		System.out.println("����b�е����ֵ��"+maxI+"����Сֵ��"+minI);
		
		//����a��ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
		int max=(max=a[0]>a[1]?a[0]:a[1])>a[2]?max:a[2];
		int min=(max=a[0]<a[1]?a[0]:a[1])<a[2]?max:a[2];
		System.out.println("����a�е����ֵ��"+max+";��Сֵ��"+min);
		
		
		//������(���ݼ���¼������,���Ҷ�Ӧ����)
		System.out.println("����¼������������");
		String[] week={"������","��һ","�ܶ�","����","����","����","����","����"};
		int index=sc.nextInt();
		if(index>=0&&index<8){
			System.out.println("���ݼ���¼�������,���ҵ��Ķ�Ӧ����Ϊ��"+week[index]);
		}else{
			System.out.println("����¼�����������");
		}
		
		//����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
		System.out.println("����¼��ָ��Ԫ�أ��鿴������a�е�������");
		int rs=sc.nextInt();
		for(int  i=0;i<a.length;i++){
			if(rs==a[i]){			
				System.out.println("ָ��Ԫ��"+rs+"��һ���������г��ֵ�����Ϊ��"+i);
				break;
			}
			if(i==a.length-1&&rs!=a[i])
				System.out.println("��ָ��Ԫ�ز�����");

		}
		
		
	}
}
/*
��ӡ��100-999���е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
	abc=a*a*a+b*b*b+c*c*c;
	�����õ�ÿ��λ�϶�Ӧ����ֵ��
		��λ��123%10=3
		ʮλ��123/10%10=2
		��λ��123/100%10=1
		
	153
	370
	371
	407
*/
class Test{
	public static void main(String[] args){
		for(int i=100; i<1000; i++){
			//�Ƚ���λ��ʮλ����λ����ֵ�����������
			int a = i%10;
			int sum = a*a*a;
			a = i/10%10;
			int sum2 = a*a*a;
			a = i/100%10;
			int sum3 = a*a*a;
			if(i==(sum+sum2+sum3)){
				System.out.println(i);
			}
		}
	}
}
/*

��ֵ�������˳�򣺴�������
=��һ��������ĸ�ֵ������������=���������ݱ����һ����չ��ֵ�����
	+=,-=,*=,/=,%=
	a += b -> a = a+b;
	a -= b -> a = a-b;
	a *= b -> a = a*b;
	a /= b -> a = a/b;
	a %= b -> a = a%b;
	
��չ�������������ǿ������ת��
*/
class Demo{
	public static void main(String[] args){
		int a = 10;
		a += 10;
		System.out.println("a="+a);
		
		byte b = 1;
		//b = b+1;//�����ݵ�����: ��intת����byte���ܻ�����ʧ
		b += 1;//b = (b����������)(b+1);
		System.out.println("b="+b);
	}
}
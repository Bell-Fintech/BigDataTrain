/*
+�����ţ��ӷ�
boolean�������޷����������������������
������������֮�������㣬�Ǵӵ;�����߾��Ƚ����Զ�ת����
	byte,char,short����֮�䲻ֱ���໥���㣬��������Ϊint����֮�����໥����
	byte,char,short->int->long->float->double
	
	long:2^63-1
	float:3.404*10^38>2*10^38>2*8^38=2*2^3^38=2*2^114>2^63-1
*/
class ParamDemo4{
	public static void main(String[] args){
		int a = 10,b = 20;
		int sum = a+b;
		System.out.println(sum);
		boolean c = true;
		//sum  = c+a;
	}
}
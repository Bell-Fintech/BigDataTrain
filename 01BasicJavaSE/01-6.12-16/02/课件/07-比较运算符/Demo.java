/*
��ϵ��������������boolean���͵ģ�Ҫô��trueҪô��false
==���Ƿ������
!=���Ƿ񲻵���
instanceof���ж������Ƿ���ָ��������(ֻ��������������)

==���ǱȽ������
=����ֵ�����
*/
class Demo{
	public static void main(String[] args){
		int a = 10,b = 20;
		boolean result = (a==b);//�����ݵ�����: int�޷�ת��Ϊboolean
		System.out.println("result="+result);//false
		result = (a!=b);
		System.out.println("result="+result);//true
		
		result = "����" instanceof String;
		System.out.println("result="+result);//true
		
		
	}
}
/*
������������������һ��������з���

�����������+��-��*��/

+�����ţ��ӷ����ַ���ƴ�ӷ�

/��ȡ����ֵ
%��ȡ������

�����������������֮�������㣬���յĽ���������������Ҫ�õ�С���������ڳ������߱������������1.0f


*/
class Demo{
	public static void main(String[] args){
		int a = 10,b = 2;
		System.out.println(a+b);//12
		System.out.println(a-b);//8
		System.out.println(a*b);//20
		System.out.println(a/b);//5
		
		b = 3;
		System.out.println("��Ϊ��"+a/b+",����Ϊ��"+a%b);//��Ϊ��3,����Ϊ��1
		
		a = 1;
		b = 2;
		System.out.println(a/(b*1.0f));
	}
}
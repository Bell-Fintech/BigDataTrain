/*
�룺�����еĽ����ֵ����true��ʱ�����յĽ������true
&��������ߵ�ֵ��true����false���ұߵı��ʽ����ִ��
&&������ߵ�ֵ��false��ʱ���ұߵı��ʽ�Ͳ���ִ�У�����ߵ�ֵ��true��ʱ���ұߵı��ʽ�Ż�ִ��
&��&&�Ľ������һ����

&&���ж�·Ч���������и�����

��Ľ������false��true����false��false
*/
class Demo{
	public static void main(String[] args){
		int a = 3,b = 4;
		boolean result = a++>3 && ++b>4;
		System.out.println("result="+result);//result=false
		System.out.println("a="+a+",b="+b);//&:a=4,b=5	&&:a=4,b=5
	}
}
/*
�򣺵������ֻҪ��һ��true����ô���յĽ������true
|��������ߵ�ֵ��true����false���ұߵı��ʽ����ִ��
||������ߵ�ֵ��true��ʱ���ұߵı��ʽ����ִ�У�����ߵ�ֵ��false��ʱ���ұߵı��ʽ�Ż�ִ��
|��||�Ľ����һ����

||���ж�·Ч���������о���ʹ��

��Ľ������true��true����true��false
*/
class Demo2{
	public static void main(String[] args){
		int a = 3,b = 4;
		boolean result = ++a>3 || b++>4;
		System.out.println("result="+result);//a=4,b=5
		System.out.println("a="+a+",b="+b);//|:a=4,b=5	||:a=4,b=4
	}
}
/*
1.�κ��������ͺ��ַ���������Ľ�������ַ���
2.���ʽ������˳����������
*/
class ParamTest5{
	public static void main(String[] args){
		System.out.println('a');//a
		System.out.println('a'+1);//98
		System.out.println("hello"+'a'+1);//helloa1
		System.out.println('a'+1+"hello");//98hello
		System.out.println("5+5="+5+5);//5+5=55
		System.out.println(5+5+"=5+5");//10=5+5
	}
}
/*
�������飺���������ڹ��췽��ִ�еģ�ÿһ�δ��������ʱ�������ᱻ���ã������Խ����еĹ��췽���������ʼ�������ݼ�����һ����г�ʼ��
��̬����飺����������ļ��ض����أ������ڶ�������ڣ�ֻ��ִ��һ�Σ���һ�����ڼ���C����C++��д�õĿ�
��ͨ����飺���Ƿ��ڷ�������������ǰ�ͷ�һЩ������
���췽�����������飬��̬������ִ��˳��
	��̬�����-��������-���췽��
*/
class Test{
	{
		System.out.println("��������");
	}
	static{
		System.out.println("��̬�����");
	}
	public Test(){
		System.out.println("���췽��");
	}
	public void show(){
		{
			int a = 10;
			System.out.println("��ͨ�����");
		}
		int b = 20;
		System.out.println();
	}
}
class Demo{
	public static void main(String[] args){
		new Test().show();
		new Test();
	}
}
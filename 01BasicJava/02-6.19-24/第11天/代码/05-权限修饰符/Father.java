/*
			ͬһ����	ͬһ������(����/������)		��ͬ������		��ͬ��������
public		��			��							��				��
protected	��			��							��				��
Ĭ��		��			��							��				��
private		��			��							��				��

public��Ȩ�����ʲô�ط������Է���
protected��ֻҪ���඼���Է���
Ĭ�ϣ�ֻҪ��ͬһ������
private��ֻ����ͬһ������
*/
package cn.edu360;
public class Father{
	public void show(){
		System.out.println("show");
	}
	protected void show2(){
		System.out.println("show2");
	}
	void show3(){
		System.out.println("sho3");
	}
	private void show4(){
		System.out.println("show4");
	}
	public static void main(String[] args){
		Father f = new Father();
		f.show();
		f.show2();
		f.show3();
		f.show4();
	}
}
/*
��������ν���ʵ������
	�������ǲ���ֱ��ʵ�����ģ�����ͨ����̬��ʵ�֣����������ʵ�֣�Ȼ�󴴽�����Ķ���ʹ�ó���ķ��������Ҳ�г����̬
	����������ࣺ
		Ҫô��һ��ʵ�������г��󷽷�����
		Ҫô������һ��������
	�������в�һ���г��󷽷����г��󷽷�����һ����һ��������
*/
class AbstractDemo2{
	public static void main(String[] args){
		new Son().show();
	}
}
abstract class Father{
	public int age;
	public abstract void show();
}
// Son���ǳ����, ����δ����Father�еĳ��󷽷�show()
class Son extends Father{
	public void show(){
		System.out.println("����");
	}
}
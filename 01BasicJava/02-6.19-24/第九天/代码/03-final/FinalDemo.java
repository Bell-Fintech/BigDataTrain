/*
final�����յ���˼�������������࣬����������
	�����ࣺ�����ε����޷����̳�
	���η��������ε����޷�����д
	���α����������ͳ��˳���������ֻ�ܱ���ֵһ��
*/
class FinalDemo{
	static final String PATH = "https://www.baidu.com/";
	public static void main(String[] args){
		final int A;
		A = 10;
		System.out.println(A);
		//A = 200;//�޷�Ϊ���ձ���a����ֵ
		//System.out.println(A);
	}
}
class Father{
	public final void show(){
		
	}
}
//�޷�������Father���м̳�
class Son extends Father{
	/*�����ǵķ���Ϊfinal
	public void show(){
		
	}*/
}
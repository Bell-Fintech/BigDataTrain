/*
final���γ�Ա�����ĳ�ʼ��ʱ��
	��Ա���������ڶ��󴴽��ɹ�֮ǰ����ֵ
*/
class FinalTest{
	public static void main(String[] args){
		new Test().show();
	}
}
class Test{
	// ���� AGE δ��Ĭ�Ϲ������г�ʼ��
	private final int AGE;
	
	{//��������
		AGE = 10;
	}
	
	public Test(){
		//AGE = 10;
	}
	
	public void show(){
		//�޷�Ϊ���ձ���AGE����ֵ
		//AGE = 20;
		System.out.println(AGE);
	}
}
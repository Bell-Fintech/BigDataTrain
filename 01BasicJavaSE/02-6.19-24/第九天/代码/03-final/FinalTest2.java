/*
final���ξֲ�����������
	���λ����������ͣ������������͵�ֵ�޷��ı�
	���������������ͣ������������͵�ֵҲ�޷��ı䣬������������ָ������еı�����ֵ�ǿ��Ըı��
*/
class FinalTest2{
	public static void main(String[] args){
		final int A = 10;
		System.out.println(A);
		//�޷�Ϊ���ձ���A����ֵ
		//A = 20;
		
		final Test2 T = new Test2();
		System.out.println(T.getAge());
		//T = new Test2();//�޷�Ϊ���ձ���T����ֵ
		//���ó�����ֵ�޷��ı䣬�������ó���ָ������еı�����ֵ�ǿ��Ըı��
		T.setAge(20);
		System.out.println(T.getAge());
	}
}
class Test2{
	private int age = 10;
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
/*
�������ģʽ������һ������Զֻ����һ������
��ʽ��û���̰߳�ȫ���⣬������ֱ��ʹ��
	1.˽�л����캯��
	2.��������һ��˽�еľ�̬�����յı������
	3.�ṩһ�������ķ���ֵΪ��������һ������
����ʽ��
	1.˽�л����캯��
	2.����һ��˽�еľ�̬�������
	3.�ṩһ�������ķ���ֵΪ��������һ������
		�ڷ��ر�����������ʱ��Ҫ���ж���������Ƿ����null���������null�ʹ�������Ķ������������null��ֱ�ӷ���
*/
class SingleInstanceDemo{
	public static void main(String[] args){
		SingleInstance si = SingleInstance.getInstance();
		SingleInstance si2 = SingleInstance.getInstance();
		System.out.println(si);
		System.out.println(si2);
	}
}
class SingleInstance{
	//����ʽ
	//1.˽�л����캯��
	private SingleInstance(){
		
	}
	//2.����һ��˽�еľ�̬�������
	private static SingleInstance instance;
	
	/*
		3.�ṩһ�������ķ���ֵΪ��������һ������
			
	*/
	public static SingleInstance getInstance(){
		//�ڷ��ر�����������ʱ��Ҫ���ж���������Ƿ����null���������null�ʹ�������Ķ������������null��ֱ�ӷ���
		if(null == instance){
			instance = new SingleInstance();
		}
		return instance;
	}
	
	/*
	//��ʽ
	//1.˽�л����캯��
	private SingleInstance(){
		
	}
	
	//2.��������һ��˽�еľ�̬�����յı������
	private static final SingleInstance INSTANCE = new SingleInstance();
	
	//3.�ṩһ�������ķ���ֵΪ��������һ������
	public static SingleInstance getInstance(){
		return INSTANCE;
	}
	*/
}
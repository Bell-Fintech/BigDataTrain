/*
��������û�����ֵĶ���
ʹ�ó�����
	��������Ҫ����������ô����һ�ε�ʱ��ʹ����������
	����Ķ�����Ϊʵ�δ���ʱ
*/
class NoNameDemo{
	public static void main(String[] args){
		//��������Ҫ����������ô����һ�ε�ʱ��ʹ����������
		//Demo d = new Demo();
		//d.test();
		//new Demo().test();
		
		//Demo d = new Demo();
		//show(d);
		show(new Demo());
	}
	
	public static void show(Demo d){
		d.test();
	}
}
class Demo{
	public void test(){
		System.out.println("����");
	}
}
/*
�̳е�ע�����
	�����е�˽�г�Ա���಻�ܼ̳�
	����Ĺ��췽�����಻�ܼ̳�
	��ҪΪ��һ���ֹ��ܶ�ȥ�̳�һ������
	
		class A{
			public void show(){}
			public void show2(){}
			public void show3(){}
			private String name;
			private String address;
		}
		����һ����B��ӵ��show����
		class B extends A{}
		class B{
			public void show(){}
		}
*/
class ExtendsDemo3{
	public static void main(String[] args){
		new Son2().test();
	}
}
class Father2{
	private String name;
	private void show(){
		System.out.println("�����show");
	}
	public void test(){
		//��һЩ����
		show();
	}
}
class Son2 extends Father2{
	
}
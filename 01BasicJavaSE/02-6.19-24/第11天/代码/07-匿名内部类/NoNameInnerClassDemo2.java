/*
ǰ������˵������������Ϊ��������
	��ͨ���࣬�����࣬�ӿ�
	
*/
public class NoNameInnerClassDemo2{
	public static void main(String[] args){
		/*
		Test t = new Test();
		t.test(new InterImpl());
		
		new Test().test(new InterImpl());
		*/
		new Test().test(new Inter2(){
			public void show(){
				System.out.println("����ͨ�������ڲ��ഫ�ݹ�����");
			}
		});
	}
}
interface Inter2{
	void show();
}

class InterImpl implements Inter2{
	public void show(){
		System.out.println("����");
	}
}

class Test{
	public void test(Inter2 i){
		i.show();
	}
}
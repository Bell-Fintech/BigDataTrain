/*
�����ڲ��ࣺû������+������ڲ�
�����ڲ����ǰ�᣺
	��Ҫ����һ������߽ӿ�
д����
	new �������߽ӿ���(){
		��д����ʵ�ֵķ�����
	}
	��д����ʵ�ֵķ���������һ������Ҳ�����Ƕ������
���ʣ����Ǽ̳���һ�������ʵ�ֽӿڵ�һ�������������
*/
public class NoNameInnerClassDemo{
	public static void main(String[] args){
		/*��ͨ����ķ�����д
		Son s = new Son();
		s.show();
		
		new Demo(){
			public void show(){
				System.out.println("���������ڲ�����д��");
			}
		}.show();
		������ķ���ʵ��
		Son2 s = new Son2();
		s.show();
		
		new Demo2(){
			public void show(){
				System.out.println("���������ڲ�����д��");
			}
		}.show();
		�ӿڷ�����ʵ��
		
		new Son3().show();
		
		new Inter(){
			public void show(){
				System.out.println("���������ڲ�����д��2222");
			}
			public void show2(){
				System.out.println("���������ڲ�����д��2222");
			}
			public void show3(){
				System.out.println("���������ڲ�����д��2222");
			}
		}.show();
		new Inter(){
			public void show(){
				System.out.println("���������ڲ�����д��2222");
			}
			public void show2(){
				System.out.println("���������ڲ�����д��2222");
			}
			public void show3(){
				System.out.println("���������ڲ�����д��2222");
			}
		}.show2();
		*/
		//�������߽ӿ������ж��������Ҫ���ã������ø����������ӿ������������Ȼ����ͨ������������÷���
		Inter i = new Inter(){
			public void show(){
				System.out.println("���������ڲ�����д��2");
			}
			public void show2(){
				System.out.println("���������ڲ�����д��22");
			}
			public void show3(){
				System.out.println("���������ڲ�����д��222");
			}
		};
		i.show();
		i.show2();
		i.show3();
	}
	
	static Inter i = new Inter(){
			public void show(){
				System.out.println("���������ڲ�����д��1");
			}
			public void show2(){
				System.out.println("���������ڲ�����д��11");
			}
			public void show3(){
				System.out.println("���������ڲ�����д��111");
			}
	};
	
}
interface Inter{
	void show();
	void show2();
	void show3();
}

/*class Son3 implements Inter{
	public void show(){
		System.out.println("�ٺ�");
	}
}*/

abstract class Demo2{
	public abstract void show();
}
class Son2 extends Demo2{
	public void show(){
		System.out.println("����");
	}
}

class Demo{
	public void show(){
		System.out.println("����");
	}
}
class Son extends Demo{
	public void show(){
		System.out.println("�Ǻ�");
	}
}
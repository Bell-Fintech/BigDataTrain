/*
��Ա�ڲ���һ����private�������Σ���߰�ȫ
��Ա�ڲ��໹������static���Σ�Ϊ�˷��ʷ���
��Ա�ڲ���ĳ�Ա��η��ʣ�	
	ʹ�÷Ǿ�̬�ڲ���ķǾ�̬��Ա��
		�ⲿ����.�ڲ����� ������ = new �ⲿ����().new �ڲ�����();
		������.��Ա(��Ա�������ɱ���)
	ʹ�þ�̬�ڲ���ķǾ�̬��Ա
		�ⲿ����.�ڲ����� ������ = new �ⲿ����.�ڲ�����();
		������.��Ա
	ʹ�þ�̬�ڲ���ľ�̬��Ա
		������ʽ���Լ���ʹ��
		��
		�ⲿ����.�ڲ�����.��Ա
	
��̬�ڲ����в�һ���о�̬��Ա�������о�̬��Ա���ڲ���һ����һ����̬�ڲ���
*/
public class InnerClassDemo2{
	public static void main(String[] args){
		/*
		ʹ�÷Ǿ�̬�ڲ���ķǾ�̬��Ա��
			�ⲿ����.�ڲ����� ������ = new �ⲿ����().new �ڲ�����();
			������.��Ա(��Ա�������ɱ���)
		
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
		System.out.println(ic.name);
		
		ʹ�þ�̬�ڲ���ķǾ�̬��Ա
			�ⲿ����.�ڲ����� ������ = new �ⲿ����.�ڲ�����();
			������.��Ա
		
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.show();
		System.out.println(ic.name);
		*/
		OuterClass.InnerClass.show();
	}
}
class OuterClass{
	private static int age = 10;
	public void show(){
		System.out.println("Outer show");
	}
	static class InnerClass{
		public static String name = "����";
		public static void show(){
			System.out.println("Inner show"+age);
			//OuterClass.this.show();
		}
	}
}
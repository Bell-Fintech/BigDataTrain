/*
�ֲ��ڲ��ࣺ�����ڷ�������ڲ������һ����
�ֲ��ڲ���ĳ�Աֻ�������ڷ������ڲ�ͨ����������ķ�ʽ���з���
�ֲ��ڲ�����ʾֲ���Ա����Ҫ��final(JDK1.7�Լ�֮ǰ)��
	��Ϊ�ڲ�����ʹ�þֲ�������ʱ����ܲ�֪���ⲿ�ı����仯�����Ա�����ʹ��֮ǰ�͹̶������������ֵ
��JDK1.8��ʱ��ǰ�����ʡ��final�����Ǳ����ϻ����Գ���
*/
public class InnerClassDemo4{
	public static void main(String[] args){
		new OuterClass2().show();
	}
}
class OuterClass2{
	public void show(){
		int a = 10;
		class InnerClass2{
			public void test(){
				//���ڲ������õı��ر������������ձ�����ʵ���ϵ����ձ���
				System.out.println(a);
			}
		}
		//a = 20;
		InnerClass2 ic =new  InnerClass2();
		ic.test();
	}
	
}
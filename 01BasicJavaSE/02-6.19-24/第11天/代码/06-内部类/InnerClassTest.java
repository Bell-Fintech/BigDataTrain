/*
Ҫ������շֱ����30��20��10��
		
ע�⣺
	1.�ڲ�����ⲿ��û�м̳й�ϵ��
	2.ͨ���ⲿ�����޶�this����
		Outer.this

*/
class InnerClass{
	int age = 10;
	class InnerOuter{
		int age = 20;
		public void show(){
			int age = 30;
			//�ֱ����30��20��10	
			System.out.println(age);
			System.out.println(this.age);
			System.out.println(InnerClass.this.age);
		}
	}
}
public class InnerClassTest{
	public static void main(String[] args){
		new InnerClass().new InnerOuter().show();
	}
}

/*
1.������д��������ж���û�����⣬���û�У�д�������
����ת�ͣ�������֮����Ҫ�����Ӹ����ϵ
	���ӵ���
	��������ָ���������
����ת�ͣ���Ҫǿת�����ͱ������ڶ��ڴ��д��ڵĶ�������һ��
	�Ӹ�����
	����������ת����������
*/
class Fu{
	public void show(){
		System.out.println("fu show");
	}
}

class Zi extends Fu{
	public void show(){
		System.out.println("zi show");
	}

	public void method(){
		System.out.println("zi method");
	}
}
class Zi2 extends Fu{
	
}
class DuoTaiTest{
	public static void main(String[] args){
		//�������еķ������ø��������޷�����
		Fu f = new Zi();
		Zi z = (Zi)f;
		z.method();
	}
}
//����һ����MyMath,�ṩ�����ļӼ��˳����ܣ�Ȼ����в��ԡ�
//add��sub��mul��div   
class MyMathTest{
	public static void main(String[] args){
		int a = 10,b = 2;
		//MyMath mm = new MyMath();//MyMath()������MyMath�з���private
		MyMath mm = MyMath.getInstance();
		System.out.println("�ӷ��Ľ����"+mm.add(a,b));
		System.out.println("�����Ľ����"+mm.sub(a,b));
		System.out.println("�˷��Ľ����"+mm.mul(a,b));
		System.out.println("�����Ľ����"+mm.div(a,b));
	}
}

//���췽��˽�л��ˣ���������ķ����ֲ��Ǿ�̬�ġ���ε�������ķ����أ�
class MyMath{
	private MyMath(){
		
	}
	//��Ϊ�ⲿ�޷���������Ķ�����������ṩ������󷽷�ֻ���Ǿ�̬��
	public static MyMath getInstance(){
		return new MyMath();//�����ڹ������ģʽ
	}
	public  int add(int a,int b){
		return a+b;
	}
	public  int sub(int a,int b){
		return a-b;
	}
	public  int mul(int a,int b){
		return a*b;
	}
	public  int div(int a,int b){
		return a/b;
	}
}
/*
һ���˿��Է�װ��һ���࣬һ�����кܶ����٣�ÿһ������Ҳ���Է�װ��һ���ࣻ��Щ�����ǱȽ���Ҫ�ģ�����ֱ�ӱ�¶��������Щ���پͱ�����
���Զ����˽�е��ڲ��࣬Ȼ���ṩһ�������ķ������ⲿ���ã�����������ڲ�������һЩУ��
*/
class InnerClassDemo3{
	public static void main(String[] args){
		Body b = new Body();
		while(true){
			//�ڶ��̵߳�ʱ��ὲ�⣬���Ƽ���ʱ��Ƶ��
			b.checkHeart(123456);
		}
	}
}
class Body{
	private String name;
	private int age;
	
	private class Heart{
		public void beat(){
			System.out.println("��������...");
		}
	}
	//�ṩһ�������ķ���
	public void checkHeart(int key){
		
		if(key!=123456){
			System.out.println("�㲻��ҽ���������㿴");
			return;
		}
		new Heart().beat();
	}
}
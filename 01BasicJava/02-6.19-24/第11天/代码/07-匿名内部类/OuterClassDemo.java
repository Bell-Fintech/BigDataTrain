//����Ҫ�󣬲������
interface Inter { 
	void show(); 
}

class OuterClass{ 
	//������� 
	public static Inter method(){
		Inter i = new Inter(){
			public void show(){
				System.out.println("HelloWorld");
			}
		};
		return new Inter(){
			public void show(){
				System.out.println("HelloWorld");
			}
		};
	}
}
public class OuterClassDemo {
	    public static void main(String[] args) {
				//Method�����϶���һ����̬����
		      OuterClass.method().show();
		  }
	}
//Ҫ���ڿ���̨�����HelloWorld��

//按照要求，补齐代码
interface Inter { 
	void show(); 
}

class OuterClass{ 
	//补齐代码 
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
				//Method方法肯定是一个静态方法
		      OuterClass.method().show();
		  }
	}
//要求在控制台输出”HelloWorld”

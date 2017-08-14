package 第二题;

//要求在控制台输出”小牛学堂”
abstract class Test{ 
	public abstract void show(); 
}
interface Inter{
	Test test();
} 
class InnerClass{
	public static Inter show() {
		return new Inter() {
			public Test test() {
				class Test2 extends Test{
					public void show() {
						System.out.println("小牛学堂");						
					}
			   }
				Test2 test2=new Test2();
				return test2;
			}
		};
	}
}
class InnerClassDemo {
	    public static void main(String[] args) {
		      InnerClass.show().test().show();
	    }
}

		 

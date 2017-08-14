/*
前面我们说过引用类型作为参数传递
	普通的类，抽象类，接口
	
*/
public class NoNameInnerClassDemo2{
	public static void main(String[] args){
		/*
		Test t = new Test();
		t.test(new InterImpl());
		
		new Test().test(new InterImpl());
		*/
		new Test().test(new Inter2(){
			public void show(){
				System.out.println("我是通过匿名内部类传递过来的");
			}
		});
	}
}
interface Inter2{
	void show();
}

class InterImpl implements Inter2{
	public void show(){
		System.out.println("哈哈");
	}
}

class Test{
	public void test(Inter2 i){
		i.show();
	}
}
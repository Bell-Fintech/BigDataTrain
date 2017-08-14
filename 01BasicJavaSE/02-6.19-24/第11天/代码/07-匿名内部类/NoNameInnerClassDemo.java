/*
匿名内部类：没有名字+在类的内部
匿名内部类的前提：
	需要存在一个类或者接口
写法：
	new 类名或者接口名(){
		重写或者实现的方法；
	}
	重写或者实现的方法可以是一个方法也可以是多个方法
本质：就是继承了一个类或者实现接口的一个匿名子类对象
*/
public class NoNameInnerClassDemo{
	public static void main(String[] args){
		/*普通的类的方法重写
		Son s = new Son();
		s.show();
		
		new Demo(){
			public void show(){
				System.out.println("我是匿名内部类重写的");
			}
		}.show();
		抽象类的方法实现
		Son2 s = new Son2();
		s.show();
		
		new Demo2(){
			public void show(){
				System.out.println("我是匿名内部类重写的");
			}
		}.show();
		接口方法的实现
		
		new Son3().show();
		
		new Inter(){
			public void show(){
				System.out.println("我是匿名内部类重写的2222");
			}
			public void show2(){
				System.out.println("我是匿名内部类重写的2222");
			}
			public void show3(){
				System.out.println("我是匿名内部类重写的2222");
			}
		}.show();
		new Inter(){
			public void show(){
				System.out.println("我是匿名内部类重写的2222");
			}
			public void show2(){
				System.out.println("我是匿名内部类重写的2222");
			}
			public void show3(){
				System.out.println("我是匿名内部类重写的2222");
			}
		}.show2();
		*/
		//如果类或者接口里面有多个方法需要调用，可以用父类引用来接口这个匿名对象，然后再通过匿名对象调用方法
		Inter i = new Inter(){
			public void show(){
				System.out.println("我是匿名内部类重写的2");
			}
			public void show2(){
				System.out.println("我是匿名内部类重写的22");
			}
			public void show3(){
				System.out.println("我是匿名内部类重写的222");
			}
		};
		i.show();
		i.show2();
		i.show3();
	}
	
	static Inter i = new Inter(){
			public void show(){
				System.out.println("我是匿名内部类重写的1");
			}
			public void show2(){
				System.out.println("我是匿名内部类重写的11");
			}
			public void show3(){
				System.out.println("我是匿名内部类重写的111");
			}
	};
	
}
interface Inter{
	void show();
	void show2();
	void show3();
}

/*class Son3 implements Inter{
	public void show(){
		System.out.println("嘿嘿");
	}
}*/

abstract class Demo2{
	public abstract void show();
}
class Son2 extends Demo2{
	public void show(){
		System.out.println("哈哈");
	}
}

class Demo{
	public void show(){
		System.out.println("哈哈");
	}
}
class Son extends Demo{
	public void show(){
		System.out.println("呵呵");
	}
}
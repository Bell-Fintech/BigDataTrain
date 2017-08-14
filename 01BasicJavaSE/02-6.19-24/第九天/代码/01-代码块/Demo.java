/*
构造代码块：它是优先于构造方法执行的，每一次创建对象的时候它都会被调用；它可以将所有的构造方法都必须初始化的数据集合在一起进行初始化
静态代码块：它是随着类的加载而加载，优先于对象而存在，只会执行一次；它一般用于加载C或者C++编写好的库
普通代码块：它是放在方法里面用于提前释放一些变量的
构造方法，构造代码块，静态代码块的执行顺序？
	静态代码块-构造代码块-构造方法
*/
class Test{
	{
		System.out.println("构造代码块");
	}
	static{
		System.out.println("静态代码块");
	}
	public Test(){
		System.out.println("构造方法");
	}
	public void show(){
		{
			int a = 10;
			System.out.println("普通代码块");
		}
		int b = 20;
		System.out.println();
	}
}
class Demo{
	public static void main(String[] args){
		new Test().show();
		new Test();
	}
}
/*
单例设计模式：就让一个类永远只产生一个对象
恶汉式：没有线程安全问题，开发中直接使用
	1.私有化构造函数
	2.创建声明一个私有的静态的最终的本类对象
	3.提供一个公共的返回值为本类对象的一个方法
懒汉式：
	1.私有化构造函数
	2.声明一个私有的静态本类对象
	3.提供一个公共的返回值为本类对象的一个方法
		在返回本类对象变量的时候要先判断这个变量是否等于null，如果等于null就创建本类的对象，如果不等于null就直接返回
*/
class SingleInstanceDemo{
	public static void main(String[] args){
		SingleInstance si = SingleInstance.getInstance();
		SingleInstance si2 = SingleInstance.getInstance();
		System.out.println(si);
		System.out.println(si2);
	}
}
class SingleInstance{
	//懒汉式
	//1.私有化构造函数
	private SingleInstance(){
		
	}
	//2.声明一个私有的静态本类对象
	private static SingleInstance instance;
	
	/*
		3.提供一个公共的返回值为本类对象的一个方法
			
	*/
	public static SingleInstance getInstance(){
		//在返回本类对象变量的时候要先判断这个变量是否等于null，如果等于null就创建本类的对象，如果不等于null就直接返回
		if(null == instance){
			instance = new SingleInstance();
		}
		return instance;
	}
	
	/*
	//恶汉式
	//1.私有化构造函数
	private SingleInstance(){
		
	}
	
	//2.创建声明一个私有的静态的最终的本类对象
	private static final SingleInstance INSTANCE = new SingleInstance();
	
	//3.提供一个公共的返回值为本类对象的一个方法
	public static SingleInstance getInstance(){
		return INSTANCE;
	}
	*/
}
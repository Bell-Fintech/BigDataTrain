package cn.edu360;
/*
 * 	异常的信息：人的年龄必须在1-260之间
	很明显java没有对应的异常，需要我们自己来做一个异常
	自定义异常
		继承自Exception
		继承自RuntimeException
 */
public class CustomerExceptionDemo {

	public static void main(String[] args) throws Exception {
		new Person("小明", 0);
	}

}

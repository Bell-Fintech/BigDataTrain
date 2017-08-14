package cn.edu360;

/*
 * 在现实生活存在着各种各样的问题，java把现实生活中的问题以类的形式体现了，并且分为了三类
 * Throwable 类是 Java 语言中所有错误或异常的超类
 * 编译时期异常：是java语法抛出的，必须处理，不处理代码就不能运行
 * 运行时期异常：一般不用处理，是因为我们代码写的有问题，只需要修改代码即可
 * 严重错误 ：既不需要处理，也不需要修改代码
 * 
 * Throwable：
 * 	Error：错误
 * 	Exception：
 * 		RuntimeException：运行时期异常
 * 		非RuntimeException：编译时期异常
 * 	Exception:出门前，就发现车子坏了
	RuntimeException:在骑车的过程中，车子坏了
	Error:走到半路上，发现走的路线都是错的，没有办法继续走下去了
JVM默认处理异常的方式：
	终止程序的运行
	将程序发送异常的类名，信息，位置都打印在控制台
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		//int i = 1/0;
		int[] arr = {1};
//		System.out.println(arr[2]);
		arr = null;
		System.out.println(arr[0]);
		System.out.println("over");
	}

}

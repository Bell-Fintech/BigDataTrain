package cn.edu360;
/*
 * 线程 是程序中的执行线程。Java 虚拟机允许应用程序并发地运行多个执行线程
 * 创建新执行线程有两种方法。一种方法是将类声明为 Thread 的子类。该子类应重写 Thread 类的 run 方法。接下来可以分配并启动该子类的实例
 * 
 * 如何启动一个线程？
 * 	调用线程的start方法
 * 为什么要重写run方法？
 * 	因为线程启动之后，会自动执行run方法里面的代码
 * 调用run方法和start方法有什么区别？
 * 	调用run方法就相当于调用对象的一个普通方法
 * 	调用start方法，首先会启动子线程，子线程会自动调用run方法
 *	线程能不能多次启动
 *		一个线程实例只能调用一次start方法，多次调用就会报异常：IllegalThreadStateException - 如果线程已经启动。
 *如何获取线程的名字和设置线程的名字？
 *	public final String getName()返回该线程的名称
 *	public final void setName(String name)改变线程名称，使之与参数 name 相同
 */
public class ThreadDemo {

	public static void main(String[] args) {
		//创建线程子类对象并调用start方法
		//new MyThread().start();
		MyThread t = new MyThread("我自定的名字");
		t.start();
		//t.setName("自定义线程");
		System.out.println(t.getName());//Thread-0
		//t.start();
		System.out.println("over");
		
		//获取主线程的名字
		//public static Thread currentThread()返回执行该方法的线程对象
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());//main
	}
}

class MyThread extends Thread{
	public MyThread(String threadName) {
		super(threadName);
	}
	@Override
	public void run() {
		//这里面就是子线程要做的事情
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
	}
}
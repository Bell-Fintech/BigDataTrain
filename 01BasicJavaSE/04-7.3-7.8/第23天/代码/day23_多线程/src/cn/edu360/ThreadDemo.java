package cn.edu360;
public class ThreadDemo {
	public static void main(String[] args) {
			//相当于一个资源，可以给多个线程使用
			MyRunnable task = new MyRunnable();
			new Thread(task).start();
			new Thread(task).start();
			System.out.println("over");
	}

}
//创建线程的另一种方法是声明实现 Runnable 接口的类。该类然后实现 run 方法。然后可以分配该类的实例，在创建 Thread 时作为一个参数来传递并启动。
class MyRunnable implements Runnable{

	@Override
	public void run() {
		//这里就是线程要做的事情
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
	}
	
}
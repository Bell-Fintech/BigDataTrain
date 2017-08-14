package cn.edu360;
/*
 * 我们已经知道了线程的调度，接下来我们就可以使用如下方法对象线程进行控制
	线程阻塞
		public static void sleep(long millis)让此线程睡眠指定的毫秒值
		public final void join()此方法在那个线程执行的，那么这个线程就会等待执行该方法的线程实例执行完毕之后再执行
		public static void yield()告诉cpu此线程没有紧急的事情要做，让cpu可以优先执行别的线程，但是具有不可靠性
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();
		//public final void join()此方法在那个线程执行的，那么这个线程就会等待执行该方法的线程实例执行完毕之后再执行
		/*try {
			t.join();//主线程会等待t线程执行完毕之后再执行
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//public static void yield()告诉cpu此线程没有紧急的事情要做，让cpu可以优先执行别的线程，但是具有不可靠性
		Thread.currentThread().yield();
		System.out.println("over");
		
		
	}

}
class MyThread2 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++){
			//当i等于3的时候，我调用一下sleep方法
			if(i==3){
				//public static void sleep(long millis)让此线程睡眠指定的毫秒值
				/*try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
			System.out.println(i);
		}
	}
	
}

package cn.edu360;

/*
 * 中断线程
	public final void stop()强迫线程停止执行
		现在使用线程停止的策略是设置一个标记来控制
	public void interrupt()使线程阻塞状态提前中断
		调用interrupt方法的线程必须是阻塞状态，否则没有任何的效果
 */
public class ThreadDemo3 {

	public static void main(String[] args) {
		MyThread3 t = new MyThread3(Thread.currentThread());
		t.start();
		/*try {
			Thread.sleep(300);//确保子线程是阻塞状态
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//t.interrupt();
		
		try {
			t.join();//主线程会进行阻塞状态，直到子线程执行完毕之后才会苏醒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("over");
	}

}

class MyThread3 extends Thread {
	private Thread currentThread;

	public MyThread3(Thread currentThread) {
		this.currentThread = currentThread;
	}

	@Override
	public void run() {
		try {
			sleep(100);//确保主线程是阻塞状态
			currentThread.interrupt();//打破主线程的阻塞状态
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
		
/*		boolean flag = true;
		for (int i = 0; i < 10; i++) {
			// 我只想输出3之前的数值
			if (i == 3) {
				// stop();
				flag = false;
			}
			if (flag) {
				System.out.println(i);
			}else{
				break;
			}
		}*/
	}
}
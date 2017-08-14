package cn.edu360;

public class ThreadDemo2 {

	public static void main(String[] args) {
		new Thread(new MyRunnable()).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++){
					System.out.println(Thread.currentThread().getName()+":::"+i);
				}
			}
		}).start();
	}

}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(Thread.currentThread().getName()+":::"+i);
		}
	}
}
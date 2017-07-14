package cn.edu360;

/*
 * 死锁：一个锁对象等待另外一个锁对象造成，两个锁对象互相等待了
 * 造成死锁的原因：同步代码进行了嵌套
 */
public class DieLockDemo {

	public static void main(String[] args) {
		new MyThread(true).start();
		new MyThread(false).start();
	}

}

// 创建两把锁
class Lock {
	public static Lock lockA = new Lock();
	public static Lock lockB = new Lock();
}

class MyThread extends Thread {
	private boolean flag;

	public MyThread(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		if (flag) {
			synchronized (Lock.lockA) {
				System.out.println("lockA");
				synchronized (Lock.lockB) {
					System.out.println("lockB");
				}
			}
		} else {
			synchronized (Lock.lockB) {
				System.out.println("lockB");
				synchronized (Lock.lockA) {
					System.out.println("lockA");
				}
			}
		}
	}
}
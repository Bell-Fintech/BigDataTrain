package cn.edu360;

import java.util.concurrent.locks.ReentrantLock;

/*
 * 	线程等待：public final void wait()使当前线程进行等待状态
	唤醒单个线程：public final void notify()随机唤醒在此锁对象上面等待的一个线程
	唤醒所有线程：public final  void notifyAll()唤醒所有在此对象上面等待线程
	线程中断：public void interrupt()
	
注意：上述方法必须在同步代码里面通过锁对象调用

为什么wait，notify，notifyAll方法在Object中呢？
	锁对象可以是任意对象
	wait，notify，notifyAll方法是由锁对象调用
	所以可以被任意对象调用的方法只能存放在Object中
	
在坐火车时，在火车没有到站或者时间没有到之前，所有人都是在排队的；工作人员一般都会在站内等着，到了进站的时间的时候，工作人员就会将乘客放行，
有的地方是一个人一个人的检票放行，有的地方是一下会将所有的人都放行然后再查票
对应到java程序中：
	通过上述描述，我们可以将进站设置条件为一个布尔类型的标记isOpen，isOpen初始状态为false，所以刚开始其他的人都等着排队(排队不是理想状态)，
	但是工作人员是有钥匙的所以可以随便改变这个标记可以随便进出
 	每一个线程就是一个乘客
  	当调用notify时，会随机选取一个等待的乘客进行放行
  	当调用notifyAll时，会将所有的等待乘客进行放行
线程的等待和唤醒方法不能通过JDK1.5提供的Lock对象调用
 */
public class EnterTrainDemo {
	public static void main(String[] args) throws Exception {
		EnterTrain t = new EnterTrain("乘客1");
		t.start();
		//确保乘客1是进入等待状态
		//Thread.sleep(200);
		//t.interrupt();//直接中断乘客1的等待状态，直接进站
		
		new EnterTrain("乘客2").start();
		new EnterTrain("乘客3").start();
		new EnterTrain("乘客4").start();
		new EnterTrain("乘客5").start();
		
		// 先确保所有的乘客是等待状态
		Thread.sleep(200);
		EnterTrain t2 = new EnterTrain("工作人员");
		t2.setKey(123456);
		t2.start();
	}
}

class EnterTrain extends Thread {
	//确保所有的线程使用的都是同一把锁
	private static Object lock = new Object();
	//private static ReentrantLock lock = new ReentrantLock();

	// 进站设置条件
	private static boolean isOpen;

	public EnterTrain(String threaName) {
		super(threaName);
	}

	// 设置打开门
	public void setKey(int key) {
		if (123456 == key) {
			isOpen = true;
		}
	}

	// 注意：上述方法必须在同步代码里面通过锁对象调用
	// 当前的线程名字就是人名
	@Override
	public void run() {
		synchronized (lock) {
		//lock.lock();
			if (isOpen) {
				isOpen = false;
				System.out.println(getName() + "进站了，5秒钟之后放行乘客");
				// 等待5秒
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 随机唤醒一个乘客
				//lock.notify();
				// 随机唤醒所有的乘客
				 lock.notifyAll();
			} else {
				System.out.println(getName() + "正在等待进站");
				try {
					lock.wait();// 如果一个线程进行了等待状态，这个锁对象就会释放
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName() + "进站了");
			}
			//lock.unlock();
		}
	}
}
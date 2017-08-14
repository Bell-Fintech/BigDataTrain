package cn.edu360;

import java.util.concurrent.locks.ReentrantLock;

/*
 * 存在线程安全问题的评判标准：
 * 	是否存在多线程环境
 * 	是否存在多个线程共享同一个数据
 * 	是否存在多条语句操作共享数据
 * 怎么解决线程安全问题?
 * 	让程序没有线程安全问题
 * 怎么实现呢？
 * 	把多个语句操作共享数据的代码给锁起来，让任意时刻只能有一个线程执行即可。
 * 同步代码块解决线程安全问题
 * 	把操作共享数据的代码个锁起来
 * 解决线程安全问题的两种方式：
	 * 同步代码块的格式：
	 * 	synchronized(锁对象){
	 * 		操作共享数据的代码
	 * 	}
	 * 锁对象的特点：多个线程必须使用的同一个锁对象,保证锁对象的唯一性
	 * 
	 * 同步方法：也可以解决多线程安全问题，会将整个方法锁起来，同一时刻只能有一个线程执行方法里面的代码
	 * 	同步方法格式：
		 * 	修饰符 synchronized 返回值类型 方法名字(){
		 * 		...
			}
		什么时候同步方法？
			当方法内部的代码都存在线程安全问题时并且可以使用this作为锁对象时
		同步方法的锁对象是this
		静态同步方法的锁对象this当前字节码文件对象
	同步的好处：让多线程程序没有线程安全问题了
	同步的弊端：因为每一个线程在执行操作共享数据的代码之前都需要判断锁对象，所以效率就降低了
	
	使用JDK1.5新特性Lock锁对象
		在想加锁的代码前面调用lock方法
		在想解锁的代码后面调用unLock方法
	又因为Lock是一个接口，所以需要使用它的子类具体的方法ReentrantLock
 */
public class Ticket implements Runnable {
	//创建100张票,这个票变量不需要用static修饰，因为一个Ticket对象可以被多个线程共同使用
	private int ticket = 100;
	private ReentrantLock lock = new ReentrantLock();
	//这个方法的锁对象是Ticket.class
	public synchronized static void show(){
		
	}
	
	//这个方法的锁对象是this
	@Override
	public  void run() {
		while(true){
//			synchronized (Object.class) {
			lock.lock();
				//判断票是否大于0
				if(ticket>0){
					//拿当前线程的名字作为窗口的名字
					System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"张票");
					//票数要-1
					ticket--;
				}else{
					//没有票了，退出死循环
					break;
				}
				lock.unlock();
//			}
			//卖完一张票之后，模拟现实生活的延迟
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

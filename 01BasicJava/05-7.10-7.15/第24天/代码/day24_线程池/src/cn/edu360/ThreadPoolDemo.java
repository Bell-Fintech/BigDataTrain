package cn.edu360;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Executors是产生线程池的工厂类
 */
public class ThreadPoolDemo {

	public static void main(String[] args) throws Exception {
		// 创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们,空闲线程的存活周期是60秒
		ExecutorService threadPool = Executors.newCachedThreadPool();
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("哈哈");
			}
		};
		// new Thread(runnable).start();线程用完就会销毁掉

		// void execute(Runnable command)在未来某个时间执行给定的命令
		// threadPool.execute(runnable);

		// Future<?> submit(Runnable task)提交一个 Runnable 任务用于执行，并返回一个表示该任务的
		// Future
		// Future<?> future = threadPool.submit(runnable);

		// V get()如有必要，等待计算完成，然后获取其结果
		// System.out.println(future.get());

		// <T> Future<T> submit(Callable<T> task)提交一个返回值的任务用于执行，返回一个表示任务的未决结果的
		// Future
		// 相当于利用子线程为我们计算结果，主线程会等到结果计算完毕之后再执行
		/*
		 * Future<String> future = threadPool.submit(new Callable<String>() {
		 * 
		 * @Override public String call() throws Exception { Thread.sleep(1000);
		 * return "这是我返回的结果"; } }); System.out.println(future.get())
		 */;

		 //创建只能存放一个线程的线程池，这个线程在被显式地关闭之前，池中的线程将一直存在
		//threadPool = Executors.newSingleThreadExecutor();
		//threadPool.execute(runnable);
		
		//创建一个可重用固定线程数的线程池,这个池子里面的线程在被显式地关闭之前，池中的线程将一直存在
		//threadPool = Executors.newFixedThreadPool(1);
		
		ThreadPoolUtils.execute(runnable);
		System.out.println("over");
	}

}

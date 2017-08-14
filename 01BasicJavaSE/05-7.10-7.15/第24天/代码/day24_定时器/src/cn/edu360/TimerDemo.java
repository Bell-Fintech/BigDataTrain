package cn.edu360;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Timer:一种工具，线程用其安排以后在后台线程中执行的任务。可安排任务执行一次，或者定期重复执行
 * 注意事项：一个任务只能被执行一次
 */
public class TimerDemo {
	public static void main(String[] args) throws Exception {
		// public Timer()创建一个新计时器。相关的线程不 作为守护程序运行。
		MyTimer timer = new MyTimer();
		MyTimerTask task = new MyTimerTask() {// 所要安排的任务。
			@Override
			public void run() {
				System.out.println("哈哈");
				// 当任务执行完毕之后，退出定时器
				// timer.cancel();
			}
		};
		// long delay = 1000;// delay - 执行任务前的延迟时间，单位是毫秒
		// public void schedule(TimerTask task,long delay)
		// timer.schedule(task, delay);
		// timer.schedule(task, delay);//Task already scheduled or
		// cancelled：一个任务只能被执行一次

		// Thread.sleep(200);
		// public void cancel()终止此计时器，丢弃所有当前已安排的任务。这不会干扰当前正在执行的任务（如果存在）。
		// timer.cancel();

		/*
		 * public void schedule(TimerTask task,long delay,long
		 * period)安排指定的任务从指定的延迟后开始进行重复的固定延迟执行 task - 所要安排的任务。 delay -
		 * 执行任务前的延迟时间，单位是毫秒。 period - 执行各后续任务之间的时间间隔，单位是毫秒
		 */
		task = new MyTimerTask() {
			@Override
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
				String time = sdf.format(new Date());
				System.out.println(time);
			}
		};
		timer.schedule(task, 1000, 1000);
		
		//Thread.sleep(200);
		//timer.cancel();
	}
}

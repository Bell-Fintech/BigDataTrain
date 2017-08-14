package cn.edu360;

public class MyTimer {
	private boolean flag = true;

	/**
	 * 延迟指定的毫秒值执行任务
	 * 
	 * @param task
	 * @param delay
	 */
	public void schedule(MyTimerTask task, long delay) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (flag) {
					task.run();
				}
			}
		}).start();
	}

	public void schedule(MyTimerTask task, long delay, long period) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(delay);//先睡眠指定的毫秒值
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (flag) {
					task.run();
				}
				if (flag) {
					while (true) {//以后每隔period毫秒值执行指定的任务
						try {
							Thread.sleep(period);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						task.run();
					}
				}
			}
		}).start();
	}

	/**
	 * 终止此计时器，丢弃所有当前已安排的任务。这不会干扰当前正在执行的任务（如果存在）
	 */
	public void cancel() {
		flag = false;
	}
}

package cn.edu360;

public class TicketThread extends Thread{
	//一共是100张票，因为多个线程对象需要共享同一张票，所以声明为static
	private static int ticket = 100;
	public TicketThread(String threadName) {
		//调用父类的有参构造方法，将线程重新命名
		super(threadName);
	}
	@Override
	public synchronized void run() {
		while(true){
			synchronized (Object.class) {
				//判断票是否大于0
				if(ticket>0){
					//拿当前线程的名字作为窗口的名字
					System.out.println(getName()+"正在出售第"+ticket+"张票");
					//票数要-1
					ticket--;
				}else{
					//没有票了，退出死循环
					break;
				}
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

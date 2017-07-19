package nuc.sw.os.Philosopher;

public class Lock {
   //实现进程间的同步
	private boolean locked;

public Lock() {
	locked=false;//筷子可用  不处于锁状态
}
	//同步方法，每个进程取筷子之前都要locked=false才行
   //只能被一个进程使用 修饰符
     public synchronized void lock() throws InterruptedException{
    	 while(locked)//此时正被用
    		 wait();//等待locked=false;
    		 locked=true;//加锁 ，防止别的进程取同一支筷子
     }
     public synchronized void unclock(){//解锁
    	 locked=false;
    	 notify();//唤醒别的进程
     }
}

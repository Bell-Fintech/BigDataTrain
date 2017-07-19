package nuc.sw.os.readWrite;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Write extends Thread {
	   public int id;//读者id
	   public Semaphore writeSemaphore;//写者信号量
	public Write(int id, Semaphore semaphore) {
		this.id = id;
		this.writeSemaphore = semaphore;
		this.start();//开始写
	}
	//写者优先  写和任何进程都是互斥
	public void run(){
		//没人写
		if(writeSemaphore.availablePermits()>0){//可以读
			System.out.println("写者"+this.id+"可以写。。。");
		}
		else{
			System.out.println("写者"+this.id+"不可以写。。。");
		}
		
		
		   try {
			//申请占书 wait(wmutex)
			writeSemaphore.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		   System.out.println("写者"+this.id+"我正在写哦。。。");
		   try {
				Thread.sleep((long)(new Random().nextFloat()*2000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		   System.out.println("写者"+this.id+"写完了。。。");
	 
		 //释放书   signal(wmutex)
		   writeSemaphore.release();
	}
}

package nuc.sw.os.readWrite;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Read extends Thread {
	   public int id;//读者id
	   public Semaphore readCountSemaphore;//读者数量信号量
	   public Semaphore writeSemaphore;//写者信号量
	public Read(int id, Semaphore semaphore, Semaphore semaphore2) {
		this.id = id;
		this.readCountSemaphore = semaphore;
		this.writeSemaphore = semaphore2;
		this.start();//开始读
	}
	//读者优先
	public void run(){
		//没人写
		if(writeSemaphore.availablePermits()>0){//可以读
			System.out.println("读者"+id+"可以读。。。");
		}
		else{
			System.out.println("有写者在进行写操作，读者"+id+"等待读");
		}
		//等待着读
		try {
			readCountSemaphore.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	   if(TestReadWrite.readCount==0){//如果第一个读者，那么要考虑是否有写者，没有写者，直接读；有写者，等待写者
		   TestReadWrite.readCount++;//已经具备读的条件了 读者数量加1
		   try {
			//等同于  wait(wmutex);
			writeSemaphore.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   //signal(rmutex);
	   readCountSemaphore.release();
	   
	   //此时允许其他读者读数据
	   try {
		readCountSemaphore.acquire();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   //可以读了
	   System.out.println("读者"+id+"我正在读哦。。。");
	   try {
		Thread.sleep((long)(new Random().nextFloat()*2000));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.println("读者"+id+"读完了。。。");
	   //读者完了  读者数量减1
	   TestReadWrite.readCount--;
	   
	   if(TestReadWrite.readCount==0){
		   //没有读者了 可以写了
		   writeSemaphore.release();
	   }
	   
	   //释放读者信号量
	   readCountSemaphore.release();
	}
	   
	   
}

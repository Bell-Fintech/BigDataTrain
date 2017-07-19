package nuc.sw.os.pc;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//仓库类Storage实现缓冲区
public class Storage {
	//仓库的最大存储量
   private final int MAX_SIZE=100;
   //仓库存储的载体
   private LinkedList<Object> list=new LinkedList<Object>();
   //锁
   private final Lock lock=new ReentrantLock();
   //仓库满的条件变量
   private final Condition full=lock.newCondition();
   //仓库空的条件变量
   private final Condition empty=lock.newCondition();
   //生产num个产品
   public void produce(int num) throws InterruptedException{
	   //获得锁
	   lock.lock();
		   //如果仓库剩余容量不足
		   while(list.size() + num > MAX_SIZE){
			   int a=MAX_SIZE- list.size();
			   System.out.println("【要生产的产品数量】：" + num + "\t【仓库剩余量】：" + a + " > "+ num + "\t暂时不能执行生产任务！");
			   //由于条件不满足，生产阻塞
			   full.await();			   
		   }
		   //生产条件满足情况下，生产num个产品
		   for(int i=1;i<=num;++i){
			   list.add(new Object());
		   }
		   System.out.println("【已经生产的产品数】:" + num + "\t【现仓存储量为】：" + list.size());
		   
		   //唤醒其他所有线程
		   full.signalAll();
		   empty.signalAll();
		   
		   //释放锁
		   lock.unlock();
	   
   }
   //消费num个产品
   public void consume(int num) throws InterruptedException{
	
	   //获得锁
	   lock.lock();
	   
		   //如果仓库存储量不足
		   while(list.size() < num){
			   System.out.println("【要消费的产品数量】:" + num + "\t【库存量】：" + list.size()+" < " + num +"\t暂时不能执行生产任务！");
			   //由于条件不满足，生产阻塞
			   empty.await();			   
		   }
		   //消费条件满足情况下，消费num个产品
		   for(int i=1;i<=num;++i){
			   list.remove();
			   
		   }
		   System.out.println("【已经消费的产品数】:" + num + "\t【现仓存储量为】：" + list.size());

		   //唤醒其他所有进程
		   full.signalAll();
		   empty.signalAll();
		   
		   //释放锁
		   lock.unlock();
   }
public LinkedList<Object> getList() {
	return list;
}
public void setList(LinkedList<Object> list) {
	this.list = list;
}
public int getMAX_SIZE() {
	return MAX_SIZE;
}
   
}

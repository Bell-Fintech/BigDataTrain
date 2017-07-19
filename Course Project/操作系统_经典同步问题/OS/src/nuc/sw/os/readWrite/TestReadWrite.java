package nuc.sw.os.readWrite;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class TestReadWrite {
   //记录型信号量  在涉及到的函数中写pv操作
	public static final int count=10;//读者写者的数量
	public static int readCount=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Semaphore readCountSemaphore=new Semaphore(1);
        Semaphore writeSemaphore=new Semaphore(1);
        for(int i=0;i<count;i++){
        	//随机生成读者和写者
        	if(new Random().nextBoolean())//假设是读者
        		new Read(i,readCountSemaphore,writeSemaphore);
        	else{
        		new Write(i,writeSemaphore);
        	}
        }
	}
}

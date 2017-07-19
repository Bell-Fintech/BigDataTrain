package nuc.sw.os.Philosopher;

public class TestPhilosopher {
	//记录型信号量   分别申请左右筷子
	static Chopstick[] chop=new Chopstick[5];//5支筷子
    static philosopher[] phi=new philosopher[5];//5个哲学家
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       int i,j=0;
       boolean goOn;
       for(i=0;i<5;i++){//初始化每支筷子
    	   chop[i]=new Chopstick(i);
       }
       for(i=0;i<4;i++){//初始化每个哲学家  左边的筷子  右边的筷子 筷子是临界资源
    	   //使用AND信号量 可以同时申请
    	   phi[i]=new philosopher(chop[i],chop[(i+1)%5]);
       }
       
       //最后一个哲学家是用第一支筷子和最后一支筷子
      phi[4]=new philosopher(chop[0],chop[4]);
      
      for(i=0;i<5;i++){
    	  //开始每个线程 哲学家开始活动
    	  phi[i].start();
      }
      
      //设置当前线程的优先级
      int newPhi=Thread.currentThread().getPriority()+1;
      Thread.currentThread().setPriority(newPhi);
      goOn=true;
      
      while(goOn){
    	  for(i=0;i<5;i++){
    		  //打印每个线程即哲学家的状态  最开始为思考状态
    		  System.out.println("状态为："+phi[i].state);
    	  }
    	  if(++j%5==0){
    		  System.out.println();
    	  }
    	  else
    		  System.out.println(' ');
    	  
    	  goOn=false;
    	  for(i=0;i<5;i++){
    		  //如果所有线程都结束 就停止循环
    		  goOn |=phi[i].state!="stop";
    	  }
    	  Thread.sleep(1);
      }
	}

}

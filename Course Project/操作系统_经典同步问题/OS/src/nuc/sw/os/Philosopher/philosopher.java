package nuc.sw.os.Philosopher;

public class philosopher extends Thread {
	//state 代表哲学家的状态  初始化为思考状态
	public String state="think";
	private Chopstick left,right;
	//构造函数   传进当前哲学家用的左右筷子编号
	public philosopher(Chopstick left, Chopstick right) {
		super();
		this.left = left;
		this.right = right;
	}
	protected void think() throws InterruptedException{
		sleep((long)(Math.random()*1.0));
	}
	protected void eat() throws InterruptedException{
		sleep((long)(Math.random()*1.0));
	}
	//run函数开始一个线程  代表当前哲学家的活动
	public void run(){
		int i;
		for(i=0;i<100;i++){
			//每个哲学家循环100次后结束
			state="think";
			//思考
			try {
				think();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			state="wait";
			try {
				sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//取左筷子
			try {
				left.pickup();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			state="wait";
			try {
				sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//取右筷子
			try {
				right.pickup();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			state="eat";
			//就餐
			try {
				eat();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			left.putdown();
			right.putdown();
			
		}
		
		//当前线程结束  当前哲学家停止一起活动
		state="stop";
	}
}

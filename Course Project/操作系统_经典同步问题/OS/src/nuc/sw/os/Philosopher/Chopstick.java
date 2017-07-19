package nuc.sw.os.Philosopher;

public class Chopstick {
	public char id;//每支筷子的标识符
	private Lock lock=new Lock();//lock用于同步
	public void pickup() throws InterruptedException{
		lock.lock();//取筷子后加锁
	}
	public void putdown(){
		lock.unclock();//放筷子后解锁
	}
	//构造函数传进每支筷子的标识符
	public 	Chopstick(int j){
		Integer i=new Integer(j);
		id=i.toString().charAt(0);
	}
}

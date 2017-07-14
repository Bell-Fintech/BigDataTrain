package cn.edu360;

public class ThreadDemo {
	public static void main(String[] args) {
		//创建启动线程
		new MyThread().start();
		//匿名内部类的方式创建启动线程
		new Thread(){
			public void run() {
				for(int i=0; i<10; i++){
					System.out.println(getName()+":::"+i);
				}
			};
		}.start();
	}
}
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(getName()+":::"+i);
		}
	}
}

package cn.edu360;
/*
 * 需求：
	春节某火车站正在售票，假设还剩100张票，而它有3个售票窗口售票，请设计一个程序模拟该火车站售票。
	在真实生活中，售票时网络是不能实时传输的，总是存在延迟的情况，所以，在出售一张票以后，需要一点时间的延迟
	
	
	多线程程序一定要设备支持运行才可以体现出优势
 */
public class SaleTicketDemo {

	public static void main(String[] args) {
		//创建三个线程卖票
	/*	new TicketThread("窗口1").start();
		new TicketThread("窗口2").start();
		new TicketThread("窗口3").start();*/
		
		//要卖的票
		Ticket ticket = new Ticket();
		new Thread(ticket, "窗口1").start();
		new Thread(ticket, "窗口2").start();
		new Thread(ticket, "窗口3").start();
		new Thread(ticket, "窗口4").start();
		new Thread(ticket, "窗口5").start();
	}

}

package cn.edu360;

import java.util.Date;

/*
 * 类 Date 表示特定的瞬间，精确到毫秒
 */
public class DateDemo {

	public static void main(String[] args) {
		//public Date()分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
		Date date = new Date();//当程序运行到这一行代码的时候，这个date对象就表示这个时间，精确到毫秒
		//public long getTime()返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。 
		long time = date.getTime();
		System.out.println(time);
		//System.out.println(System.currentTimeMillis());如果机器运行速度特别快的话，获取的当前时间可能是date表示的时间一致
		
		//现在有一个毫秒值了，将一个毫秒值转换成Date对象
		//public Date(long date)在1970 年 1 月 1 日 00:00:00 GMT将一个毫秒值封装成一个Date对象
		Date date2 = new Date(time);
		
		//更新对象所表示的时间
		//public void setTime(long time)设置此 Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点
		date2.setTime(time+2*60*1000);
		System.out.println(date2);
	}

}

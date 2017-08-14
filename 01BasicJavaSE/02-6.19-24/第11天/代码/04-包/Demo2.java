/*
定义两个类：Demo2,Test。
在cn.edu360.Demo2类里面有求和方法

一个原文件中只能出现一个被public修饰的类，一般这个类都是主类
*/
package cn.edu360;
// Demo2在cn.edu360中不是公共的; 无法从外部程序包中对其进行访问
// 类Demo3是公共的, 应在名为 Demo3.java 的文件中声明
public class Demo2{
	public static int getSum(int a,int b){
		return a+b;
	}
}
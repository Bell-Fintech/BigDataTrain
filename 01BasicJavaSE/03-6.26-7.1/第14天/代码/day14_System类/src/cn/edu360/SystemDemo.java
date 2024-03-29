package cn.edu360;

import java.util.Arrays;

/*
 * System类概述
		System 类包含一些有用的类字段和方法。它不能被实例化。 
	成员方法
		public static void gc()运行垃圾回收器
		public static void exit(int status)终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止
		public static long currentTimeMillis()当前时间与协调世界时 1970 年 1 月 1 日午夜之间的时间差（以毫秒为单位测量）。
		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)

 */
public class SystemDemo {
	public static void main(String[] args) {
		// public static void exit(int status)终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非
		// 0 的状态码表示异常终止
		// return;
		// System.exit(0);
		System.out.println("over");
		// public static long currentTimeMillis()当前时间与协调世界时 1970 年 1 月 1
		// 日午夜之间的时间差（以毫秒为单位测量）。
		System.out.println(System.currentTimeMillis());

		// public static void arraycopy(Object src,int srcPos,Object dest,int
		// destPos,int length)
		// 从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束
		int[] arr = { 1, 2, 3, 4 };
		Object src = arr;// 源数组
		int srcPos = 2;// 源数组中的起始位置
		int[] arr2 = new int[5];
		Object dest = arr2;// 目标数组
		int destPos = 1;// 目标数据中的起始位置
		int length = 2;// 要复制的数组元素的数量
		System.out.println(Arrays.toString(arr2));
		System.arraycopy(src, srcPos, dest, destPos, length);
		System.out.println(Arrays.toString(arr2));
	}
}
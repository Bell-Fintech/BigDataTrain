package cn.edu360;

import java.util.Arrays;
import java.util.List;

/*
 * 可变参数：就是当定义参数时不知道定义多少个合适时，可以使用可变参数
 * 可变参数本质上是一个数组
 * 可变参数格式：
 * 	修饰符 返回值类型 方法名(数据类型... 变量名){
 * 		方法体；
 * 	}
 * 可变参数注意事项：	当方法中存在可变参数和多个参数时，可变参数必须放在参数列表最后一位
 */
public class ChangeParamDemo {
	public static void main(String[] args) {
		int sum = getSum(1, 2, 3, 4, 5);
		System.out.println(sum);

		//数组转换成集合
		// public static <T> List<T> asList(T... a)返回一个受指定数组支持的固定大小的列表
		Integer[] arr = { 1, 2, 3, 4 };
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		//集合转换成数组
		Object[] array = list.toArray();
	}

	/**
	 * 计算多个整数和
	 * 
	 * @param 要计算和的整数
	 * @return 结果
	 */
	public static int getSum(int... param) {
		int sum = 0;
		for (int value : param) {
			sum += value;
		}
		return sum;
	}
}

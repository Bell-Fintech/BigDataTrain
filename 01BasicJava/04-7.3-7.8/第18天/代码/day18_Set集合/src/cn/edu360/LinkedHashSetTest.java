package cn.edu360;

import java.util.LinkedHashSet;
import java.util.Random;

/*
 * 使用LinkedHashSet编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 */
public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		Random r = new Random();
		//要求的是10个随机数，所以需要判断个数
		while(set.size()<10){
					//(0-19)+1-1-20
			int n = r.nextInt(20)+1;
			set.add(n);
			System.out.println(n);
		}
		System.out.println("集合的长度是："+set.size());
		System.out.println(set);
	}
}
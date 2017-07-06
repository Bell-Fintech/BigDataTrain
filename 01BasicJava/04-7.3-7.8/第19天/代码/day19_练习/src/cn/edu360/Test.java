package cn.edu360;

import java.util.LinkedHashSet;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		/*
		 * 1.使用一个容器存储0-1000数值中的999个数值，要求这999个数是不重复值。最后求出0-1000这些个数中哪两个数不存在容器中
		 */
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		//先将0-1000的数值放进list集合中
		for(int i=0; i<=1000; i++){
			set.add(i);
		}
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		//第二个集合存在的数值范围是0-1000，但是每次存储进去的数都是随机的
		Random r = new Random();
		//一共要求是存储999个
		while(set2.size()<999){
			set2.add(r.nextInt(1001));
		}
		
		//拿set调用removeAll方法
		set.removeAll(set2);
		System.out.println(set);
	}
}

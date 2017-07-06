package cn.edu360;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(20);
		list.add(-10);
		list.add(30);
		System.out.println(list);
		// public static <T> void sort(List<T> list)根据元素的自然顺序 对指定列表按升序进行排序
		Collections.sort(list);
		//Collections.reverse(list);
		System.out.println(list);
		
		// public static <T> int binarySearch(List<?> list,T key)使用二分搜索法搜索指定列表，以获得指定对象
		System.out.println(Collections.binarySearch(list, 0));
		
		
		// public static <T> T max(Collection<?> coll)根据元素的自然顺序，返回给定 collection 的最大元素
		System.out.println(Collections.max(list));
		
		// public static void reverse(List<?> list)反转指定列表中元素的顺序
		//Collections.reverse(list);
		//System.out.println(list);
		
		// public static void shuffle(List<?> list)使用默认随机源对指定列表进行置换。所有置换发生的可能性都是大致相等的
		Collections.shuffle(list);
		System.out.println(list);
	}

}

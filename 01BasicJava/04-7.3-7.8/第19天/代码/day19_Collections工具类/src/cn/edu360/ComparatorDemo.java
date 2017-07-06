package cn.edu360;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(20);
		list.add(-10);
		list.add(40);
		//默认的sort方法是升序的
		//Collections.sort(list);
		Comparator<Integer> comparator = new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				//o1和o2比较是升序
				//return o1.compareTo(o2);
				//o2和o1比较是降序
				return o2.compareTo(o1);
			}
			
		};
		//public static <T> void sort(List<T> list,Comparator<? super T> c)根据指定比较器产生的顺序对指定列表进行排序
		Collections.sort(list, comparator);
		System.out.println(list);
		//public static <T> int binarySearch(List<? extends T> list,T key,Comparator<? super T> c)使用二分搜索法搜索指定列表，以获得指定对象
		System.out.println(Collections.binarySearch(list, 20,comparator));
	}

}

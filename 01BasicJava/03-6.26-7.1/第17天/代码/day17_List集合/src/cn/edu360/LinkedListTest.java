package cn.edu360;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList
	去除集合中自定义对象的重复值(对象的成员变量值都相同)
 */
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Person("张三", 18, '男'));
		list.add(new Person("张三", 18, '男'));
		list.add(new Person("李四", 18, '男'));
		list.add(new Person("王五", 18, '男'));
		list.add(new Person("赵六", 18, '男'));
		list.add(new Person("赵六", 18, '男'));
		showList(list);

		// 1.新建一个集合
		// test(list);

		// 2.不需要创建新集合
		test2(list);
		
		showList(list);
	}

	private static void test2(LinkedList list) {
		for(int i=0; i<list.size()-1; i++){
			for(int j=i+1; j<list.size(); j++){
				if(list.get(i).equals(list.get(j))){
					list.remove(j);
					j--;
				}
			}
		}
	}

	private static void test(LinkedList list) {
		LinkedList list2 = new LinkedList();
		for (int i = 0; i < list.size(); i++) {
			if (!list2.contains(list.get(i))) {
				list2.add(list.get(i));
			}
		}
		showList(list2);
	}

	private static void showList(LinkedList list) {
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------------------------------");
	}

}

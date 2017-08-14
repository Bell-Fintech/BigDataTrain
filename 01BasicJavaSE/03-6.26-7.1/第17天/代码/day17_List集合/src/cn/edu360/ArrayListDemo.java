package cn.edu360;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List:
 * 	ArrayList：底层是数组实现，查询比较快，增删比较慢
 * 	LinkedList：底层是链表实现，查询比较慢，增删比较快
 * 开发中如果对查询操作使用比较多的话，就使用ArrayList
 * 开发中如果对增删操作使用比较多的话，就使用LinkedList
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("张三", 18, '男'));
		list.add(new Person("张三", 18, '男'));
		list.add(new Person("李四", 18, '男'));
		list.add(new Person("王五", 18, '男'));
		list.add(new Person("赵六", 18, '男'));
		list.add(123);
		list.add("哈哈");
		list.remove(new Integer(123));//删除123
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	}
}
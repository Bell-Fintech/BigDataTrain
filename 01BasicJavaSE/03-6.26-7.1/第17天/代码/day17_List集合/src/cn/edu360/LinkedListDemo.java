package cn.edu360;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(111);
		list.add(222);
		list.add(333);
		System.out.println(list);
		//public void addFirst(E e)将指定元素插入此列表的开头 
		list.addFirst("000");
		
		//public void addLast(E e)将指定元素添加到此列表的结尾
		list.addLast(444);
		
		//public E getFirst()返回此列表的第一个元素
		System.out.println(list.getFirst());
		
		//public E getLast()返回此列表的最后一个元素
		System.out.println(list.getLast());
		
		//public E removeFirst()移除并返回此列表的第一个元素
		//public E removeLast()移除并返回此列表的最后一个元素
	}
}

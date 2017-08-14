package cn.edu360;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * 有序的 collection（也称为序列）。此接口的用户可以对列表中每个元素的插入位置进行精确地控制。
 * 用户可以根据元素的整数索引（在列表中的位置）访问元素，并搜索列表中的元素。与 set 不同，列表通常允许重复的元素
 * ListIterator是List接口特有的遍历迭代器
 */
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		// void add(int index,E element)将指定的元素插入此列表中的指定位置
		list.add("111");
		list.add("333");
		list.add("444");
		System.out.println(list);
		list.add(1, "222");
		System.out.println(list);

		// E remove(int index)移除此列表中指定位置上的元素并将这个元素返回
		System.out.println(list.remove(3));
		System.out.println(list);

		// E get(int
		// index)返回指定索引上面的元素，如果不存在返回java.lang.IndexOutOfBoundsException:
		System.out.println(list.get(2));
		// E set(int index,E element)替换指定索引位置上面的元素,返回的内容是替换的元素内容
		System.out.println(list.set(2, "555"));
		System.out.println(list);
		System.out.println("-------------------------");

		// ListIterator listIterator()
		ListIterator iterator = list.listIterator();
		// 正序遍历集合
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		while (iterator.hasPrevious()) {//必须先正序，才能逆序
			System.out.print(iterator.previous()+" ");
		}
	}

}

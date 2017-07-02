package cn.edu360;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionDemo3 {

	public static void main(String[] args) {
		/*
		 * 遍历的第一种方式：通过迭代器进行遍历
		 * 	Iterator<E> iterator()返回在此 collection 的元素上进行迭代的迭代器
		 */
		Collection c = new ArrayList();
		c.add("小猫");
		c.add("小狗");
		c.add("小刺猬");
		Iterator iterator = c.iterator();
		System.out.println(iterator instanceof ListIterator);
		//boolean hasNext()如果仍有元素可以迭代，则返回 true
		///boolean b = iterator.hasNext();
		//E next()返回迭代的下一个元素。
		//System.out.println(iterator.next());
		while (iterator.hasNext()) {
			//c.add(111);在使用迭代器进行遍历时，不能直接通过集合进行修改元素，如果一定要修改的话，只能使用迭代器进行修改
			//java.util.ConcurrentModificationException：并发修改异常
			System.out.println(iterator.next());
		}
		//System.out.println(iterator.next());可以直接next取出，但是不知道什么时候没有元素
		
		/*
		 * 集合的第二种遍历方式：将集合转换成数组然后再遍历
		 */
		//Object[] toArray()返回包含此 collection 中所有元素的数组
		Object[] array = c.toArray();
		System.out.println(Arrays.toString(array));
		for(int i=0; i<array.length; i++){
			//这里面可以取出集合中的元素进行某些操作
		}
	}

}

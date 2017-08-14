package cn.edu360;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection 层次结构 中的根接口。Collection 表示一组对象，这些对象也称为 collection 的元素。
 * 一些 collection 允许有重复的元素(List)，而另一些则不允许(Set)。一些 collection 是有序的(List)，而另一些则是无序的(HashSet)。
 * 
 */
public class CollectionDemo {

	public static void main(String[] args) {
		/*
		 * Integer[] arr = new Integer[1]; arr[0] = "啊哈哈";
		 */

		// 因为Collection是一个接口，里面的方法不能直接使用，所以需要找到具体的子类
		Collection c = new ArrayList();
		// boolean add(E e)
		c.add(123);// 因为Collection只能添加引用类型，所以添加进去的123其实是一个Integer，这是自动装箱的特性
		c.add("哈哈");
		System.out.println(c);// [123, 哈哈]

		// boolean remove(Object o)
		System.out.println(c.remove(123));
		System.out.println(c);

		// void clear()清空集合
		c.clear();
		System.out.println(c);

		// boolean contains(Object o) 如果此 collection 包含指定的元素，则返回 true
		c.add(123);
		c.add("javase");
		c.add("javaee");
		c.add("hadoop");
		System.out.println(c.contains("java"));

		// boolean isEmpty()判断集合是否为空，如果是空就返回true
		System.out.println(c.isEmpty());

		// int size()获取集合中的元素个数
		System.out.println(c.size());
	}

}

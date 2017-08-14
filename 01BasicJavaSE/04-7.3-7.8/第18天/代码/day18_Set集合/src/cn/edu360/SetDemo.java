package cn.edu360;

import java.util.LinkedHashSet;
import java.util.Set;
/*
 * Set集合是一个不包含重复元素的 collection
 * 此类实现 Set 接口，由哈希表（实际上是一个 HashMap 实例）支持。它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变
 * Set集合是哈希表结构，底层依赖被存储元素的hashCode方法和equals方法去重
 * 去重的执行顺序：首先拿到被添加元素的哈希值和已经存在集合中的所有元素的哈希值进行比较，一旦发现哈希值相同，会再去调用equals方法判断两个对象是否重复，如果
 * equals方法返回true，那么这个元素就是一个重复的元素，就不会添加到集合中
 * LinkedHashSet：它的用法和HashSet一样，但是LinkedHashSet保证存入的顺序和取出的顺序一致
 * LinkedHashSet：哈希表结构+链表结构
 * 	哈希表：标准元素的唯一性
 * 	链表：保证迭代的顺序
 */
public class SetDemo {
	public static void main(String[] args) {
		// 存储字符串并遍历
		Set<String> set = new LinkedHashSet<String>();
		set.add("javase");
		set.add("javase");
		set.add("javaee");
		set.add("javaee");
		set.add("javame");
		set.add("hadoop");
		System.out.println(set);
		
		// 存储自定义对象并遍历
		Set<Person> set2 = new LinkedHashSet<Person>();
		set2.add(new Person("张三",18));
		set2.add(new Person("张三",18));
		set2.add(new Person("李四",18));
		set2.add(new Person("李四",28));
		set2.add(new Person("王五",18));
		set2.add(new Person("王五",18));
		for(Person p : set2){
			System.out.println(p);
		}
	}
}
package cn.edu360;

import java.util.HashSet;

/*
 * HashSet是不保证迭代的顺序，由哈希表结构保证元素的唯一性，是由元素对象的hashCode方法和equals方法保证的
 */
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("张三", 18));
		set.add(new Person("张三", 18));
		set.add(new Person("李四", 18));
		set.add(new Person("李四", 28));
		for(Person p : set){
			System.out.println(p.toString());
		}
	}

}

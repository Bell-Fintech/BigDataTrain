package cn.edu360;

import java.util.HashMap;
import java.util.Map;

/*
 * Map集合：将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值
 * 	Map集合是双列的，Collection是单列的
 * 	Map的键是保证唯一性的，但是值不保证唯一
 * 	Collection的Set集合的元素是保证唯一的
 * 	Map集合是键值对的方式：key=value
 *  Map的键是通过哈希表结构保证唯一性的
 *  HashMap的迭代器顺序不能保证
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		// V put(K key,V value)在此映射中关联指定值与指定键。如果该映射以前包含了一个该键的映射关系，则旧值被替换
		String v = map.put(110, "报警电话");
		System.out.println(v);
		v = map.put(110, "报警电话222");
		System.out.println(v);
		v = map.put(120, "急救");
		System.out.println(v);
		map.put(119, "救火电话");
		map.put(11, "救火电话");
		System.out.println(map);
		
		// V remove(Object key)从此映射中移除指定键的映射关系（如果存在）。 
		System.out.println(map.remove(101));
		System.out.println(map);
		
		// void clear()清空map集合
		//map.clear();
		//System.out.println(map);
		
		// boolean containsKey(Object key)如果此映射包含对于指定键的映射关系，则返回 true
		System.out.println(map.containsKey(101));
		
		// boolean containsValue(Object value)如果此映射将一个或多个键映射到指定值，则返回 true
		System.out.println(map.containsValue("急1救"));
		
		// boolean isEmpty()如果此映射不包含键-值映射关系，则返回 true
		//map.clear();
		//System.out.println(map.isEmpty());//true
		
		// int size()返回map集合中的键值对数
		System.out.println(map.size());
	}

}

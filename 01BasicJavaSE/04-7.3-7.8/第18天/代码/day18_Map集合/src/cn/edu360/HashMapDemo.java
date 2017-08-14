package cn.edu360;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 	HashMap<String,String>
	HashMap<Student,String>
	HashMap保证键的唯一也是通过键元素对象的hashCode方法和equals方法
	LinkedHashMap可以保证迭代的顺序
 */
public class HashMapDemo {
	public static void main(String[] args) {
		/*HashMap<String, String> map = new HashMap<String,String>();
		map.put("123", "哈哈");
		map.put("123", "嘻嘻");
		map.put("456", "嘿嘿");
		map.put("456", "呵呵");
		System.out.println(map);*/
		Map<Student, String> map = new LinkedHashMap<Student,String>();
		map.put(new Student("张三", 18), "001");
		map.put(new Student("张三", 18), "002");
		map.put(new Student("张三", 18), "004");
		map.put(new Student("李四", 28), "003");
		map.put(new Student("李四", 18), "005");
		Set<Entry<Student, String>> entrySet = map.entrySet();
		for (Entry<Student, String> entry : entrySet) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}

}
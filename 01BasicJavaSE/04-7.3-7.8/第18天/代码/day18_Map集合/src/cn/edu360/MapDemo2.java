package cn.edu360;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "网络不好");
		map.put(2, "账户余额不足");
		map.put(3, "网络异常，数据丢失");
		map.put(4, "身法验证失败");
		map.put(5, "身法验证失败");
		// System.out.println(map);

		// V get(Object key)返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回 null
		System.out.println(map.get(5));

		// Set<K> keySet()返回此映射中所包含的键的 Set 视图
		Set<Integer> keySet = map.keySet();
		// System.out.println(keySet);

		// Collection<V> values()返回此映射所包含的值的 Collection 视图
		Collection<String> values = map.values();
		// System.out.println(values instanceof AbstractCollection);
		// System.out.println(values);
		/*
		 *第一种遍历： 获取所有的键的集合，然后遍历键的集合，通过键取值
		 */
		for (Integer key : keySet) {
			String value = map.get(key);
			System.out.println(key + "=" + value);
		}

		//第二种遍历方式：
		// Set<Map.Entry<K,V>> entrySet()返回键值对对象的Set集合
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		// 遍历键值对集合
		for (Map.Entry<Integer, String> entry : entrySet) {
			// K getKey()返回与此项对应的键
			// K getKey()返回与此项对应的键
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		/*for(Map.Entry<Integer, String>	entry :map.entrySet()){
			// K getKey()返回与此项对应的键
			// K getKey()返回与此项对应的键
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}*/
	}

}

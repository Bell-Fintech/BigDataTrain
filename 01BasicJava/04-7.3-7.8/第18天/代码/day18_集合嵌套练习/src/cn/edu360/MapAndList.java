package cn.edu360;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MapAndList {
	public static void main(String[] args) {
		/*1.Map集合嵌套List集合。
		 要求输出结果：
				 三国演义
				 	吕布
				 	周瑜
				 笑傲江湖
				 	令狐冲
				 	林平之
				 神雕侠侣
				 	郭靖 
				 	杨过
		 */
		LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<String, ArrayList<String>>();
		ArrayList<String> list = new ArrayList<String>();
		list.add("吕布");
		list.add("周瑜");
		map.put("三国演义", list);
		list = new ArrayList<String>();
		list.add("令狐冲");
		list.add("林平之");
		map.put("笑傲江湖", list);
		list = new ArrayList<String>();
		list.add("郭靖");
		list.add("杨过");
		map.put("神雕侠侣", list);

		for (Entry<String, ArrayList<String>> entry : map.entrySet()) {
			String key = entry.getKey();
			System.out.println(key);
			// 遍历ArrayList里面的内容
			ArrayList<String> value = entry.getValue();
			for (String v : value) {
				System.out.println("\t" + v);
			}
		}
	}
}

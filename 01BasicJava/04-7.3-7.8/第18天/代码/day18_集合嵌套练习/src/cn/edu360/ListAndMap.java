package cn.edu360;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ListAndMap {
	public static void main(String[] args) {
		/*
		 * 3.List集合嵌套Map集合。
			  要求输出结果：
				 周瑜---小乔
				 吕布---貂蝉
			
				 郭靖---黄蓉
				 杨过---小龙女
			
				 令狐冲---任盈盈
				 林平之---岳灵珊
		 */
		ArrayList<LinkedHashMap<String, String>> list = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();
		map.put("周瑜", "小乔");
		map.put("吕布", "貂蝉");
		list.add(map);
		map = new LinkedHashMap<String,String>();
		map.put("郭靖", "黄蓉");
		map.put("杨过", "小龙女");
		list.add(map);
		map = new LinkedHashMap<String,String>();
		map.put("令狐冲", "任盈盈");
		map.put("林平之", "岳灵珊");
		list.add(map);
		
		for(LinkedHashMap<String, String> m : list){
			//输出两次的值
			for(Entry<String, String> entry : m.entrySet()){
				System.out.println(entry.getKey()+"---"+entry.getValue());
			}
			//在输出两行之后，输出一个换行分隔符
			System.out.println();
		}
	}
}

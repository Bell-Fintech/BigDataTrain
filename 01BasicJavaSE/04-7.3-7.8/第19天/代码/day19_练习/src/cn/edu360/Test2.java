package cn.edu360;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> map = new LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>>();

		// 北京省，市，区
		LinkedHashMap<String, ArrayList<String>> map2 = new LinkedHashMap<String, ArrayList<String>>();
		ArrayList<String> list = new ArrayList<String>();
		list.add("朝阳区");
		list.add("昌平区");
		list.add("通州区");
		list.add("大兴区");
		list.add("密云区");
		list.add("东城区");
		map2.put("北京市", list);
		map.put("北京省", map2);

		// 安徽省，市，区
		map2 = new LinkedHashMap<String, ArrayList<String>>();
		list = new ArrayList<String>();
		list.add("瑶海区");
		list.add("包河区");
		list.add("蜀山区");
		map2.put("合肥市", list);
		list = new ArrayList<String>();
		list.add("金安区");
		list.add("裕安区");
		map2.put("六安市", list);
		map.put("安徽省", map2);

		// 江苏省，市，区
		map2 = new LinkedHashMap<String, ArrayList<String>>();
		list = new ArrayList<String>();
		list.add("鱼花台区");
		list.add("浦口区");
		list.add("江宁区");
		map2.put("南京市", list);
		list = new ArrayList<String>();
		list.add("锡山区");
		list.add("滨湖区");
		list.add("惠山区");
		map2.put("无锡市", list);
		map.put("江苏省", map2);

		// 遍历打印，最外层打印的键值是省名
		for (Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> entry : map.entrySet()) {
			// 取出省名
			String provinceName = entry.getKey();
			System.out.println(provinceName);
			// 遍历市
			for (Map.Entry<String, ArrayList<String>> entry2 : entry.getValue().entrySet()) {
				// 取出市名
				String cityName = entry2.getKey();
				System.out.println("\t" + cityName);
				// 取出区名
				for (String name : entry2.getValue()) {
					System.out.println("\t\t" + name);
				}
			}
		}
	}

}

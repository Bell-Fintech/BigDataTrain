package cn.edu360;

import java.util.ArrayList;

/*
 * ArrayList
	去除集合中字符串的重复值(字符串的内容相同)
 */
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("哈哈");
		list.add("哈哈");
		list.add("呵呵");
		list.add("呵呵");
		list.add("嘿嘿");
		list.add("嘿嘿");
		System.out.println(list);
		// 方式1：需要创建一个新的集合
		// test(list);
		// 方式2：不需要创建新集合
		test2(list);
	}

	private static void test2(ArrayList list) {
		//拿前面的元素和后面的元素进行比较，一旦发现相等了，就删除后面的元素
		for(int i=0; i<list.size()-1; i++){
			for(int j=i+1;j<list.size(); j++){
				if(list.get(i).equals(list.get(j))){
					list.remove(j);
					j--;//防止跳过下一个元素值
				}
			}
		}
		System.out.println(list);
	}

	private static void test(ArrayList list) {
		// 1.新创建一个集合
		ArrayList list2 = new ArrayList();
		// 2.遍历原集合，然后判断新集合中有没有当前遍历的元素，如果没有就添加进去
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if (!list2.contains(obj)) {
				list2.add(obj);
			}
		}
		System.out.println(list2);
	}

}

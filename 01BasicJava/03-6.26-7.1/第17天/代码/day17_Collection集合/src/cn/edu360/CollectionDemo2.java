package cn.edu360;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("11");
		c.add(22);
		c.add(33);
		Collection c2 = new ArrayList();
		c2.add("javase");
		c2.add("javaee");
		c2.add("spark");
		System.out.println(c);
		System.out.println(c2);
		// boolean addAll(Collection c)将指定 collection 中的所有元素都添加到此 collection 中
		c.addAll(c2);
		System.out.println(c);
		System.out.println(c2);
		
		// boolean removeAll(Collection c)移除此 collection 中那些也包含在指定 collection 中的所有元素
		// c.removeAll(c2);
		// System.out.println(c);
		// System.out.println(c2);
		
		// boolean containsAll(Collection c) 如果此 collection 包含指定 collection 中的所有元素，则返回 true
		c2.add("aaa");
		System.out.println(c2);
		System.out.println(c.containsAll(c2));//false
		
		// boolean retainAll(Collection c)仅保留此 collection 中那些也包含在指定 collection 的元素
		c.retainAll(c2);
		System.out.println(c);
		System.out.println(c2);
	}

}

package cn.edu360;

import java.util.ArrayList;
import java.util.Collections;
//如果不满意自定义对象里面的排序方式可以使用Comparator比较器进行自己的排序规则
//Comparator的比较规则可以覆盖自定义对象里面的Comparable的方法里面的排序规则
public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("zhangsan", 18));
		list.add(new Person("zhangsan", 8));
		list.add(new Person("lisi", 4));
		list.add(new Person("zhaoliu", 3));
		list.add(new Person("wangwu", 28));
		list.add(new Person("dahuang", 8));
		list.add(new Person("xiaoming", 30));
		// 升序：以姓名排序，如果姓名相同再以年龄排序
		// 降序：以年龄排序，如果年龄相同再以姓名排序
		//列表中的所有元素都必须实现 Comparable 接口
		Collections.sort(list);
		for (Person p : list) {
			System.out.println(p);
		}
	}

}

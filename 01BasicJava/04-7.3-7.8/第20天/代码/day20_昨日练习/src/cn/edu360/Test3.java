package cn.edu360;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 	学号，姓名，年龄，总分
	173620,王康,22,470
	173623,刘明,22,450
	173628,王瑞,20,460
	173624,李玉,21,432
	173622,李倩,24,480
	173634,刘军,23,550
	173632,刘向,20,650

将文件中的数据存入到ArrayList<Person>中，然后分别按照优先级学号、年龄、总分进行排序输出
 */
public class Test3 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(173620, "王康", 22, 470));
		list.add(new Person(173623, "刘明", 22, 450));
		list.add(new Person(173623, "刘明2", 25, 450));
		list.add(new Person(173623, "刘明2", 25, 480));
		list.add(new Person(173628, "王瑞", 20, 460));
		list.add(new Person(173624, "李玉", 21, 432));
		list.add(new Person(173622, "李倩", 24, 480));
		list.add(new Person(173634, "刘军", 23, 550));
		list.add(new Person(173632, "刘向", 20, 650));
		Collections.sort(list);
		for (Person p : list) {
			System.out.println(p);
		}
	}
}
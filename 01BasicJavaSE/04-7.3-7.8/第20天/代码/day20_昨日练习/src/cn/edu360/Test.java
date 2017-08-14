package cn.edu360;

import java.util.ArrayList;

//1.定义一个ArrayList<Student> ，放入3个Student对象，然后计算出list中所有Student对象的平均分及平均年龄，并将结果打印到控制台
public class Test {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("张三", 18, 70));
		list.add(new Student("李四", 20, 50.5));
		list.add(new Student("王五", 38, 90));
		int age = 0;
		double score = 0;
		for (Student s : list) {
			age += s.getAge();
			score += s.getScore();
		}
		age = (int) Math.round(age / 3.0);
		score = score / 3;
		System.out.println("平均成绩：" + score + ",平均年龄：" + age);
	}
}

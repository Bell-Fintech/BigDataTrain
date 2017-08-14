package cn.edu360;

/*
 * 1.现在需要保存10个学员的信息，需要保存的信息有姓名，年龄，性别，地址属性以及吃饭，睡觉，学习等行为；
 * 请设计一个程序存储10名学员的信息，然后遍历打印每名学员的信息
 */
public class Test {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student("刘备", 62, '男');
		students[1] = new Student("曹操", 63, '男');
		students[2] = new Student("孙权", 60, '男');
		students[3] = new Student("关羽", 58, '男');
		students[4] = new Student("张飞", 58, '男');
		students[5] = new Student("赵云", 80, '男');
		students[6] = new Student("吕布", 38, '男');
		students[7] = new Student("貂蝉", 38, '男');
		students[8] = new Student("周瑜", 48, '男');
		students[9] = new Student("诸葛亮", 60, '男');
		
		for(int i=0; i<students.length; i++){
			System.out.println(students[i]);
		}
	}

}

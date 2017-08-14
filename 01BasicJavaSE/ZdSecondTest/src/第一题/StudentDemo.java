package 第一题;
/*
 * 现在需要保存10个学员的信息，需要保存的信息有姓名，年龄，性别，地址属性
 * 以及吃饭，睡觉，学习等行为；请设计一个程序存储10名学员的信息，然后遍历打印每名学员的信息
*/
public class StudentDemo {
	public static void main(String[] args) {
		Student[] students=new Student[10];
		for(int i=0;i<students.length;i++){
			if(i%2==0){
				students[i]=new Student(i,19, 'm', "中北");
				students[i].eat();
				students[i].sleep();
				students[i].study();
				System.out.println();
			}
			else{
				students[i]=new Student(i,20, 'w', "中北");
				students[i].eat();
				students[i].sleep();
				students[i].study();
				System.out.println();
			}
		}
	}
	
}
class Student{
	private int num;
	private int age;
	private char sex;
	private String address;
	public void eat(){
		System.out.print("该学员吃饭,");
	}
	public void sleep(){
		System.out.print("睡觉,");
	}
	public void study(){
		System.out.print("学习");
	}
	public Student() {
	}
	public Student(int i, int age, char sex, String address) {
		this.num = i;
		this.age = age;
		this.sex = sex;
		this.address = address;
		System.out.print(i+"号学员,年龄："+age+"；性别为："+sex+"；地址为："+address+";");
	}
}
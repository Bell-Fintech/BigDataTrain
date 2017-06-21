/*
学生类：
	首先从现实生活中分析：
		属性：姓名，年龄，学号。。。
		行为：吃饭，睡觉，学习。。。
	对应到java中的类：
		成员变量：name,age,number
		成员方法：eat,sleep,study
		
栈：存放的是局部变量；局部变量是定义在方法参数列表上或者方法内部的变量
	存放在栈中的变量不会被赋值，需要手动赋值
	方法也是在栈中允许的，当方法结束之后，局部变量就会被释为垃圾，等待着gc的回收
堆：存放的都是new出来的东西；放在这里面的变量都是成员变量，成员变量都有初始化值；引用变量默认值都是null，基本数据类型的默认值就是我们前面所说的默认值
	堆里面在创建对象的时候，会将类中没有被static修饰的成员变量拷贝一份过来
	堆里面存放的都是方法的地址，真正的方法存放在方法区中
方法区：里面存放的都是程序唯一的东西；分为static区和class区；在类被创建对象之前，会先将字节码文件加载到方法区中的class区中，
	然后在创建对象的时候会以这里面的字节码文件为模板
*/
class StudentDemo{
	public static void main(String[] args){
		Student s = new Student();
		s.name = "张三";
		s.age = 21;
		s.number = 10110;
		System.out.println("name="+s.name+",age="+s.age+",number="+s.number);
		s.sleep();
	}
}


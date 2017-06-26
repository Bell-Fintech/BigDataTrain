package cn.edu360;
/*
 * 类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。所有对象（包括数组）都实现这个类的方法。 
	Object类只有一个无参的构造方法
	所有类都是Object类的子类，所以所有子类都具有Object类的非私有方法
Object类的方法：
	public int hashCode()返回该对象的哈希码值，这个哈希值是根据地址值计算得来的，同一个对象的哈希值是相同的
	public final Class<?> getClass()返回此 Object 的运行时类
		万物都可以理解为对象，一个类也有组成部分和特点，一个类有成员变量，构造方法，包名，成员方法，父类，接口，名字。。。
		所以java把一个类也封装成了一个具体的类，这个类就是Class
	public String toString()返回该对象的字符串表示
	public boolean equals(Object obj)指示其他某个对象是否与此对象“相等”。
	protected Object clone()创建当前对象的一个副本 
 */
public class ObjectDemo {

	public static void main(String[] args) throws Exception {
		//public int hashCode()返回该对象的哈希码值，这个哈希值是根据地址值计算得来的，同一个对象的哈希值是相同的
		Person p = new Person();
		System.out.println(p.hashCode());//366712642
		System.out.println(p.hashCode());//366712642
		Person p2 = new Person();
		System.out.println(p2.hashCode());//1829164700
		
		/*public final Class<?> getClass()返回此 Object 的运行时类
			万物都可以理解为对象，一个类也有组成部分和特点，一个类有成员变量，构造方法，包名，成员方法，父类，接口，名字。。。
			所以java把一个类也封装成了一个具体的类，这个类就是Class*/
		Class clazz = p2.getClass();
		//public String getName()以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称
		System.out.println(clazz.getName());//cn.edu360.Demo
		//public String getSimpleName()返回源代码中给出的底层类的简称
		System.out.println(clazz.getSimpleName());//Demo
		
		//一般java提供的类的toString方法已经重写了，我们自己定义的类的toString方法需要自己重写
		//public String toString()返回该对象的字符串表示
		//getClass().getName() + "@" + Integer.toHexString(hashCode());
		System.out.println(p2.toString());//cn.edu360.Demo@6d06d69c
		System.out.println(p2.getClass().getName()+"@"+Integer.toHexString(p2.hashCode()));//cn.edu360.Person@6d06d69c
		String s = new String("哈哈哈哈");
		System.out.println(s);
		
		//我们一般用equals比较对象的内容是否相等，一般用==比较地址值是否相等
		//public boolean equals(Object obj)指示其他某个对象是否与此对象“相等”。 
		System.out.println(p.equals(p2));//true
		System.out.println(p==p2);//false
		
		String s2 = new String("哈哈哈哈");
		System.out.println(s.equals(s2));//true
		System.out.println(s==s2);//false
		
		//protected Object clone()创建当前对象的一个副本 
		Object obj = p2.clone();
		System.out.println(obj instanceof Person);
		Person p3 = (Person)obj;
		//如果两个地址值不相等， 说明克隆成功
		System.out.println(p3==p2);//false
		
		//其实我们这个克隆只是一浅克隆，对象里面的成员变量如果是一个引用变量时，那么这个引用变量其实两个对象用的还是同一个字段
		System.out.println(p.obj==p2.obj);//false
		System.out.println(p2.obj==p3.obj);//true
	}
}

class Person implements Cloneable{
	public String name = "张三";
	public int age = 20;
	public Object obj = new Object();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
/*	@Override
	public boolean equals(Object obj) {
		if(null == obj){
			return false;
		}
		if(!(obj instanceof Person)){
			return false;
		}
		
		if(obj.getClass()!=getClass()){
			return false;
		}
		
		Person p = (Person)obj;

		//先比较名字，如果名字相等再比较年龄
		return this.name.equals(p.name)?this.age==p.age:false;
	}*/
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	//不满意父类的方法，子类自己重写
/*	@Override
	public String toString() {
		return "name="+name+",age="+age;
	}*/
	
}
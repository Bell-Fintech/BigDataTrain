/*
构造方法：一般是给类中的成员变量进行赋值；还可以传值
格式：
	方法的名字和类名一样
	没有返回值类型，连void都没有
	也不需要通过return返回值
注意事项：	
	每一次创建对象时，构造方法都被调用
	如果我们没有自己创建构造方法，系统会自动给出一个空参的构造方法；如果我们自己定义了，那么系统将不再提供
	构造方法也是可以重载的
	构造方法中也可以用return结束
*/
class Demo{
	public static void main(String[] args){
		Person p = new Person("李四");
		p.show();
		Person p2 = new Person();//无法将类 Person中的构造器 Person应用到给定类型
		p2.show();
	}
}
class Person{
	private String name;
	private int age;
	private char sex;
	private String password;
	public Person(){
		System.out.println("无参构造方法被调用了");
	}
	public Person(String name){
		System.out.println("有参构造方法被调用了");
		this.name = name;
		//return;
	}
	
	public void setName(String name){
		//当成员变量和局部变量同名时，使用的时候遵从就近原则
		//我们想将局部变量的name值赋值给成员变量的name值
		this.name = name;
	}
	public String getName(){
		/*
			1.获取当前的日期
			2.判断当前的日期是不是六一儿童节
			3.如果是，就将名字后面拼接上“宝宝”
			
			判断当前的日期是不是妇女节且当前的用户是不是女的，如果是加“女神”
		*/
		return name;
	}
	public void setSex(char sex){
		this.sex = sex;
	}
	public char getSex(){
		return sex;
	}
	
	//让调用者必须通过我提供的方法设置或者获取对应属性
	//你想赋值，调用我这个方法
	public void setAge(int age){
		//在赋值前，我可以做很多的操作
		if(age<1 || age>260){
			System.out.println("你设置的年龄不符合现实");
			return;
		}
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void setPassword(String password){
		//在设置年龄的时候加密
		this.password = password;
	}
	public String getPassword(){
		//获取的时候解密
		return password;
	}
	public void show(){
		System.out.println("name="+name+",age="+age+",sex="+sex);
	}
}
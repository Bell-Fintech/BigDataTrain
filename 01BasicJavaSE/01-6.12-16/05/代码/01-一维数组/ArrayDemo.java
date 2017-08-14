/*
	数组：存储同一种数据类型的元素的集合，或者说是一个容器
	数组的特点：
		数组的长度一旦定义就无法更改
		既可以存储基本数据类型，还可以存储引用类型
	数组的定义格式：
		int[]
		数据类型[] 数组名;//推荐写法
		数据类型 数组名[];//基本上不用了，C#已经废弃了
	数组的初始化：就是为数组的每个元素申请内存空间，并为每个元素赋初始化值
	
	数组的初始化：
		动态初始化：由我们指定数组的长度，由JVM为每个元素赋初始化值
			数据类型[] 数组名 = new 数据类型[数组长度];
			
			
		静态初始化：由我们指定元素的值，由JVM跟我元素的个数计算数组的长度
*/
class ArrayDemo{
	static int a;
	public static void main(String[] args){
		//int a;
		System.out.println(a);//0
		//声明了一个名字为arr的数组
		//声明了一个int类型的数组，这个数组可以存储3个int类型的值
		int[] arr = new int[3];
		System.out.println(arr);//[I@15db9742
		//取值：数组名[索引]
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);//0
		System.out.println(arr[2]);//0
		arr[0] = 1;
		System.out.println(arr[0]);//1
	}
}
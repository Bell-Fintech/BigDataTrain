/*
方法重载：java允许在一个类中存在一个以上的同名方法，这些方法的参数个数或者对应的参数数据类型不同
JVM会通过参数列表的不同来区分同名的方法
注意事项：
	方法的重载和返回值类型没有关系，只和参数列表有关系
	方法的重载：方法名相同+参数列表不同(参数个数或者对应的参数数据类型不同)
*/
class MethodLoadDemo{
	public static void main(String[] args){
		sop(123,"aa");
		sop("哈哈",11);
	}
	
	public static void sop(int i,String msg){
		System.out.println(i);
	}
	
	/* 已在类 MethodLoadDemo中定义了方法 sop(int,String)
	public static int sop(int i,String msg){
		System.out.println(i);
		return i;
	}*/
	
	public static void sop(String msg,int i){
		System.out.println(msg);
	}
}
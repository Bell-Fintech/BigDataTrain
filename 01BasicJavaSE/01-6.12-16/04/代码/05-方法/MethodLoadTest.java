//比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，并在main方法中进行测试
class MethodLoadTest{
	public static void main(String[] args){
		System.out.println(equals((byte)1,(byte)2));
		System.out.println(equals((short)1,(short)2));
		System.out.println(equals(1,2));
		System.out.println(equals(1l,2L));
	}
	public static boolean equals(byte a,byte b){
		System.out.println("byte");
		return a==b;
	}
	public static boolean equals(short a,short b){
		System.out.println("short");
		return a==b;
	}
	public static boolean equals(int a,int b){
		System.out.println("int");
		return a==b;
	}
	public static boolean equals(long a,long b){
		System.out.println("long");
		return a==b;
	}
}
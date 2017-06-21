/*
比较两个数据是否相等。
参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，
并在main方法中进行测试
*/
class over{
	public static void main(String[] args){
		byte b1=1,b2=2;
		short s1=1,s2=2;
		int i1=2,i2=2;
		long l1=1,l2=2;
		boolean b=equals(b1,b2);
		System.out.println("两个byte类型是否相等："+b);
		
		b=equals(s1,s2);
		System.out.println("两个short类型是否相等："+b);
		
		b=equals(i1,i2);
		System.out.println("两个int类型是否相等："+b);
		
		b=equals(l1,l2);
		System.out.println("两个long类型是否相等："+b);
	}
	public static boolean equals(byte b1,byte b2){
		return b1==b2;
	}
	public static boolean equals(short b1,short b2){
		return b1==b2;
	}
	public static boolean equals(int b1,int b2){
		return b1==b2;
	}
	public static boolean equals(long b1,long b2){
		return b1==b2;
	}
}
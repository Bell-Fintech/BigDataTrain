class Test1{
	public static void main(String[] args){
		
		
		long x1=30,y1=32;
		long max1 = (x1>y1) ? x1 : y1 ;
		System.out.println(max1);
		
		float f1=1.2f,f2=1.3f;
		float max2 = (f1 > f2)?f1:f2;//不是语句
		System.out.println(max2);
		
		//三个float类型数据，获取这三个数据中的最大值，输出其结果
		float f0=1.2f,f00=1.3f,f000=1.4f;
		float max=(f0>f00)?f0:f00;
		System.out.println((max>f000)?max:f000);
		
		
		int x=20,y=21;
		//boolean max = (x==y)? true : false ;  开发中不这样使用
		//System.out.println(max);
		System.out.println(x==y);
	}
}
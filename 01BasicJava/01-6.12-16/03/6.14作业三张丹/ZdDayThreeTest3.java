class ZdDayThreeTest3{
	public static void main(String[] args){
		
		//比较两个数是否相等
		int a=10,b=20;
		System.out.println(a==b);
		//boolean equal=(a==b)?true:false;//开发中不建议
		//System.out.println("equal="+equal);
		
		
		//获取两个数中最大值
		int maxTwo=a>b?a:b;
		System.out.println("maxTwo="+maxTwo);
		
		//获取三个数中最大值
		float f1=1.0f,f2=1.2f,f3=1.3f;
		float maxThree=(maxThree=f1>f2?f1:f2)>f3?maxThree:f3;	
		System.out.println("maxThree="+maxThree);
		
	}
}
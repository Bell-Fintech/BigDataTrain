//获取三个float小数中的最大值，输出其结果
class Test{
	public static void main(String[] args){
		float f = 12.12f,f2 = 10f,f3 = 10.10f,max;
		
		//先获取f和f2中的较大值
		//float max = f>f2?f:f2;
		//然后再拿max和f3做比较
		//max = max>f3?max:f3;
		
		max=(max=f>f2?f:f2)>f3?max:f3;
		System.out.println("max="+max);
	}
}
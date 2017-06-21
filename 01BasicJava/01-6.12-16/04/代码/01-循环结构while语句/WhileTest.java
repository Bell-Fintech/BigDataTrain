/*
教室高度：48m，我现在有一张足够大的纸张，厚度为：0.12m。
请问，我折叠多少次，就可以保证厚度不低于教室的高度?

48m=48000mm
0.12m=120mm

次数：0
层数：floor
厚度：层数*120
后一次的层数等于前一次的层数*2

*/
class WhileTest{
	public static void main(String[] args){
	float i=0.12f;
	int count=0;
	while(i<48.0){
		count++;
		i*=2;
	}
	System.out.println("折叠"+count+"次，厚度为："+i);
	
		//折叠次数
		int count1 = 0;
		//层数
		int floor = 1;
		while(floor*120<48000){
			count1++;
			floor *= 2;
		}
		System.out.println("经过"+count1+"次折叠，最终的厚度是："+floor*120);//经过9次折叠，最终的厚度是：61440
	
}
}
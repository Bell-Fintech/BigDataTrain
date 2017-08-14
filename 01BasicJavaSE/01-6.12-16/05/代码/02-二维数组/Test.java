/*
打印出100-999所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身
	abc=a*a*a+b*b*b+c*c*c;
	就是拿到每个位上对应的数值：
		个位：123%10=3
		十位：123/10%10=2
		百位：123/100%10=1
		
	153
	370
	371
	407
*/
class Test{
	public static void main(String[] args){
		for(int i=100; i<1000; i++){
			//先将个位，十位，百位的数值的立方求出来
			int a = i%10;
			int sum = a*a*a;
			a = i/10%10;
			int sum2 = a*a*a;
			a = i/100%10;
			int sum3 = a*a*a;
			if(i==(sum+sum2+sum3)){
				System.out.println(i);
			}
		}
	}
}
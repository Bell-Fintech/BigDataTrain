/*
for语句和while语句的区别：在初始化语句中声明的那个变量，在循环结束之后，for语句之外的语句就不能再访问这个变量了；
while语句之外的语句还可以继续访问这个变量；如果你想在循环语句结束之后继续使用这个变量就用while语句；如果你不想使用这个变量了，就用for语句，因为for语句在结束之后
这个变量就从内存中消失了，从而提升程序的运行效率

for循环：更适合做固定范围内的循环判断
while循环：更适合未知范围内的循环判断；更适合求未知数
*/
class WhileAndForDemo{
	public static void main(String[] args){
		//求1-100之间的奇数和偶数个数
		/*
		//定义保存奇数个数的变量
		int singleCount = 0;
		//定义保存偶数个数的变量
		int doubleCount = 0;
		
		先用for实现
		//遍历1-100
		for(int i=1; i<=100; i++){
			//判断当前i是奇数还是偶数
			if(i%2==0){
				doubleCount++;
			}else{
				singleCount++;
			}
		}
		System.out.println("1-100之间的奇数个数："+singleCount);
		System.out.println("1-100之间的偶数个数："+doubleCount);
		
		//用while实现
		int i = 1;
		while(i<=100){
			//判断当前i是奇数还是偶数
			if(i%2==0){
				doubleCount++;
			}else{
				singleCount++;
			}
			i++;
		}
		System.out.println("1-100之间的奇数个数："+singleCount);
		System.out.println("1-100之间的偶数个数："+doubleCount);
		*/
		
		//一次攒5块钱，什么时候攒够1024块钱
		/*用for循环实现
		int count=0;
		for(; count*5<1024; count++);*/
		//用while循环
		int count = 0;
		while(count*5<1024){
			count++;
		}
		System.out.println("经过"+count+"次，一共攒了"+count*5+"元钱");
	}
}
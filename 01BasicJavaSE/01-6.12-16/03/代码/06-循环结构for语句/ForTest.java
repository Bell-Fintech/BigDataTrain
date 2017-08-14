/*
请在控制台输出数据1-10
请在控制台输出数据10-1
求出1-10之间数据之和
求出1-100之间偶数和
求出1-100之间奇数和

请统计1-1000之间分别满足如下条件的数据有多少个：
对3整除余2
对5整除余3
对7整除余2
*/
class ForTest{
	public static void main(String[] args){
		System.out.print("数据1-10:");
		for(int i=1;i<11;i++){
			System.out.print(i+";");
		}
		System.out.println();

		System.out.print("数据10-1:");
		for(int i=10;i>0;i--){
			System.out.print(i+";");
		}
		System.out.println();
		
		int sum=0,sum1=0;
		for(int i=1;i<11;i++){
			sum+=i;
		}
		System.out.println("1-10之间数据之和sum="+sum);
		
		for(int i=1;i<101;i++){
			if(i%2==0){
				sum+=i;
			}
			else{
				sum1+=i;
			}
		}
		System.out.println("1-100之间偶数和sum="+sum);
		System.out.println("1-100之间奇数和sum1="+sum1);

		
		//请统计1-1000之间分别满足如下条件的数据有多少个：
        //对3整除余2   对5整除余3   对7整除余2
		int count0=0,count1=0,count2=0;
		for(int i=1;i<1001;i++){
			if(i%3==2){
				count0++;
			}
			if(i%5==3){
				count1++;
			}
			if(i%7==2){
				count2++;
			}
		}
		System.out.println("1-1000之间:对3整除余2的数有："+count0+"个；"+"对5整除余3的数有："+count1+"个；"+"对7整除余2的数有："+count2);
		
	}
}
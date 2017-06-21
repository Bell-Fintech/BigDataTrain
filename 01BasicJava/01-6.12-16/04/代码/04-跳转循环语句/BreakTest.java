/*
小娟的妈妈每天给她3元钱，她都会存起来，
但是，每当这一天的天数是存钱的第6天或者6的倍数的话，
她都会花去5元钱，请问，经过多少天，小娟才可以存到100元钱。

*/
class BreakTest{
	public static void main(String[] args){
		int money=0,count=0;
		//for
		for(;money<100;){
			count++;
			money+=3;
			if(count%6==0){
				money-=5;
			}
			
		}
		System.out.println("天数："+count+";money="+money);
		
		
		//while
		money=0;
		count=0;
		while(true){
			count++;//上面已经有结果 所以只执行一次
			money+=3;
			if(count%6==0){
				money-=5;
			}
			if(money>=100)
				break;
		}
		System.out.println("money="+money+";天数："+count);
	}
}
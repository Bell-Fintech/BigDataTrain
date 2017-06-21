class DoWhileTest{
	public static void main(String[] args){
		int i=1,singleCount=0,doubleCount=0;
		do{
			if(i%2!=0){
				singleCount++;
			}
			else{
				doubleCount++;
			}
			i++;
		}while(i<1001);
		System.out.println("1-1000的奇数个数："+singleCount+";偶数个数："+doubleCount);
		
	}
}
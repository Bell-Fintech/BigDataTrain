/*
非：非真即假，非假即真
*/
class Demo4{
	public static void main(String[] args){
		boolean flag = true;
		//奇数倍的时候是相反值，偶数倍的是它值的本身
		flag = !flag;
		System.out.println(flag);
	}
}
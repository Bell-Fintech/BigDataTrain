/*
异或：当所有结果都相同的时候，最终的结果是false；当所有的结果只要有两个不同，最终的结果是true
异或和或的结果基本一样，只要当两边的结果都是true的时候，最终的结果才会不一样；当左右两边的结果都是true的时候，异或的结果是false，或的结果是true
异或的结果：相同false，不同true
*/
class Demo3{
	public static void main(String[] args){
		int a = 3,b = 4;
		//左边false，右边true
		//boolean result = a++>3 | ++b>4;
		
		//左边true，右边false
		//boolean result = ++a>3 | b++>4;
		
		//左边false，右边false
		//boolean result = a++>3 | b++>4;
		
		//左边true，右边true
		boolean result = ++a>3 | ++b>4;
		System.out.println("result="+result);//异或：false	或：true
	}
}
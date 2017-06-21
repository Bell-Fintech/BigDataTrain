/*
11.输出1-1000之内的质数，
质数是大于1的自然数
质数是除了1和它自身不能被其它数整除的数。比如3就是一个质数，
因为它只能被1和3整除，
又比如4不是一个质数，因为它可以同时被1,2,4整除
*/

class ZdDayThreeTest11{
	public static void main(String[] args){
	    int j;
		boolean flag;
		  for(int i=2;i<1000;i++){
			flag=false;
			for(j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
				flag=true;
				break;
				}
			}
			if(flag==false){
				System.out.print(i+" ");
			}
		  }
	}
}
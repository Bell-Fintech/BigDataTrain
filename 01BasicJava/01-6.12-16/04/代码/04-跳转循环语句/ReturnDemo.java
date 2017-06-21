/*
跳转控制语句return语句：结束当前的方法;将一个返回值进行返回给调用者

*/
class ReturnDemo{
	public static void main(String[] args){
		//return;//无法访问的语句
		
		for(int i=1; i<=10; i++){
			if(i==3){
				//break;//1 2 over
				//continue;1 2 4 5 6 7 8 9 10 over
				return;//1 2
			}
			System.out.println(i);
		}
		
		System.out.println("over");
	}
}
/*
在数学中想表示x的一个取值区间，1<x<10；但是这样的写法在java中是不合法的；在java中可以用与来表示
*/
class Demo5{
	public static void main(String[] args){
		int x = 4;
		//boolean flag = 1<x<10;
		boolean flag = x>1 && x<10;
		System.out.println(flag);
	}
}
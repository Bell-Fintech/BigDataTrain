/*
或：当结果中只要有一个true，那么最终的结果就是true
|：不论左边的值是true还是false，右边的表达式都会执行
||：当左边的值是true的时候，右边的表达式不会执行；当左边的值是false的时候，右边的表达式才会执行
|和||的结果是一样的

||具有短路效果，开发中经常使用

或的结果：有true则true，无true则false
*/
class Demo2{
	public static void main(String[] args){
		int a = 3,b = 4;
		boolean result = ++a>3 || b++>4;
		System.out.println("result="+result);//a=4,b=5
		System.out.println("a="+a+",b="+b);//|:a=4,b=5	||:a=4,b=4
	}
}
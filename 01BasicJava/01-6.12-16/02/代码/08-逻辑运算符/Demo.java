/*
与：当所有的结果的值都是true的时候，最终的结果才是true
&：不论左边的值是true还是false，右边的表达式都会执行
&&：当左边的值是false的时候，右边的表达式就不会执行；当左边的值是true的时候，右边的表达式才会执行
&和&&的结果都是一样的

&&具有短路效果，开发中更常用

与的结果：无false则true，有false则false
*/
class Demo{
	public static void main(String[] args){
		int a = 3,b = 4;
		boolean result = a++>3 && ++b>4;
		System.out.println("result="+result);//result=false
		System.out.println("a="+a+",b="+b);//&:a=4,b=5	&&:a=4,b=5
	}
}
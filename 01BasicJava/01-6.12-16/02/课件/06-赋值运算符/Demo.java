/*

赋值运算符的顺序：从右向左
=是一个最基本的赋值运算符，在这个=基础上又演变出来一个扩展赋值运算符
	+=,-=,*=,/=,%=
	a += b -> a = a+b;
	a -= b -> a = a-b;
	a *= b -> a = a*b;
	a /= b -> a = a/b;
	a %= b -> a = a%b;
	
扩展运算符都隐含了强制类型转换
*/
class Demo{
	public static void main(String[] args){
		int a = 10;
		a += 10;
		System.out.println("a="+a);
		
		byte b = 1;
		//b = b+1;//不兼容的类型: 从int转换到byte可能会有损失
		b += 1;//b = (b的数据类型)(b+1);
		System.out.println("b="+b);
	}
}
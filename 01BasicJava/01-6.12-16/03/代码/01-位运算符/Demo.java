/*
位运算符都是整数的二进制的补码方式进行操作的
<<：左移几位就相当于乘以2的几次方(正数)，被移除的最高位直接丢弃，右边补0
>>：右移几位就相当于除以2的几次方（正数），被移除的最右边的位直接丢弃，最高位是1就补1，是0就补0
*/
class Demo{
	public static void main(String[] args){
		int a = 3;
		//int result = a<<2;
		int result = a>>1;
		System.out.println("result="+result+",a="+a);//左移：result=12,a=3	右移：result=1,a=3
	}
}
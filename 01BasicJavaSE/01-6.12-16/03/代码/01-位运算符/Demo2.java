/*
异或：一个值异或另外一个值两次，结果是它本身
异或是对数值的补码直接进行操作的，相同的时候取的值是0，不同的时候取的值是1
异或是对数值的补码进行操作的，异或之后返回的结果是原码的十进制表现形式
*/
class Demo2{
	public static void main(String[] args){
		int a = 3;
		int b = a^10;
		System.out.println("a="+a+",b="+b);
		b = b^10;
		System.out.println("a="+a+",b="+b);
	}
}
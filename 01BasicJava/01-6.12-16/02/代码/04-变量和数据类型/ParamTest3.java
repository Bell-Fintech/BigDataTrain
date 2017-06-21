/*
第一题：
byte b1=3,b2=4,b;
b=b1+b2;
b=3+4;
哪句是编译失败的呢？为什么呢？

*/
class ParamTest3{
	public static void main(String[] args){
		byte b1=3,b2=4,b,c;
		//变量相加首先会提升精度，然后再计算结果，最后再赋值
		//b=b1+b2;//不兼容的类型: 从int转换到byte可能会有损失
		c=(byte)(b1+b2);//变量之间进行运算 byte char short 之间不进行任何运算，如果运算则先变为int。想得到byte类型则强转
		//常量相加，直接计算结果看左边的变量是否可以接收值
		b=3+4;
	}
}
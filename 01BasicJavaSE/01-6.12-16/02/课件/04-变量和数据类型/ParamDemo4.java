/*
+：正号，加法
boolean类型是无法和其他数据类型做运算的
基本数据类型之间做运算，是从低精度向高精度进行自动转换的
	byte,char,short它们之间不直接相互运算，而是提升为int类型之后再相互运算
	byte,char,short->int->long->float->double
	
	long:2^63-1
	float:3.404*10^38>2*10^38>2*8^38=2*2^3^38=2*2^114>2^63-1
*/
class ParamDemo4{
	public static void main(String[] args){
		int a = 10,b = 20;
		int sum = a+b;
		System.out.println(sum);
		boolean c = true;
		//sum  = c+a;
	}
}
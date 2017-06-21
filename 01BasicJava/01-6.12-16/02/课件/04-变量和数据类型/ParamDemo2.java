/*
java语言是一门强类型语言，针对每一种数据都定义了对应的数据类型，在内存中分配了不同的内存空间大小

基本数据类型：数值型（整数型，小数型），字符型，布尔型
	整数型：byte,short,int,long
	小数型：float,double
	字符秀：char
	布尔型：boolean
			字节	位数	默认值
	byte	1		8		0
	short	2		16		0
	int		4		32		0
	long	8		64		0
	float	4		32		0.0
	double	8		64		0.0
	char	2		16		''
	boolean	1		8		false
引用数据类型：接口，类，数组

除了基本数据类型之外的类型都是引用类型

因为默认的整数都是int类型，想要声明long类型，必须在数值后面加l或者L
因为默认的小数都是double类型，如果想要声明成float类型，在数值的后面加f或者F
*/
class ParamDemo2{
	public static void main(String[] args){
		byte result=(byte)313;
		System.out.println(result);
		//整数类型
		byte a = 127;
		System.out.println(a);//12
		
		short b = 32767;
		System.out.println(b);//20
		
		int c = 2147483647;//过大的整数: 2147483648
		System.out.println(c);//30
		
		//因为默认的整数都是int类型，想要声明long类型，必须在数值后面加l或者L
		long d = 2147483648L;//过大的整数: 2147483648
		System.out.println(d);//2147483648
		
		//小数型
		//因为默认的小数都是double类型，如果想要声明成float类型，在数值的后面加f或者F
		float f = 12.12F;//不兼容的类型: 从double转换到float可能会有损失
		System.out.println(f);//12.12
		
		double e = 12.13;
		System.out.println(e);//12.13
		
		//字符型
		char ch = '中';
		//String ch = "中国";
		System.out.println(ch);//中
		
		//boolean类型
		boolean flag = true;
		System.out.println(flag);//true
	}
}
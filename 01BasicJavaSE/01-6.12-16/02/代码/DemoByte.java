class DemoByte{
	public static void main(String args[]){
		byte b1=3,b2=4,b,c;
		b=3+4;//3和4都是常量，所以java在编译时期会检查该常量的和是否超出byte类型的范围。如果没有可以赋值。
		c=(byte)(b1+b2);//变量之间进行运算 byte char short 之间不进行任何运算，如果运算则先变为int。想得到byte类型则强转
		System.out.println(b);
		System.out.println(b);
		double d=12.345;
		float f=(float)d; //从double转换到float可能会有损失
		System.out.println(f);
		
		float f1 = (float)12.345;//先是开辟8个字节存放double，后再开辟四个字节存放强制float
		float f2 = 12.345f;//默认是double，直接开辟4个字节来使用float
		
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println('a');//a
		System.out.println('a'+1);//98
		System.out.println("hello"+'a'+1);//helloa1
		System.out.println('a'+1+"hello");//98hello
		System.out.println("5+5="+5+5);//5+5=55
		System.out.println(5+5+"=5+5");//10=5+5
		
		byte by=(byte)130;//不兼容的类型: 从int转换到byte可能会有损失
		System.out.println(by);
		//输出语句：输出类型的数据的原码再转成十进制输出 130本为int类型补码即：00000000 00000000 00000000 10000010 转为byte类型时截取1个字节补码即：10000010 反码为10000001 原码为11111110 -126

		int a=100;
		a-=20;
		System.out.println(a);
		
		short sh=60;
		//sh=sh-1;//不兼容的类型: 从int转换到byte可能会有损失
		sh-=1;//扩展运算符默认有强制转换功能 相当于sh=(short)(sh-1)
		System.out.println(sh);
	}
}
/*
二进制：以0b开头，由0-1组成
八进制：以0开头，由0-7组成
十进制：默认就是十进制，由0-9组成
十六进制：以0x开头，由0-f组成
*/
class Demo2{
	public static void main(String[] args){
		//使用输出语言输出的数值，都是转换成十进制之后的数值
		System.out.println(0b100);//4
		System.out.println(0100);//64
		System.out.println(0x100);//256
	}
}



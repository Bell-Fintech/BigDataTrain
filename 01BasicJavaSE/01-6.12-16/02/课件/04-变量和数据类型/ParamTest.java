/*
我们发现一个结果因为数据类型不匹配无法赋值的时候且左边的变量的确可以接收结果时，这时候可以用数据类型强制转换
强制转换的格式：
	目标数据类型 变量名 = (目标数据类型)(要被转换的值);
*/
class ParamTest{
	public static void main(String[] args){
		int a = 3;
		byte b = 4;
		
		int c = a+b;
		System.out.println(c);
		
		byte d = (byte)(a+b);//不兼容的类型: 从int转换到byte可能会有损失
		System.out.println(d);
	}
}
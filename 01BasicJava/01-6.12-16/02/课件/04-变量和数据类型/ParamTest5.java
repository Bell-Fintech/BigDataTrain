/*
1.任何数据类型和字符串做运算的结果都是字符串
2.表达式的运算顺序是左向右
*/
class ParamTest5{
	public static void main(String[] args){
		System.out.println('a');//a
		System.out.println('a'+1);//98
		System.out.println("hello"+'a'+1);//helloa1
		System.out.println('a'+1+"hello");//98hello
		System.out.println("5+5="+5+5);//5+5=55
		System.out.println(5+5+"=5+5");//10=5+5
	}
}
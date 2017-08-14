/*
关系运算符：结果都是boolean类型的，要么是true要么是false
==：是否相等于
!=：是否不等于
instanceof：判断数据是否是指定的类型(只适用于引用类型)

==：是比较运算符
=：赋值运算符
*/
class Demo{
	public static void main(String[] args){
		int a = 10,b = 20;
		boolean result = (a==b);//不兼容的类型: int无法转换为boolean
		System.out.println("result="+result);//false
		result = (a!=b);
		System.out.println("result="+result);//true
		
		result = "哈哈" instanceof String;
		System.out.println("result="+result);//true
		
		
	}
}
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
		int x=100,y=200;
		boolean rs = x==y;//==是比较运算符 =是赋值运算符 
		System.out.println("rs="+rs);//false
		
		//rs = x=y;       // int无法转换为boolean
		
		rs = x!=y;      //rs = (x!=y);
		System.out.println("rs="+rs);//true
		
		rs = "zd" instanceof String;
		System.out.println("rs="+rs);//true  "zd" instanceof String; 为一个整体
		
		//rs = "zd";// String无法转换为boolean
		
		rs = x<y;
		System.out.println("rs="+rs);//true
		
		rs=x>y;
		System.out.println("rs="+rs);//false
		
		rs=x<=y;
		System.out.println("rs="+rs);//true
		
		rs=x>=y;
		System.out.println("rs="+rs);//false
		
	}
}
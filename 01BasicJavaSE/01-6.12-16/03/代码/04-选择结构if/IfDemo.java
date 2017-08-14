/*
选择结构：也叫作分支结构，根据结果的不同执行不同的代码
	if语句：
		if语句格式：
			if(关系表达式){
				语句体；
			}
		执行流程：
			首先计算出关系表达式的值，看其结果是true还是false
			如果是true执行语句体
			如果是false就不执行语句体
	if语句的注意事项：
		if后面的括号里面的值只能是true或者false
		if语句如果没有大括号默认可以控制紧挨着的一条语句
		有大括号就没有分号，有分号就没有大括号
	switch语句
*/
class IfDemo{
	public static void main(String[] args){
		//需求：如果两个数值相等就输出相等
		int a = 10,b = 10;
		if(a!=b){//不兼容的类型: int无法转换为boolean
			System.out.println("a和b是相等的");
		}
		System.out.println("over");
	}
}
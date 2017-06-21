/*
三目运算符：它可以根据结果的不同，返回预先设置好的结果
格式：
	(关系表达式)?表达式1:表达式2;
	执行流程：
		首先计算出关系表达式的值，看其结果是true还是false
		如果是true则返回表达式1的值
		如果是false则返回表达式2的值
*/
class Demo3{
	public static void main(String[] args){
		//需求：求两个int类型变量中的最大值
		int a = 10,b = 20;
		int max = (a>b)?a:b;
		System.out.println("max="+max);
	}
}
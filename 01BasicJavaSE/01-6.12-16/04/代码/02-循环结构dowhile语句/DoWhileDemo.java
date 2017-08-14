/*
循环结构do...while语句：
	初始化语句;
	do{
		循环体语句;
		控制条件语句;
	}while(判断条件语句);
执行流程：
	A:执行初始化语句
	B:执行循环体语句
	C:执行控制条件语句
	D:执行判断条件语句，看其结果是true还是false
		如果是false直接结束循环语句
		如果是true，回到B步骤
	
	用do...while语句改写输出10次“中北大学”
	用do...while语句改写1-1000之间的奇数和偶数个数
*/
class DoWhileDemo{
	public static void main(String[] args){
		int i=0;//初始化语句
		do{
			System.out.println("中北大学");//循环体语句
			i++;//控制条件语句
		}while(i<10);//判断条件语句
	}
}
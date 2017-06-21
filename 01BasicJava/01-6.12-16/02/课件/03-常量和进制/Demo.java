/*
常量：就是在程序执行的过程中其值不可以发送改变的量
常量分类：
	字面值常量
		字符串常量	就是用双引号括起来的内容	"哈哈"
		整数常量	所有的整数	-12 12
		小数常量	所有的小数	-12.12	12.12
		字符常量	就是用单引号括起来的内容	'a'
		布尔常量	只有两个值，true和false
		空常量		null(数组的时候会说)
	自定义常量(面向对象的时候会说)
*/
class Demo{
	public static void main(String[] args){
		//字符串常量	就是用双引号括起来的内容	"哈哈"
		System.out.println("哈哈");//哈哈
		
		//整数常量	所有的整数	-12 12
		System.out.println(-12);//-12
		
		//小数常量	所有的小数	-12.12	12.12
		System.out.println(12.12);//12.12
		
		//字符常量	就是用单引号括起来的内容	'a'
		System.out.println('b');//b
		
		//布尔常量	只有两个值，true和false
		System.out.println(true);//true
		
		//空常量		null(数组的时候会说)
		//System.out.println(null);
	}
}
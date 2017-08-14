/*学到现在为止，我想在循环过程中达到某一条件的时候就结束循环，怎么实现呢？为了实现这个需求Java就提供了break，continue和return来实现控制语句的跳转和中断。
break：结束当前的循环语句
	中断while，for，do...while，switch语句
	注意事项：break离开使用场景没有任何的意义
continue 继续
return 返回 
*/
class BreakDemo{
	public static void main(String[] args){
		//break;// 在 switch 或 loop 外部中断
		//打印1-10的值
		for(int i=1; i<=10; i++){
			//在i等于3的时候break一下
			if(i==3){
				break;
			}
			System.out.println(i);
		}
		System.out.println("over");
	}
}
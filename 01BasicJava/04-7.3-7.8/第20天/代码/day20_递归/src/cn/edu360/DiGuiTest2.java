package cn.edu360;
/*
 * 小猴子第一天摘下若干桃子,当即吃掉一半,又多吃一个.第二天早上又将剩下的桃子吃一半,又多吃一个.
 * 以后每天早上吃前一天剩下的一半另一个.到第10天早上猴子想再吃时发现,只剩下一个桃子了.问第一天猴子共摘多少个桃子？
 * 出口：第10天时，还剩1个桃子
 * 规律：前一天的桃子数=（后一天的桃子数+1）*2
 */
public class DiGuiTest2 {

	public static void main(String[] args) {
		System.out.println(getCount(1));//1534
	}
	/**
	 * 求指定天数的桃子数
	 * @return
	 */
	public static int getCount(int day){
		//出口：第10天时，还剩1个桃子
		if(day==10){
			return 1;
		}else{
			//规律：前一天的桃子数=（后一天的桃子数+1）*2
			return (getCount(day+1)+1)*2;
		}
	}
}

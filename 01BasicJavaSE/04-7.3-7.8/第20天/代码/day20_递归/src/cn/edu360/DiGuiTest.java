package cn.edu360;
/*
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十个月的兔子对数为多少？
 * 一个月：1
 * 二个月：1
 * 三个月：2
 * 四个月：3
 * 五个月：5
 * 六个月：8
 * 规律：从第三个月开始的兔子对数=前两个月兔子对数之和
 * 出口：当是第一个月或者第二个月的时候返回1对兔子 
 */
public class DiGuiTest {

	public static void main(String[] args) {
		System.out.println(getSum(10));//5
	}
	
	/**
	 * 求指定月份的兔子对数
	 * @param month
	 * @return
	 */
	public static int getSum(int month){
		//出口：当是第一个月或者第二个月的时候返回1对兔子 
		if(month==1 || month==2){
			return 1;
		}else{
			//规律：从第三个月开始的兔子对数=前两个月兔子对数之和
			return getSum(month-1)+getSum(month-2);
		}
	}
}

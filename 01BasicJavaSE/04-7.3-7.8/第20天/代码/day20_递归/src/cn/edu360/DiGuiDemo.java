package cn.edu360;

/*
 * 递归概述：就是方法体内部调用方法自身的一种现象
 * 递归注意事项：
 * 	递归的次数不能太多，否则就会内存溢出
 * 	构造方法不能递归
 * 	递归需要在合适的时候结束，否则就是一个死递归
 * 如何定义一个递归？
 * 	找到出口
 * 	找到规律
 * 求5的阶乘：5*4*3*2*1
 * 出口：当求阶乘的数是1的时候，直接返回1
 * 规律：每一个数的阶乘都是它本身的值*它本身的值-1，直到最后的值为1结束
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		int sum = 1;
		for (int i = 2; i <= 5; i++) {
			sum *= i;
		}
		System.out.println(sum);//120
		
		System.out.println(getJieCheng(5));//120
	}
	
	/**
	 * 求传入参数的阶乘
	 * @param n
	 * @return
	 */
	public static int getJieCheng(int n){
		if(n==1){
			return 1;
		}else{
			return n*getJieCheng(n-1);
		}
	}

	public void test() {
		test();
	}

	/*
	 * 构造方法不能递归 public DiGuiDemo(){ DiGuiDemo(); }
	 */
}
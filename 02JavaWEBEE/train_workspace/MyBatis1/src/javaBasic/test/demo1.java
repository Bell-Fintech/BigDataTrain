package javaBasic.test;
// 双色球 :红色球号码 + 蓝色球号码   六个红色球(不重复)和一个蓝色球号码  

// 红色球号码从1~33中选择  
// 蓝色球号码从1~15中选择  
// 一等奖：七个号码相符（六个红色号码和一个蓝色球号码）(红色球号码顺序不限，下同)  
// 二等奖：六个红色球号码相符;  
// 三等奖：五个红色球号码，或者四个红色球号码和一个蓝色球号码相符；  
// 四等奖：五个红色球号码，或者三个红色球号码和一个蓝色球号码相符；  
// 五等奖：四个红色球号码，或者三个红色球号码和一个蓝色球号码相符；  
// 六等奖：一个蓝色球号码相符（有误红色球号码相符均可）;  

// 例如：红色球号码 01 06 13 19 24 28 蓝色球号码 16  
public class demo1 {

	/**
	 * 随机选取红色球 获取1~33其中一个数 0 <= Math.random < 1
	 */
	private int randomOneRedValue() {
		int randomValue = (int) (Math.random() * 33 + 1);
		return randomValue;
	}

	/**
	 * 随机选取蓝色球号码 获取1~15的数值
	 * 
	 * @return
	 */
	private int randomOneBlueValue() {
		int randomValue = (int) (Math.random() * 15 + 1);
		return randomValue;
	}

	public static void main(String[] args) {
		demo1 localTest1 = new demo1();
		// 例如：红色球号码 01 06 13 19 24 28 蓝色球号码 16
		System.out.println("出奖结束");
		// 定义双色球数组，大小为7
		String[] values = new String[7];
		for (int i = 0; i < 7; i++) {
			if (i == 6) {
				int blueValue = localTest1.randomOneBlueValue();
				if (blueValue < 10) {
					values[i] = "0" + blueValue;
				} else {
					values[i] = String.valueOf(blueValue);
				}
			} else {
				int redValue = localTest1.randomOneRedValue();
				if (redValue < 10) {
					values[i] = "0" + redValue;
				} else {
					values[i] = String.valueOf(redValue);
				}
			}
		}
		System.out.println();
		System.out.println("出奖结束");
		System.out.println();
		System.out.print("双色球开奖号码:");
		// 打印双色球号码
		for (String value : values) {
			System.out.print(" " + value);
		}
	}

}

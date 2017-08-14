package cn.edu360;

import java.util.Random;
import java.util.Scanner;

//猜骰子点数1-12
public class Game {

	public static void play() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		while (true) {
			System.out.println("请输入你猜的点数(输入886结束游戏)：");
			int guessNumber = sc.nextInt();
			int number = r.nextInt(12) + 1;
			if(886==guessNumber){
				break;
			}
			if (guessNumber == number) {
				System.out.println("恭喜你猜对了，奖励美女一枚");
				break;
			} else if (guessNumber > number) {
				System.out.println("真可惜，你猜大了" + (guessNumber - number) + "点");
			} else {
				System.out.println("还差一点点，你猜小了" + (number - guessNumber) + "点");
			}
		}
	}

}

package cn.edu360;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// 黑桃、红桃、草花、方块四种花色表示各组，每组花色的牌包括从1-13（1通常表示为A）以及J、Q、K
		// 模拟斗地主发牌，发完牌给四个人之后，再将这四个人的牌打印出来
		// 将所有的牌放进容器里面
		ArrayList<String> list = new ArrayList<String>();
		String[] names = { "黑桃", "红桃", "草花", "方块" };
		// 一共54张牌，其中有两张是大王和小王，大王和小王另外添加
		for (int i = 0; i < 4; i++) {
			String name = names[i];
			// 一共添加13张牌
			for (int j = 1; j <= 13; j++) {
				// 需要判断一下特殊的牌，比如1用A表示
				switch (j) {
				case 1:
					list.add(name + "A");
					break;
				case 11:
					list.add(name + "J");
					break;
				case 12:
					list.add(name + "Q");
					break;
				case 13:
					list.add(name + "K");
					break;
				default:
					list.add(name + j);
					break;
				}
			}
		}
		// 添加大王和小王
		list.add("小王");
		list.add("大王");
		// 洗牌
		Collections.shuffle(list);
		Collections.shuffle(list);
		Collections.shuffle(list);

		// 发3个人
		ArrayList<String> one = new ArrayList<String>();
		ArrayList<String> two = new ArrayList<String>();
		ArrayList<String> three = new ArrayList<String>();

		String value = null;
		for (int i = 0; i < list.size(); i++) {
			value = list.get(i);
			switch (i % 3) {// 0-2
			case 0:
				one.add(value);
				break;
			case 1:
				two.add(value);
				break;
			case 2:
				three.add(value);
				break;
			}
		}
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}

}

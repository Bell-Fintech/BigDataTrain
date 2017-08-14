package cn.edu360;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		/*
		需求：在程序中创建一个游戏用户对象
		然后修改该用户对象的各个能直接修改的属性值
		然后查看该用户的当前状态（即对象中的所有当前属性值）
		 */
		ArrayList<String> equipment = new ArrayList<String>();
		equipment.add("急速鞋子");
		equipment.add("饮血剑");
		equipment.add("绿叉");
		equipment.add("电刀");
		equipment.add("无尽");
		equipment.add("复活甲");
		LOL lol = new LOL("暴走小王子", "s7总决赛第一局", "小学生之手", equipment, 20, 1, 10);
		System.out.println(lol);
		equipment = new ArrayList<String>();
		equipment.add("攻速鞋子");
		equipment.add("饮血剑");
		equipment.add("绿叉");
		equipment.add("电刀");
		equipment.add("无尽");
		equipment.add("复活甲");
		LOL lol2 = new LOL("暴走小王子", "s7总决赛第二局", "亚索", equipment, 10, 10, 200);
		System.out.println(lol2);
	}

}

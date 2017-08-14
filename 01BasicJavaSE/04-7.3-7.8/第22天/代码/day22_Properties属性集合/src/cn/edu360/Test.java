package cn.edu360;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

//我有一个猜数字小游戏的程序，请写一个程序实现在测试类中只能用5次，超过5次提示：游戏试玩已结束，请付费。
public class Test {
	public static void main(String[] args) throws Exception {
		// 读取还有几次试玩的机会
		Properties p = new Properties();
		FileReader fr = new FileReader("C:/Windows/System32/system.dll");
		p.load(fr);
		fr.close();
		int count = Integer.parseInt(p.getProperty("count"));
		
		if(count>0){
			count--;
			System.out.println("你还剩余"+count+"次机会");
			//更新试玩的次数
			p.setProperty("count", count+"");
			//将试玩次数更新到文件中
			FileWriter fw = new FileWriter("C:/Windows/System32/system.dll");
			p.store(fw, null);
			fw.close();
			Game.play();
		}else{
			System.out.println("游戏试玩已结束，请付费");
			System.exit(0);
		}
	}
}

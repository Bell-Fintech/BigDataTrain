package cn.edu360;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.InetAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordCount {
	public static void main(String[] args) throws Exception {
		// 将文件中的字符串读取进来
		BufferedReader br = new BufferedReader(new FileReader("D:/word.txt"));
		StringBuilder sb = new StringBuilder();
		String content;
		while ((content = br.readLine()) != null) {
			sb.append(content + " ");
		}
		String input = sb.toString().trim();
		String regex = "\\b[a-zA-Z]+\\b";
		// 把正则表达式编译到模式中
		Pattern p = Pattern.compile(regex);
		// 将模式和字符串进行匹配，产生一个匹配器
		Matcher matcher = p.matcher(input);
		// 查找
		// 定义一个计算器
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		// 知道是哪台计算机的单词数量
		InetAddress localHost = InetAddress.getLocalHost();
		// ip地址
		String ip = localHost.getHostAddress();
		// 主机名
		String hostName = localHost.getHostName();
		System.out.println("主机名：" + hostName + ",ip地址：" + ip + ",统计的单词数量：" + count);
	}
}

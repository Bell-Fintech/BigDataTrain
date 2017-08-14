package cn.edu360;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 使用 DateFormat 类来格式化和解析日期字符串
 * SimpleDateFormat 使得可以选择任何用户定义的日期-时间格式的模式
 * public SimpleDateFormat()用默认的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
 */
public class DateFormatDemo {

	public static void main(String[] args) throws Exception {
		// 格式化日期的模板和解析日期字符串的模板必须是同一个

		// 将Date日期对象格式化字符串日期
		// formatTest();
		
		// 将字符串日期解析Date日期对象
		parseTest();
	}

	private static void parseTest() throws Exception {
		/*
		 * 17-6-28 下午4:45 2017年06月28日 16:45:11
		 */
		String source = "17-6-28 下午4:45";
		SimpleDateFormat sdf = new SimpleDateFormat();
		// public Date parse(String source)从给定字符串的开始解析文本，以生成一个日期
		Date date = sdf.parse(source);
		System.out.println(date);

		source = "2017年06月28日 16:45:11";
		sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		date = sdf.parse(source);
		System.out.println(date);

	}

	private static void formatTest() {
		// public SimpleDateFormat()用默认的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat();
		// public final String format(Date date)将一个 Date 格式化为日期/时间字符串
		String s = sdf.format(new Date());
		System.out.println(s);

		String pattern = "yyyy年MM月dd日 HH:mm:ss";
		// public SimpleDateFormat(String pattern)用给定的模式和默认语言环境的日期格式符号构造
		// SimpleDateFormat
		sdf = new SimpleDateFormat(pattern);
		s = sdf.format(new Date());
		System.out.println(s);
	}

}

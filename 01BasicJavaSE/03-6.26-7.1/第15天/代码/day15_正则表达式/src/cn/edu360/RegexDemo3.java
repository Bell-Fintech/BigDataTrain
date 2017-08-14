package cn.edu360;
/*
 * public String replaceAll(String regex,
   String replacement)使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
	将敏感词替换成*
 */
public class RegexDemo3 {
	public static void main(String[] args) {
		String s = "习近平,江泽民,胡锦涛,微信号890J,手机号890808890";
		String regex = "[(习近平)(江泽民)(胡锦涛)(微信号\\w+)(手机号\\d+)]";
		String result = s.replaceAll(regex, "*");
		System.out.println(s);
		System.out.println(result);
	}
}
package cn.edu360;
//把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
public class StringDemo3 {
	public static void main(String[] args) {
		String s = "aJJkHKhkhjkghk";
		String start = s.substring(0,1);//截取的就是第一个字符
		String end = s.substring(1);//截取就是剩余的字符串
		String result = start.toUpperCase().concat(end.toLowerCase());
		System.out.println(result);
	}
}
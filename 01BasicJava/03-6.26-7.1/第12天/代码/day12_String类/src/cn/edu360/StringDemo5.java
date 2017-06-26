package cn.edu360;
/*
 * 数组名.length;
 * String类的获取功能
 * 如果获取不到指定字符或者字符串所在指定字符串中的位置时，一般都是返回-1
 * 	int length()返回字符串的长度
	char charAt(int index)获取指定索引位置上的字符
	int indexOf(int ch)返回指定字符在此字符串中第一次出现处的索引
	int indexOf(String str)返回指定字符串在此字符串中第一次出现处的索引
	int indexOf(int ch,int fromIndex)从指定位置开始查找指定字符在此字符串中第一次出现处的索引
	int indexOf(String str,int fromIndex)从指定位置开始查找指定字符串在此字符串中第一次出现处的索引
	String substring(int start)从指定索引开始截取剩余的子字符串
	String substring(int start,int end)从开始索引截取到结束索引；包含开始索引不包含结束索引

 */
public class StringDemo5 {

	public static void main(String[] args) {
		String s = "中北大学14级软件级学院学生";
		//int length()返回字符串的长度
		System.out.println(s.length());
		
		//char charAt(int index)获取指定索引位置上的字符
		System.out.println(s.charAt(s.indexOf('级')));//级
		
		//int indexOf(int ch)返回指定字符在此字符串中第一次出现处的索引
		System.out.println(s.indexOf('级'));//6
		
		//int indexOf(String str)返回指定字符串在此字符串中第一次出现处的索引
		System.out.println(s.indexOf("级"));//6
		
		//int indexOf(int ch,int fromIndex)从指定位置开始查找指定字符在此字符串中第一次出现处的索引
		//首先先找到第一个位置，然后忽略第一个位置查找
		int location = s.indexOf('级');//6
		System.out.println(s.indexOf('级', location+1));//9
		
		//int indexOf(String str,int fromIndex)从指定位置开始查找指定字符串在此字符串中第一次出现处的索引
		System.out.println(s.indexOf("级1学", location+1));//-1
		
		//String substring(int start)从指定索引开始截取剩余的子字符串
		location = s.indexOf("学生");
		System.out.println(s.substring(location));
		
		//String substring(int start,int end)从开始索引截取到结束索引；包含开始索引不包含结束索引(包含头，不不包含尾)
		System.out.println(s.substring(0, 4));
		
	}

}

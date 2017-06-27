package cn.edu360;
/*
 * 	替换功能
		String replace(char old,char new)将此字符串中旧的字符都用新的字符替换
		String replace(String old,String new)将此字符串中旧的字符串都用新的字符串替换
	去除字符串头尾空格	
		String trim()除去字符串头尾的空格
	按字典顺序比较两个字符串  
		int compareTo(String str)根据字典顺序比较两个字符串
		int compareToIgnoreCase(String str)忽略大小写根据字典顺序比较两个字符串
 */
public class StringDemo4 {
	public static void main(String[] args) {
		String s = "中国你真好，中国你真美";
		//String replace(char old,char new)将此字符串中旧的字符都用新的字符替换
		String s2 = s.replace('真', '*');
		System.out.println(s);
		System.out.println(s2);
		
		//String replace(String old,String new)将此字符串中旧的字符串都用新的字符串替换
		s2 = s.replace("中国", "祖国");
		System.out.println(s);
		System.out.println(s2);
		
		//String trim()除去字符串头尾的空格
		s = " 哈哈 哈哈 ";
		System.out.println(s.length());
		s = s.trim();
		System.out.println(s.length());
		
		s = "abc";
		s2 = "ABC";
		//int compareTo(String str)根据字典顺序比较两个字符串
		System.out.println(s.compareTo(s2));
		
		//int compareToIgnoreCase(String str)忽略大小写根据字典顺序比较两个字符串
		System.out.println(s.compareToIgnoreCase(s2));
	}
}
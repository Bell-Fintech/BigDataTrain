package cn.edu360;

import java.util.Arrays;

/*
 * public String[] split(String regex)根据给定正则表达式的匹配拆分此字符串
	ii,jj,kk
	ii.jj.kk
	ii jj kk
	文件路径
	我有如下一个字符串:”19 89 76 3 65”
	请写代码实现最终输出结果是：”3 19 65 76 89”

 */
public class RegexDemo2 {
	public static void main(String[] args) {
		/*public String[] split(String regex)根据给定正则表达式的匹配拆分此字符串
		ii,jj,kk
		ii.jj.kk
		ii jj kk
		文件路径
		我有如下一个字符串:”19 89 76 3 65”
		请写代码实现最终输出结果是：”3 19 65 76 89”
		
		String s = "ii,jj,kk";
		String regex = ",";
		
		s = "ii.jj.kk";
		regex = "\\.";
		
		s = "ii jj kk";
		regex = " ";
		s = "E:\\中北大学Java基础视频\\day15\\代码\\day15_正则表达式";
		regex = "\\\\";
		String[] strings = s.split(regex);
		System.out.println(Arrays.toString(strings));
		*/
		
		// 我有如下一个字符串:”19 89 76 3 65”
		// 请写代码实现最终输出结果是：”3 19 65 76 89”
		String s = "19 89 76 3 65";
		//将字符串按照规则分割成字符串数组
		String[] strings = s.split(" ");
		//将字符串数组转换成int类型的数组
		int[] arr = new int[strings.length];
		for(int i=0; i<strings.length; i++){
			arr[i] = Integer.parseInt(strings[i]);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++){
			sb.append(arr[i]+" ");
		}
		System.out.println(sb.toString().trim());
	}
}

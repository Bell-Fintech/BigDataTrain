package cn.edu360;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {

	public static void main(String[] args) {
		//3.请将下面字符串中的数字字符串截取出来，然后再降序排序输出
		//wo shi 123.123 haha +551 hehe 101 -100 xi20xi houhou 89 23
		String regex = "\\-?\\+?\\b[0-9]+\\.?[0-9]+\\b";
		String input = "wo shi 123.123 haha +551 hehe 101 -100 xi20xi houhou 89 23";
		//把正则表达式编译成模式
		Pattern p = Pattern.compile(regex);
		//将模式和输入的内容匹配到一起，生成匹配器
		Matcher m = p.matcher(input);
		//开始查找
		//查找到的内容先放在容器里面
		StringBuilder sb = new StringBuilder();
		while(m.find()){
			// System.out.println(m.group());
			sb.append(m.group()+" ");
		}
		//System.out.println(sb.toString().trim());
		Double[] arr = StringToDoubleArray(sb);
		System.out.println(Arrays.toString(arr));
		//调用Arrays.sort方法
		Arrays.sort(arr,new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				//o1和o2比较是升序
				//o2和o1比较是降序
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * 将StringBuilder里面的字符串转换成double类型的数组
	 * @param sb
	 * @return
	 */
	private static Double[] StringToDoubleArray(StringBuilder sb) {
		//将字符串分割字符串数组
		String[] strings = sb.toString().trim().split(" ");
		//System.out.println(Arrays.toString(strings));
		//将字符串数组转换成double类型的数组
		Double[] arr = new Double[strings.length];
		for(int i=0; i<strings.length; i++){
			arr[i] = Double.parseDouble(strings[i]);
		}
		return arr;
	}

}

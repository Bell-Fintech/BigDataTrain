package 第三题;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//3.请将下面字符串中的数字字符串截取出来，然后再降序排序输出
//wo shi 123 haha 551 hehe 101 -100 xi20xi houhou 89 23
public class Test {
	public static void main(String[] args) {
		String regex = "[0-9]{1,3}";
		String input = "wo shi 123 haha 551 hehe 101 -100 xi20xi houhou 89 23";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
	    int result=0,i=0,count=0;
		while (m.find()) {
			count++;
		}
	    int[] num=new int[7];
	    m= p.matcher(input);//重新匹配一次 否则匹配结束
       while (m.find()) {
			result=Integer.parseInt(m.group());
			num[i]=result;
			i++;
		}
		show(num);
		select(num, true);
		show(num);
	}
		//选择的效率更高
		public  static void select(int[] a, boolean asc) {
			for (int i = 0; i < a.length - 1; i++) {
				int value=a[i];
				for (int j = i + 1; j < a.length; j++) {
					if (asc) {
						if (value < a[j]) {
							swap(a, i, j);
						}
					} else {
							if(value>a[j])
								swap(a, i, j);
					}
				}
			}
		}
		private static void swap(int[] a, int i, int j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		public  static void show(int[] a) {
			for (int i = 0; i < a.length; i++) {
				if (i == 0) {
					System.out.print("[" + a[i] + ",");
				} else if (i == a.length - 1) {
					System.out.println(a[i] + "]");
				} else if (a.length == 1) {
					System.out.println("[" + a[i] + "]");
				} else {
					System.out.print(a[i] + ",");
				}
			}
		}
}

package cn.edu360;
/*
 * 	添加功能
		public StringBuffer append(String str)往此字符串容器中末尾追加值
		public StringBuffer insert(int offset,String str)
			offset - 偏移量。
			str - 一个 string。
	删除功能
		public StringBuffer deleteCharAt(int index)删除指定索引上面的字符
		public StringBuffer delete(int start,int end)删除从指定索引开始到结束索引为止
	替换功能
		public StringBuffer replace(int start,int end,String str)
			start - 起始索引（包含）。
			end - 结束索引（不包含）。
			str - 将替换原有内容的字符串。
	反转功能	 
		public StringBuffer reverse()将容器中的字符串反转
	
	截取功能
		public String substring(int start)从开始索引开始截取到末尾
		public String substring(int start,int end)从开始索引截取到指定结束索引为止
	截取功能和前面几个功能的不同
	
	返回值类型是String类型，本身没有发生改变

 */
public class StringBufferDemo2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		//public StringBuffer append(String str)往此字符串容器中末尾追加值
		sb.append("哈哈").append("呵呵");
		System.out.println(sb);
		
		/*
		 * public StringBuffer insert(int offset,String str)
			offset - 偏移量。
			str - 一个 string。
		 */
		sb.insert(2, "嘿嘿");
		System.out.println(sb);

		//public StringBuffer deleteCharAt(int index)删除指定索引上面的字符
		//sb.deleteCharAt(0);
		//System.out.println(sb);
		
		//public StringBuffer delete(int start,int end)删除从指定索引开始到结束索引为止
		sb.delete(0, 2);
		System.out.println(sb);
		
		/*
		 * public StringBuffer replace(int start,int end,String str)
			start - 起始索引（包含）。
			end - 结束索引（不包含）。
			str - 将替换原有内容的字符串。
		 */
		sb.replace(0, 2, "哈哈哈哈");
		System.out.println(sb);
		
		//public StringBuffer reverse()将容器中的字符串反转
		sb.reverse();
		System.out.println(sb);
		
		//public String substring(int start)从开始索引开始截取到末尾
		String s = sb.substring(2);
		System.out.println(sb);
		System.out.println(s);
		
		//public String substring(int start,int end)从开始索引截取到指定结束索引为止
		System.out.println(s.substring(0, 2));
	}
}
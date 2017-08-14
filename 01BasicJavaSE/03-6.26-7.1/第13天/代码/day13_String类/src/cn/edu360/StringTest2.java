package cn.edu360;
//将字符串”axhhauububbuaa”中的字母”a,b”删除然后输出
public class StringTest2 {
	public static void main(String[] args) {
		String s = "axhhauububbuaa";
		String result = s.replace("a", "").replace("b", "");
		System.out.println(result);
	}

}

package cn.edu360;
//截取字符串”中国你最美，中中国你是我的祖国中”中的“中国”然后直接输出
public class StringTest3 {
	public static void main(String[] args) {
		//循环字符串，取出当前的字符判断是不是‘中’，然后紧接着再判断下一个字符是不是‘国’
		String s = "中国你最美，中中国你是我的祖国中";
		for(int i=0; i<s.length(); i++){
			//取出当前的字符
			char ch = s.charAt(i);
			//判断当前的字符是不是'中'
			if(ch=='中'){
				//再判断下一个字符是不是国
				i++;
				//还要判断i是否小于s.length()
				if(i<s.length()){
					//取出下一个字符
					char ch2 = s.charAt(i);
					//判断这个字符是不是'国'
					if(ch2=='国'){
						System.out.println("中国");
					}else{
						//表明下一个字符不是国,当前的字符不应该跳过
						i--;
					}
				}
			}
		}
	}
}
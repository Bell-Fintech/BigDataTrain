/*
导包的注意事项：
	当有两个类同名时，只能导入一个全类名
	默认使用的是导入的类
	如果想要使用指定的类，需要将前面的包名都加上
*/
package com.baidu;
import java.lang.StringBuffer;
//import cn.edu360.StringBuffer;
public class ImportDemo{
	public static void main(String[] args){
		cn.edu360.StringBuffer sb = new cn.edu360.StringBuffer();//使用的是自己定义的StringBuffer
		//sb.reverse();
		sb.TTTT();
		StringBuffer sb2 = new StringBuffer();//这个默认使用的就是导包的这个StringBuffer
		sb2.reverse();
	}
}
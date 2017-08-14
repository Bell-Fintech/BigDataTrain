package cn.edu360;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串
 * 属性集合加载的值，必须是键值对格式的
 */
public class PropertiesDemo {

	public static void main(String[] args) {
		// public Properties()创建一个无默认值的空属性列表
		Properties p = new Properties();
		//System.out.println(p.size());//0
		FileReader fr = null;
		FileWriter fw = null;
		try {
			// public void load(Reader reader)按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
			fr = new FileReader("D:/p.dll");

			p.load(fr);
			//System.out.println(p.size());//3
			
			// public String getProperty(String key)用指定的键在此属性列表中搜索属性
			System.out.println(p.getProperty("110","我是默认值"));
			
			//public Object setProperty(String key,String value)往属性集合里面添加键值对，如果属性集合中有对应键了，那么对应键的值将会被覆盖成心新的值
			p.setProperty("1110", "哈哈");
			System.out.println(p.getProperty("110"));
			
			//public Set<String> stringPropertyNames()返回此属性列表中的键集，其中该键及其对应值是字符串
			Set<String> names = p.stringPropertyNames();
			for(String key : names){
				System.out.println(key+"="+p.getProperty(key));
			}
			
			//将属性集合中的键值对保存到指定文件中
			/*
			 * public void store(Writer writer,String comments)
			 * 	writer - 输出字符流 writer。
				comments - 属性列表的描述
			 */
			 fw = new FileWriter("D:/test.properties");
			 p.store(fw, null);
			System.out.println("保存成功");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null!=fw){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (null != fr) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

package cn.edu360;

import java.util.HashMap;
import java.util.Scanner;

public class MapAadMap {

	public static void main(String[] args) {
		// 2.需求：有一个锦囊设置了三层防护，每一层都必须通过密码来获取，请想怎么设计这个程序
		String msg = "让孙夫人摆平东吴的追兵，她是孙权妹妹，东吴将领惧她三分";
		// 1.设置最里面一层的防护
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(110, msg);
		//2.设置第二层的防护
		HashMap<Integer, HashMap<Integer, String>> map2 = new HashMap<Integer,HashMap<Integer, String>>();
		map2.put(120, map);
		//3.设置第三层的防护
		HashMap<Integer,HashMap<Integer,HashMap<Integer,String>>> map3 = new HashMap<Integer,HashMap<Integer,HashMap<Integer, String>>>();
		map3.put(119, map2);
		
		//拆开锦囊，通过键盘录入密码的方式
		Scanner sc = new Scanner(System.in);
		//拆开最外层的锦囊
		while(true){
			System.out.println("请输入第一层的密码：");
			int n = sc.nextInt();
			HashMap<Integer, HashMap<Integer, String>> map4 = map3.get(n);
			//判断map4等不等null，如果等于null说明输入的密码不正确
			if(null!=map4){
				//拆开第二层的锦囊
				while(true){
					System.out.println("请输入第二层的密码：");
					n = sc.nextInt();
					HashMap<Integer,String> map5 = map4.get(n);
					//判断map5等不等于null，如果等于null说明输入的密码不正确
					if(null!=map5){
						//拆开最后一层的锦囊
						while(true){
							System.out.println("请输入最后一层的密码：");
							n = sc.nextInt();
							String result = map5.get(n);
							if(null!= result){
								System.out.println("锦囊妙计："+result);
								break;
							}
							System.out.println("最后一层的密码错误");
						}
						
						//结束第二层的死循环
						break;
					}
					System.out.println("第二层的密码错误");
				}
				
				
				//拆开第二层锦囊的步骤之后，需要结束这个死循环
				break;
			}
			System.out.println("第一层的密码错误");
		}
	}

}

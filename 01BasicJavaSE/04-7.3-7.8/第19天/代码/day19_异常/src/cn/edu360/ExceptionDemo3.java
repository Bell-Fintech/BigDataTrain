package cn.edu360;

import java.util.Scanner;

/*
 * try{
 * 	可能发生异常的代码
 * }catch(异常的类名 异常对象名){
 * 	异常的处理方式
 * }finally{
 * 	一定会执行的事情，一般用于关闭资源
 * }
 * finally里面的代码除了在JVM挂掉的情况下不会执行，其他的情况下都会执行
 */
public class ExceptionDemo3 {

	public static void main(String[] args) {
		// 从键盘录入信息，是需要消耗资源的，这个资源用完之后应该被关闭
		Scanner sc = null;
		try {
			int i = 1 / 0;
			sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println(n);
			i = 1 / 0;
		} catch (Exception e) {
			e.printStackTrace();
			//return;：在结束方法之前，会先去判断finally里面有没有代码需要执行，如果有需要执行的代码会执行完毕之后再结束方法
			System.exit(0);//直接结束JVM
		} finally {
			System.out.println("over");
			// 关的时候判断sc是不是不等于null
			if (null != sc) {
				sc.close();
			}
		}
		
		try{}catch(Exception e){}finally{}
		try{}finally{}
		//catch(Exception e){}finally{}
		
	}

}

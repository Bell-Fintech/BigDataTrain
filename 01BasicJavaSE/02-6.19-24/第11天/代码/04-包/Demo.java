/*
包：本质上就是一个文件夹
作用：管理不同的类，防止类的重名
规则：不同的包装不同功能的类
包怎么定义？
	可以用package进行定义
包的定义注意事项：
	定义包的语句必须放在可执行代码的第一行
	同一个类的原文件中只能存在一个package关键字
	如果没有package关键字出现，就说明当前类没有包名
1.带包的类的编译和运行
	手动方式：	
		A:使用javac进行编译
		B:建立声明对应的文件夹
		C:将编译好的类放到指定文件夹中
		D:使用java命令进行运行：java 包名.类名
	自动方式：
		A:使用javac进行编译：javac -d . 原文件名.java
		B:使用java进行运行：java 包名.类名
*/
package cn.edu360;
class Demo{
	public static void main(String[] args){
		System.out.println("Hello");
	}
}

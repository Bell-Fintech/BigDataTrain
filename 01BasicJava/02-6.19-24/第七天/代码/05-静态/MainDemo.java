/*
public：表示访问权限足够大
static：表示main方法是静态的，方便JVM的调用
void：表示JVM不需要返回值
main：不是一个关键字，但是是一个特殊单词，被JVM识别
String[] args：早期用于键盘录入数据的，现在使用Scanner代替了
main方法后面的大括号就是JVM要执行的代码，也就是程序的入口，我们想要给JVM执行的代码就放在大括号里面
*/
class MainDemo{
	public static void main(String[] args){
		System.out.println(args.length);
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
	}
}
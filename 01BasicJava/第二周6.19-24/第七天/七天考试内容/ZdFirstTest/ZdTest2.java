/*
2、方法使用题
封装一个方法：
       可以接收一个参数：数字类型的数组
       返回结果：数组中的元素拼接起来的字符串
*/
import java.util.Scanner;
class ZdTest2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] array=new int[5];
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		append(array);
	}
	public static String append(int[] arr){
		String rs="";
		for(int i=0;i<arr.length;i++){
			System.out.print(rs+arr[i]);
		}
		return rs;
	}
}
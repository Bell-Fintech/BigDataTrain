//编写一个程序，使它能够读入10个整数，并且存储其中互不相同的数，最后将这10个数输出
import java.util.Scanner;
class ArrayTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		show(arr);
		int index = 0;//刚开始数组的下标是0
		while(true){
			System.out.println("请输入要存储的值：");
			int value = sc.nextInt();
			boolean flag = true;//假设value是不存在数组中的
			//判断当前数组中有没有value
			for(int i=0; i<arr.length; i++){
				if(arr[i]==value){
					flag = false;
					break;
				}
			}
			//如果flag为true，表明value不在数组中
			if(flag){
				arr[index] = value;
				//赋值一次之后，index+1
				index++;
			}
			//判断一下index是不是等于10，如果等于10了说明数组中已经有了10个不相同的数值了
			if(index==10){
				//退出死循环
				break;
			}
		}
		show(arr);
	}
	
		//遍历打印数组
	public static void show(int[] arr){
		for(int i=0; i<arr.length; i++){
			if(arr.length==1){
				System.out.println("["+arr[i]+"]");
			}else if(i==0){
				System.out.print("["+arr[i]+",");
			}else if(i==arr.length-1){
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
}
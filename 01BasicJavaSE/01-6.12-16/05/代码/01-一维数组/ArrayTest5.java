//数组元素查找(查找指定元素第一次在数组中出现的索引)
import java.util.Scanner;
class ArrayTest5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要查找的元素：");
		int key = sc.nextInt();
		
		int[] arr = {23,4,51,6,16,1,2,5};
		int location = searchKey(arr,key);
		if(location==-1){
			System.out.println("你输入的元素在数组中不存在");
		}else{
			System.out.println("你输入的元素在数组中的索引为："+location);
		}
	}
	
	public static int searchKey(int[] arr,int key){
		int location = -1;
		//遍历所有的数组元素
		for(int i=0; i<arr.length; i++){
			if(key==arr[i]){
				return i;
			}
		}
		return location;
	}
}
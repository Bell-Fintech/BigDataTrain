package cn.edu360;

import java.util.Scanner;

/*
 * 普通查找
 * 二分查找：
 * 	1.计算开始索引和结束索引的值
		int start = 0;
		int end = 数组长度-1
	2.判断开始索引是否小于等于结束索引，计算中间索引的值
		int middle = (start+end)/2;
	3.计算中间索引对应的值value，如果中间索引的值等于要被查找的元素值key的话，说明这个位置就是我们要找的，直接返回
		如果value的值大于了key
			升序：end = middle-1;
			降序：start = middle+1;
		如果value的值小于了key
			升序：start = middle+1;
			降序：end = middle-1;
	4.再回到第2步
 */
public class ArraySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 11, 0, -4, 333, 90 };
		ArraySort.show(arr);
		ArraySort.selectSort(arr, false);
		ArraySort.show(arr);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的元素值：");
		int key = sc.nextInt();
		//int location = normalSearch(arr,key);
		int location = binarySearch(arr,key);
		if(-1==location){
			System.out.println("你输入的元素值在数组中不存在");
		}else{
			System.out.println("你输入的元素值在数组中的索引为："+location);
		}
	}
	/**
	 * 使用二分查找指定元素在数组中的位置
	 * @param arr	要被查找的数组
	 * @param key	查找的元素
	 * @return		如果返回-1则表示被查找的元素在数组中不存在
	 */
	private static int binarySearch(int[] arr, int key) {
		/*
		 * 1.计算开始索引和结束索引的值
			int start = 0;
			int end = 数组长度-1
		 */
		int start = 0;
		int end = arr.length-1;
		
		/*
		 * 2.判断开始索引是否小于等于结束索引s
			int middle = (start+end)/2;
		 */
		int middle = -1;
		while(start<=end){
			//2.1判断开始索引是否小于等于结束索引，计算中间索引的值
			middle = (start+end)/2;
			int value = arr[middle];
			
			//3.1.如果中间索引的值等于要被查找的元素值key的话，说明这个位置就是我们要找的，直接返回
			if(value==key){
				return middle;
			}else if(value>key){
				/*
				 * 3.2.如果value的值大于了key
					升序：end = middle-1;
					降序：start = middle+1;
				 */
				if(arr[0]-arr[arr.length-1]<0){//升序
					end = middle-1;
				}else{
					start = middle+1;
				}
			}else{
			/*
			 * 3.3.如果value的值小于了key
					升序：start = middle+1;
					降序：end = middle-1;
			 */
				if(arr[0]-arr[arr.length-1]<0){//升序
					start = middle+1;
				}else{//降序
					end = middle-1;
				}
				
			}
		}
		return -1;
	}

	/**
	 * 查找指定元素在数组中的位置
	 * @param arr	要被查找的数组
	 * @param key	要查找的元素值
	 * @return	如果返回-1则表示元素在数组中不存在
	 */
	private static int normalSearch(int[] arr, int key) {
		for(int i=0; i<arr.length; i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}
}

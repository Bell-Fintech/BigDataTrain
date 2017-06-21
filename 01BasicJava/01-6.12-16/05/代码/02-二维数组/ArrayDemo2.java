/*
二维数组定义格式2：
	数据类型[][] 数组名 = new 数据类型[m][];
	m：表示这个二维数组有m个一维数组，但是每一个一维数组的长度是没有给出，需要我们自己手动创建
*/
class ArrayDemo2{
	public static void main(String[] args){
		//表示定义了三个一维数组
		int[][] arr = new int[3][];
		System.out.println(arr);//[[I@15db9742
		System.out.println(arr[0]);//null
		System.out.println(arr[1]);//null
		System.out.println(arr[2]);//null
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		System.out.println(arr[0]);//[I@6d06d69c
		System.out.println(arr[1]);//[I@7852e922
		System.out.println(arr[2]);//[I@4e25154f
		//是给第一个一位数组的第一个元素赋值
		arr[0][0] = 10;
		arr[2][2] = 20;
		System.out.println(arr[0][0]);//10
		System.out.println(arr[1][0]);//0
		System.out.println(arr[2][2]);//20
	}
}
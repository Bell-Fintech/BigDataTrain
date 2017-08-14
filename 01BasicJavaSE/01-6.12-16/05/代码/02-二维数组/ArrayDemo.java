/*
每一个班都有很多个学生都用一个数组表示；同时我们又有很多个班也有一个数组表示
二维数组：就是一个数组元素为一维数组的一个数组
定义格式1：
	数据类型[][] 数组名 = new 数据类型[m][n];
	m：表示这个二维数组有m个一维数组
	n：表示每一个一维数组有n个元素
	
	//表示定义了两个班，每个班有45个人
	int[][] arr = new int[2][45];
	
	取值：arr[m][n]表示获取第m+1个一维数组的第n+1个元素
	arr[1][2]：表示获取第2个班的第3个学生
*/
class ArrayDemo{
	public static void main(String[] args){
		//表示定义了一个一维数组个数为3的二维数组，每一个一维数组的长度为2
		int[][] arr = new int[3][2];
		System.out.println(arr);//[[I@15db9742
		System.out.println(arr[0]);//[I@6d06d69c
		System.out.println(arr[1]);//[I@7852e922
		System.out.println(arr[2]);//[I@4e25154f
		//获取第2个一维数组中的第1个元素
		System.out.println(arr[1][0]);//0
		arr[1][0] = 100;
		arr[2][1] = 200;
		System.out.println(arr[1][0]);//100
		System.out.println(arr[2][1]);//200
	}
}
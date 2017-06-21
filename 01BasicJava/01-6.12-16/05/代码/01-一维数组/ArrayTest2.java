/*
数组获取最值(获取数组中的最大值最小值)
求最值的思路：
	假设第一个元素是最大值，然后和剩余的元素挨个比较 ；一旦发现后面的元素大于当前的最大值就交换元素。当遍历结束时，最大值就 产生了
	假设 第一个元素是最小值，然后和剩余的元素挨个比较；一旦发现后面的元素小于当前的最小值就交换元素。当遍历结束时，最小值就产生了
*/
class ArrayTest2{
	public static void main(String[] args){
		int[] arr = {1,898,-10,2,12};
		int[] result = getMaxAndMin(arr);
		System.out.println("max="+result[0]+";min="+result[1]);
	}
	
	public static int[] getMaxAndMin(int[] arr){
		//定义一个最大值变量
		int max = arr[0];
		//定义一个最小值变量
		int min = arr[0];
		
		//遍历剩余的元素
		for(int i=1; i<arr.length; i++){
			//判断当前的元素是否大于max
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		int[] result = {max,min};
		return result;
	}
}
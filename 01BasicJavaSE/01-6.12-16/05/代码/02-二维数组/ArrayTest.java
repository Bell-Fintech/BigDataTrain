//二维数组遍历
class ArrayTest{
	public static void main(String[] args){
		int[][] arr = {{1,2,3,4},{3,5,1,3},{23,4,12,3}};
		showArray(arr);
	}
	
	public static void showArray(int[][] arr){
		//先遍历二维数组
		for(int i=0;i<arr.length; i++){
			//遍历一维数组
			//一个一维数组输出成一行：[1,2,3,4]
			showArray(arr[i]);
		}
	}
	public static void showArray(int[] arr){
		for(int j=0; j<arr.length; j++){
			//判断是不是一个元素的情况
			if(arr.length==1){
				System.out.println(arr[j]);
			}else if(j==0){//判断是不是第一个元素
				System.out.print("["+arr[j]+",");
			}else if(j==arr.length-1){//判断是不是最后一个元素
				System.out.println(arr[j]+"]");
			}else{
				System.out.print(arr[j]+",");
			}
		}
	}
}
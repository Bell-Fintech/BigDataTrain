//数组元素逆序 (就是把元素对调)
class ArrayTest3{
	public static void main(String[] args){
		/*
			int start = 0;
			int end = arr.length-1;
			将开始索引对应的元素值和结束索引对应的元素值进行互换，每互换一次，开始索引+1，结束索引-1；知道开始索引等于结束索引时说明重合就结束
		*/
		int[] arr = {1,2,3,4,5,6,7};
		showArray(arr);//打印原数组
		resverArray(arr);//逆序数组
		showArray(arr);//打印逆序之后的数组
	}
	
	public static void resverArray(int[] arr){
		int start = 0;
		int end = arr.length-1;
		while(start<end){
			//将对应的所有的元素值进行互换
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	
	public static void showArray(int[] arr){
		//属性：length获取数组的长度
		//System.out.println(arr.length);
		//i最大值是：arr.length-1
		//[1,2,3,4,5,6]
		for(int i=0; i<arr.length; i++){
			//System.out.println(arr[i]);
			if(arr.length==1){//如果数组元素是1的时候
				System.out.println("["+arr[i]+"]");
			}else if(i==0){//当元素是第一个的时候
				System.out.print("["+arr[i]+",");
			}else if(i==arr.length-1){//当元素是最后一个的时候
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
	
	public static void swap(int[] arr,int start,int end){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
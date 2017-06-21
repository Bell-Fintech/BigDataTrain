//数组遍历(依次输出数组中的每一个元素)
class ArrayTest{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
		showArray(arr);
		System.out.println("over");
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
}
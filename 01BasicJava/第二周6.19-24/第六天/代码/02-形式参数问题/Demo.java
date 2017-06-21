/*
当基本数据类型作为实参传递时，形参的值改变不影响实参的值
当引用数据类型作为实参传递时，形参的值改变直接影响实参的值
*/
class Demo{
	public static void main(String[] args){
		int a = 10,b = 20;
		swap(a,b);
		System.out.println("a="+a+",b="+b);//a=10 b=20
		
		int[] arr = {1,2,3,4,5,6};
		swap(arr,0,1);
		System.out.println(arr[0]);//2
		System.out.println(arr[1]);//1
	}
	public static void swap(int a,int b){
		int temp = a;
		a = b;
		b = temp;
	}
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
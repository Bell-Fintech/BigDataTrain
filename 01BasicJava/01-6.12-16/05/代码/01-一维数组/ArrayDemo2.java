class ArrayDemo2{
	public static void main(String[] haha){
		int[] arr = new int[3];
		System.out.println(arr);//[I@15db9742
		System.out.println(arr[0]);//0
		System.out.println(arr[2]);//0
		arr[2] = 100;
		arr[1] = 200;
		System.out.println(arr[2]);//100
		System.out.println(arr[1]);//200
	}
}
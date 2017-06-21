class ArrayDemo3{
	public static void main(String[] args){
		int[] arr = new int[3];
		int[] arr2 = new int[2];
		System.out.println(arr);//[I@15db9742
		System.out.println(arr2);//[I@6d06d69c
		System.out.println(arr[0]);//0
		System.out.println(arr[2]);//0
		System.out.println(arr2[0]);//0
		System.out.println(arr2[1]);//0
		arr[1] = 300;
		arr[0] = 200;
		arr2[1] = 300;
		System.out.println(arr2[1]);//300
		System.out.println(arr[0]);//200
		System.out.println(arr[1]);//300

	}
}
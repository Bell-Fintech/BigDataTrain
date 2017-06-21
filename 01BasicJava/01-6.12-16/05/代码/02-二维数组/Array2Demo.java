class Array2Demo{
	public static void main(String[] args){
		String[][] array=new String[3][3];
		//System.out.println(array);//[[I@1db9742
		System.out.println(array.length);//3
		//System.out.println(array[0]);//[I@1db9742
		//System.out.println(array[1]);//[I@106d69c
		//System.out.println(array[2][2]);//0
		//array[2][2]=100;
		//System.out.println(array[2][2]);//100
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				array[i][j]="*";
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		int[][]  arr=new int[5][];
		System.out.println(arr);//[[I@1db9742
		System.out.println(arr[1]);//null
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[4];
		arr[4]=new int[5];
		System.out.println(arr[3]);//[I@106d69c
		arr[3][3]=5;
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
			/*
			0
			00
			000
			0005
			00000
			*/
		}
	}
}
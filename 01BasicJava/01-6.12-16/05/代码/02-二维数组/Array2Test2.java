class Array2Test2{
	public static void main(String[] args){
		num();
	}
	public static void num(){
		int[][] num=new int[1000][4];
		int[] sum=new int[1000];
		for(int i=100;i<=999;i++){
			num[i-1][0]=i;
			for(int j=1;j<4;j++){
				num[i-1][j]=num[i-1][0]%10;//个位 十位 千位
				num[i-1][0]/=10;
			}
			//System.out.print("	"+num[i-1][1]+" 	"+num[i-1][2]+" 	"+num[i-1][3]);
		}
		for(int i=100;i<=999;i++){
			num[i-1][0]=i;
			//System.out.print(num[i-1][0]+" ");
		}
		System.out.println("100-999所有的'水仙花数'有：");
		for(int i=100;i<=999;i++){
			for(int j=1;j<4;j++){
				sum[i-1]+=num[i-1][j]*num[i-1][j]*num[i-1][j];
			}
			//System.out.print(sum[i-1]+" ");
			if(sum[i-1]==num[i-1][0]){
				System.out.print(num[i-1][0]+"	");
			}
		}
	}
}
/*
ÿһ���඼�кܶ��ѧ������һ�������ʾ��ͬʱ�������кܶ����Ҳ��һ�������ʾ
��ά���飺����һ������Ԫ��Ϊһά�����һ������
�����ʽ1��
	��������[][] ������ = new ��������[m][n];
	m����ʾ�����ά������m��һά����
	n����ʾÿһ��һά������n��Ԫ��
	
	//��ʾ�����������࣬ÿ������45����
	int[][] arr = new int[2][45];
	
	ȡֵ��arr[m][n]��ʾ��ȡ��m+1��һά����ĵ�n+1��Ԫ��
	arr[1][2]����ʾ��ȡ��2����ĵ�3��ѧ��
*/
class ArrayDemo{
	public static void main(String[] args){
		//��ʾ������һ��һά�������Ϊ3�Ķ�ά���飬ÿһ��һά����ĳ���Ϊ2
		int[][] arr = new int[3][2];
		System.out.println(arr);//[[I@15db9742
		System.out.println(arr[0]);//[I@6d06d69c
		System.out.println(arr[1]);//[I@7852e922
		System.out.println(arr[2]);//[I@4e25154f
		//��ȡ��2��һά�����еĵ�1��Ԫ��
		System.out.println(arr[1][0]);//0
		arr[1][0] = 100;
		arr[2][1] = 200;
		System.out.println(arr[1][0]);//100
		System.out.println(arr[2][1]);//200
	}
}
/*
��ά���鶨���ʽ2��
	��������[][] ������ = new ��������[m][];
	m����ʾ�����ά������m��һά���飬����ÿһ��һά����ĳ�����û�и�������Ҫ�����Լ��ֶ�����
*/
class ArrayDemo2{
	public static void main(String[] args){
		//��ʾ����������һά����
		int[][] arr = new int[3][];
		System.out.println(arr);//[[I@15db9742
		System.out.println(arr[0]);//null
		System.out.println(arr[1]);//null
		System.out.println(arr[2]);//null
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		System.out.println(arr[0]);//[I@6d06d69c
		System.out.println(arr[1]);//[I@7852e922
		System.out.println(arr[2]);//[I@4e25154f
		//�Ǹ���һ��һλ����ĵ�һ��Ԫ�ظ�ֵ
		arr[0][0] = 10;
		arr[2][2] = 20;
		System.out.println(arr[0][0]);//10
		System.out.println(arr[1][0]);//0
		System.out.println(arr[2][2]);//20
	}
}
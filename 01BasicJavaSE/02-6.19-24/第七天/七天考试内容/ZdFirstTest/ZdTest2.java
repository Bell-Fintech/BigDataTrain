/*
2������ʹ����
��װһ��������
       ���Խ���һ���������������͵�����
       ���ؽ���������е�Ԫ��ƴ���������ַ���
*/
import java.util.Scanner;
class ZdTest2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] array=new int[5];
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		append(array);
	}
	public static String append(int[] arr){
		String rs="";
		for(int i=0;i<arr.length;i++){
			System.out.print(rs+arr[i]);
		}
		return rs;
	}
}
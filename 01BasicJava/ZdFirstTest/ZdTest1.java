//1������ʹ����
//����һ�����飬����[10,20,40,30,5]
//д����ʵ�ֽ���������ɣ�[5,30,40,20,10]
import java.util.Scanner;
class ZdTest1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] array=new int[5];
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		for(int i=array.length-1;i>=0;i--){
			if(i==array.length-1)
				System.out.print("["+array[i]+",");
			else if(i==0){
				System.out.print(array[i]+"]");
			}
			else{
				System.out.print(array[i]+",");
			}
		}
	}
}
//����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
import java.util.Scanner;
class ArrayTest5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ�Ԫ�أ�");
		int key = sc.nextInt();
		
		int[] arr = {23,4,51,6,16,1,2,5};
		int location = searchKey(arr,key);
		if(location==-1){
			System.out.println("�������Ԫ���������в�����");
		}else{
			System.out.println("�������Ԫ���������е�����Ϊ��"+location);
		}
	}
	
	public static int searchKey(int[] arr,int key){
		int location = -1;
		//�������е�����Ԫ��
		for(int i=0; i<arr.length; i++){
			if(key==arr[i]){
				return i;
			}
		}
		return location;
	}
}
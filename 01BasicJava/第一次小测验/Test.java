/*
1������ʹ����
	����һ�����飬����[10,20,40,30,5]
	д����ʵ�ֽ���������ɣ�[5,30,40,20,10]
*/
class Test{
	public static void main(String[] args){
		int[] arr = {10,20,40,30,5};
		showArray(arr);
		reverse(arr);
		showArray(arr);
	}
	
	public static void showArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			if(arr.length==1){
				System.out.println("["+arr[i]+"]");
			}else if(i==0){
				System.out.print("["+arr[i]+",");
			}else if(i==arr.length-1){
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
	
	public static void reverse(int[] arr){
		for(int start = 0,end = arr.length-1;start<end;start++,end--){
			//����ʼ�����ͽ���������Ӧ��Ԫ��ֵ���л���
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
}
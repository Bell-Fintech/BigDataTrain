//�������(������������е�ÿһ��Ԫ��)
class ArrayTest{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
		showArray(arr);
		System.out.println("over");
	}
	
	public static void showArray(int[] arr){
		//���ԣ�length��ȡ����ĳ���
		//System.out.println(arr.length);
		//i���ֵ�ǣ�arr.length-1
		//[1,2,3,4,5,6]
		for(int i=0; i<arr.length; i++){
			//System.out.println(arr[i]);
			if(arr.length==1){//�������Ԫ����1��ʱ��
				System.out.println("["+arr[i]+"]");
			}else if(i==0){//��Ԫ���ǵ�һ����ʱ��
				System.out.print("["+arr[i]+",");
			}else if(i==arr.length-1){//��Ԫ�������һ����ʱ��
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
}
//��ά�������
class ArrayTest{
	public static void main(String[] args){
		int[][] arr = {{1,2,3,4},{3,5,1,3},{23,4,12,3}};
		showArray(arr);
	}
	
	public static void showArray(int[][] arr){
		//�ȱ�����ά����
		for(int i=0;i<arr.length; i++){
			//����һά����
			//һ��һά���������һ�У�[1,2,3,4]
			showArray(arr[i]);
		}
	}
	public static void showArray(int[] arr){
		for(int j=0; j<arr.length; j++){
			//�ж��ǲ���һ��Ԫ�ص����
			if(arr.length==1){
				System.out.println(arr[j]);
			}else if(j==0){//�ж��ǲ��ǵ�һ��Ԫ��
				System.out.print("["+arr[j]+",");
			}else if(j==arr.length-1){//�ж��ǲ������һ��Ԫ��
				System.out.println(arr[j]+"]");
			}else{
				System.out.print(arr[j]+",");
			}
		}
	}
}
//����Ԫ������ (���ǰ�Ԫ�ضԵ�)
class ArrayTest3{
	public static void main(String[] args){
		/*
			int start = 0;
			int end = arr.length-1;
			����ʼ������Ӧ��Ԫ��ֵ�ͽ���������Ӧ��Ԫ��ֵ���л�����ÿ����һ�Σ���ʼ����+1����������-1��֪����ʼ�������ڽ�������ʱ˵���غϾͽ���
		*/
		int[] arr = {1,2,3,4,5,6,7};
		showArray(arr);//��ӡԭ����
		resverArray(arr);//��������
		showArray(arr);//��ӡ����֮�������
	}
	
	public static void resverArray(int[] arr){
		int start = 0;
		int end = arr.length-1;
		while(start<end){
			//����Ӧ�����е�Ԫ��ֵ���л���
			swap(arr,start,end);
			start++;
			end--;
		}
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
	
	public static void swap(int[] arr,int start,int end){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
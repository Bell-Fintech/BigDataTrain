/*
�����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
����ֵ��˼·��
	�����һ��Ԫ�������ֵ��Ȼ���ʣ���Ԫ�ذ����Ƚ� ��һ�����ֺ����Ԫ�ش��ڵ�ǰ�����ֵ�ͽ���Ԫ�ء�����������ʱ�����ֵ�� ������
	���� ��һ��Ԫ������Сֵ��Ȼ���ʣ���Ԫ�ذ����Ƚϣ�һ�����ֺ����Ԫ��С�ڵ�ǰ����Сֵ�ͽ���Ԫ�ء�����������ʱ����Сֵ�Ͳ�����
*/
class ArrayTest2{
	public static void main(String[] args){
		int[] arr = {1,898,-10,2,12};
		int[] result = getMaxAndMin(arr);
		System.out.println("max="+result[0]+";min="+result[1]);
	}
	
	public static int[] getMaxAndMin(int[] arr){
		//����һ�����ֵ����
		int max = arr[0];
		//����һ����Сֵ����
		int min = arr[0];
		
		//����ʣ���Ԫ��
		for(int i=1; i<arr.length; i++){
			//�жϵ�ǰ��Ԫ���Ƿ����max
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		int[] result = {max,min};
		return result;
	}
}
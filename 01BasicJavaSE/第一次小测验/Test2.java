/*
2������ʹ����
��װһ��������
       ���Խ���һ���������������͵�����
       ���ؽ���������е�Ԫ��ƴ���������ַ���
*/
class Test2{
	public static void main(String[] args){
		String[] arr = {"�й�","��","�õĺ�"};
		System.out.println(append(arr));
	}
	
	public static String append(String[] arr){
		String result = "";
		for(int i=0; i<arr.length; i++){
			result += arr[i];
		}
		return result;
	}
}
/*
��̬��ʼ����������ָ��Ԫ�ص�ֵ����jvm����Ԫ�صĸ�����������ĳ���
	������ʽ��
		��������[] ������ = new ��������[]{Ԫ��ֵ1��Ԫ��ֵ2��Ԫ��ֵ3...};
	�򻯸�ʽ��
		��������[] ������ = {Ԫ��ֵ1��Ԫ��ֵ2��Ԫ��ֵ3...};
��̬��ʼ���Ͷ�̬��ʼ������ͬʱ����
*/
class ArrayDemo5{
	public static void main(String[] args){
		String[] arr2 = new String[2];
		System.out.println(arr2[0]);//null
		
		String[] arr = new String[]{"�ҵĹ�ע","�Ƽ�","����","��Ƶ"};
		//String[] arr = {"�ҵĹ�ע","�Ƽ�","����","��Ƶ"};
		System.out.println(arr);//[Ljava.lang.String;@15db9742
		System.out.println(arr[2]);//����
		
		//System.out.println(arr[4]);//java.lang.ArrayIndexOutOfBoundsException:����Ǳ�Խ���쳣�������˲�����±�
		arr = null;
		System.out.println(arr[0]);//java.lang.NullPointerException����ָ���쳣����һ��null�ı�������������
	}
}
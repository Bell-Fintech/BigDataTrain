/*
��ת�������return��䣺������ǰ�ķ���;��һ������ֵ���з��ظ�������

*/
class ReturnDemo{
	public static void main(String[] args){
		//return;//�޷����ʵ����
		
		for(int i=1; i<=10; i++){
			if(i==3){
				//break;//1 2 over
				//continue;1 2 4 5 6 7 8 9 10 over
				return;//1 2
			}
			System.out.println(i);
		}
		
		System.out.println("over");
	}
}
class ZdDayThreeTest3{
	public static void main(String[] args){
		
		//�Ƚ��������Ƿ����
		int a=10,b=20;
		System.out.println(a==b);
		//boolean equal=(a==b)?true:false;//�����в�����
		//System.out.println("equal="+equal);
		
		
		//��ȡ�����������ֵ
		int maxTwo=a>b?a:b;
		System.out.println("maxTwo="+maxTwo);
		
		//��ȡ�����������ֵ
		float f1=1.0f,f2=1.2f,f3=1.3f;
		float maxThree=(maxThree=f1>f2?f1:f2)>f3?maxThree:f3;	
		System.out.println("maxThree="+maxThree);
		
	}
}
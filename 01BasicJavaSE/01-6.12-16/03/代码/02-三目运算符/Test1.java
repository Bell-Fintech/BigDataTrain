class Test1{
	public static void main(String[] args){
		
		
		long x1=30,y1=32;
		long max1 = (x1>y1) ? x1 : y1 ;
		System.out.println(max1);
		
		float f1=1.2f,f2=1.3f;
		float max2 = (f1 > f2)?f1:f2;//�������
		System.out.println(max2);
		
		//����float�������ݣ���ȡ�����������е����ֵ���������
		float f0=1.2f,f00=1.3f,f000=1.4f;
		float max=(f0>f00)?f0:f00;
		System.out.println((max>f000)?max:f000);
		
		
		int x=20,y=21;
		//boolean max = (x==y)? true : false ;  �����в�����ʹ��
		//System.out.println(max);
		System.out.println(x==y);
	}
}
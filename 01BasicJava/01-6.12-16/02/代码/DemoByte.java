class DemoByte{
	public static void main(String args[]){
		byte b1=3,b2=4,b,c;
		b=3+4;//3��4���ǳ���������java�ڱ���ʱ�ڻ���ó����ĺ��Ƿ񳬳�byte���͵ķ�Χ�����û�п��Ը�ֵ��
		c=(byte)(b1+b2);//����֮��������� byte char short ֮�䲻�����κ����㣬����������ȱ�Ϊint����õ�byte������ǿת
		System.out.println(b);
		System.out.println(b);
		double d=12.345;
		float f=(float)d; //��doubleת����float���ܻ�����ʧ
		System.out.println(f);
		
		float f1 = (float)12.345;//���ǿ���8���ֽڴ��double�����ٿ����ĸ��ֽڴ��ǿ��float
		float f2 = 12.345f;//Ĭ����double��ֱ�ӿ���4���ֽ���ʹ��float
		
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println('a');//a
		System.out.println('a'+1);//98
		System.out.println("hello"+'a'+1);//helloa1
		System.out.println('a'+1+"hello");//98hello
		System.out.println("5+5="+5+5);//5+5=55
		System.out.println(5+5+"=5+5");//10=5+5
		
		byte by=(byte)130;//�����ݵ�����: ��intת����byte���ܻ�����ʧ
		System.out.println(by);
		//�����䣺������͵����ݵ�ԭ����ת��ʮ������� 130��Ϊint���Ͳ��뼴��00000000 00000000 00000000 10000010 תΪbyte����ʱ��ȡ1���ֽڲ��뼴��10000010 ����Ϊ10000001 ԭ��Ϊ11111110 -126

		int a=100;
		a-=20;
		System.out.println(a);
		
		short sh=60;
		//sh=sh-1;//�����ݵ�����: ��intת����byte���ܻ�����ʧ
		sh-=1;//��չ�����Ĭ����ǿ��ת������ �൱��sh=(short)(sh-1)
		System.out.println(sh);
	}
}
/*
java������һ��ǿ�������ԣ����ÿһ�����ݶ������˶�Ӧ���������ͣ����ڴ��з����˲�ͬ���ڴ�ռ��С

�����������ͣ���ֵ�ͣ������ͣ�С���ͣ����ַ��ͣ�������
	�����ͣ�byte,short,int,long
	С���ͣ�float,double
	�ַ��㣺char
	�����ͣ�boolean
			�ֽ�	λ��	Ĭ��ֵ
	byte	1		8		0
	short	2		16		0
	int		4		32		0
	long	8		64		0
	float	4		32		0.0
	double	8		64		0.0
	char	2		16		''
	boolean	1		8		false
�����������ͣ��ӿڣ��࣬����

���˻�����������֮������Ͷ�����������

��ΪĬ�ϵ���������int���ͣ���Ҫ����long���ͣ���������ֵ�����l����L
��ΪĬ�ϵ�С������double���ͣ������Ҫ������float���ͣ�����ֵ�ĺ����f����F
*/
class ParamDemo2{
	public static void main(String[] args){
		byte result=(byte)313;
		System.out.println(result);
		//��������
		byte a = 127;
		System.out.println(a);//12
		
		short b = 32767;
		System.out.println(b);//20
		
		int c = 2147483647;//���������: 2147483648
		System.out.println(c);//30
		
		//��ΪĬ�ϵ���������int���ͣ���Ҫ����long���ͣ���������ֵ�����l����L
		long d = 2147483648L;//���������: 2147483648
		System.out.println(d);//2147483648
		
		//С����
		//��ΪĬ�ϵ�С������double���ͣ������Ҫ������float���ͣ�����ֵ�ĺ����f����F
		float f = 12.12F;//�����ݵ�����: ��doubleת����float���ܻ�����ʧ
		System.out.println(f);//12.12
		
		double e = 12.13;
		System.out.println(e);//12.13
		
		//�ַ���
		char ch = '��';
		//String ch = "�й�";
		System.out.println(ch);//��
		
		//boolean����
		boolean flag = true;
		System.out.println(flag);//true
	}
}
//��ȡ����floatС���е����ֵ���������
class Test{
	public static void main(String[] args){
		float f = 12.12f,f2 = 10f,f3 = 10.10f,max;
		
		//�Ȼ�ȡf��f2�еĽϴ�ֵ
		//float max = f>f2?f:f2;
		//Ȼ������max��f3���Ƚ�
		//max = max>f3?max:f3;
		
		max=(max=f>f2?f:f2)>f3?max:f3;
		System.out.println("max="+max);
	}
}
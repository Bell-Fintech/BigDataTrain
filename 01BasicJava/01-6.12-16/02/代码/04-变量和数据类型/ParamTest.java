/*
���Ƿ���һ�������Ϊ�������Ͳ�ƥ���޷���ֵ��ʱ������ߵı�����ȷ���Խ��ս��ʱ����ʱ���������������ǿ��ת��
ǿ��ת���ĸ�ʽ��
	Ŀ���������� ������ = (Ŀ����������)(Ҫ��ת����ֵ);
*/
class ParamTest{
	public static void main(String[] args){
		int a = 3;
		byte b = 4;
		
		int c = a+b;
		System.out.println(c);
		
		byte d = (byte)(a+b);//�����ݵ�����: ��intת����byte���ܻ�����ʧ
		System.out.println(d);
	}
}
/*
�������أ�java������һ�����д���һ�����ϵ�ͬ����������Щ�����Ĳ����������߶�Ӧ�Ĳ����������Ͳ�ͬ
JVM��ͨ�������б�Ĳ�ͬ������ͬ���ķ���
ע�����
	���������غͷ���ֵ����û�й�ϵ��ֻ�Ͳ����б��й�ϵ
	���������أ���������ͬ+�����б�ͬ(�����������߶�Ӧ�Ĳ����������Ͳ�ͬ)
*/
class MethodLoadDemo{
	public static void main(String[] args){
		sop(123,"aa");
		sop("����",11);
	}
	
	public static void sop(int i,String msg){
		System.out.println(i);
	}
	
	/* ������ MethodLoadDemo�ж����˷��� sop(int,String)
	public static int sop(int i,String msg){
		System.out.println(i);
		return i;
	}*/
	
	public static void sop(String msg,int i){
		System.out.println(msg);
	}
}
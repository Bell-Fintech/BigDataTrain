//�Ƚ����������Ƿ���ȡ��������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�����int���ͣ�����long���ͣ�����main�����н��в���
class MethodLoadTest{
	public static void main(String[] args){
		System.out.println(equals((byte)1,(byte)2));
		System.out.println(equals((short)1,(short)2));
		System.out.println(equals(1,2));
		System.out.println(equals(1l,2L));
	}
	public static boolean equals(byte a,byte b){
		System.out.println("byte");
		return a==b;
	}
	public static boolean equals(short a,short b){
		System.out.println("short");
		return a==b;
	}
	public static boolean equals(int a,int b){
		System.out.println("int");
		return a==b;
	}
	public static boolean equals(long a,long b){
		System.out.println("long");
		return a==b;
	}
}
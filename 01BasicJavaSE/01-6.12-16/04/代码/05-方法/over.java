/*
�Ƚ����������Ƿ���ȡ�
�������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�����int���ͣ�����long���ͣ�
����main�����н��в���
*/
class over{
	public static void main(String[] args){
		byte b1=1,b2=2;
		short s1=1,s2=2;
		int i1=2,i2=2;
		long l1=1,l2=2;
		boolean b=equals(b1,b2);
		System.out.println("����byte�����Ƿ���ȣ�"+b);
		
		b=equals(s1,s2);
		System.out.println("����short�����Ƿ���ȣ�"+b);
		
		b=equals(i1,i2);
		System.out.println("����int�����Ƿ���ȣ�"+b);
		
		b=equals(l1,l2);
		System.out.println("����long�����Ƿ���ȣ�"+b);
	}
	public static boolean equals(byte b1,byte b2){
		return b1==b2;
	}
	public static boolean equals(short b1,short b2){
		return b1==b2;
	}
	public static boolean equals(int b1,int b2){
		return b1==b2;
	}
	public static boolean equals(long b1,long b2){
		return b1==b2;
	}
}
/*
��ϵ��������������boolean���͵ģ�Ҫô��trueҪô��false
==���Ƿ������
!=���Ƿ񲻵���
instanceof���ж������Ƿ���ָ��������(ֻ��������������)

==���ǱȽ������
=����ֵ�����
*/
class Demo{
	public static void main(String[] args){
		int x=100,y=200;
		boolean rs = x==y;//==�ǱȽ������ =�Ǹ�ֵ����� 
		System.out.println("rs="+rs);//false
		
		//rs = x=y;       // int�޷�ת��Ϊboolean
		
		rs = x!=y;      //rs = (x!=y);
		System.out.println("rs="+rs);//true
		
		rs = "zd" instanceof String;
		System.out.println("rs="+rs);//true  "zd" instanceof String; Ϊһ������
		
		//rs = "zd";// String�޷�ת��Ϊboolean
		
		rs = x<y;
		System.out.println("rs="+rs);//true
		
		rs=x>y;
		System.out.println("rs="+rs);//false
		
		rs=x<=y;
		System.out.println("rs="+rs);//true
		
		rs=x>=y;
		System.out.println("rs="+rs);//false
		
	}
}
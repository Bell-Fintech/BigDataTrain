/*
��ʽ��̣����Ƿ���ֵ������������һ������
*/
class MyStringBuffer{
	private String str = "";
	//���ֵ
	public MyStringBuffer append(Object obj){
		str += obj;
		return this;
	}
	public String toString(){
		return str;
	}
}
class MyStringBufferDemo{
	public static void main(String[] args){
		MyStringBuffer msb = new MyStringBuffer();
		msb.append("����").append("�Ǻ�").append("����").append(123);
		System.out.println(msb.toString());
	}
}
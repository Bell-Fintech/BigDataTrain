/*
��򣺵����н������ͬ��ʱ�����յĽ����false�������еĽ��ֻҪ��������ͬ�����յĽ����true
���ͻ�Ľ������һ����ֻҪ�����ߵĽ������true��ʱ�����յĽ���Ż᲻һ�������������ߵĽ������true��ʱ�����Ľ����false����Ľ����true
���Ľ������ͬfalse����ͬtrue
*/
class Demo3{
	public static void main(String[] args){
		int a = 3,b = 4;
		//���false���ұ�true
		//boolean result = a++>3 | ++b>4;
		
		//���true���ұ�false
		//boolean result = ++a>3 | b++>4;
		
		//���false���ұ�false
		//boolean result = a++>3 | b++>4;
		
		//���true���ұ�true
		boolean result = ++a>3 | ++b>4;
		System.out.println("result="+result);//���false	��true
	}
}
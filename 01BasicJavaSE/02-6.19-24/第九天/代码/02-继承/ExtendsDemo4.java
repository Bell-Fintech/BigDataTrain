/*
һ�������ɲ��֣�
	��Ա����
		���෽������һ�������Ĳ���˳��
			���������෽���ľֲ���Χ��
			���û���ҵ�����������ĳ�Ա��Χ��
			�����û���ҵ����͵�����ĳ�Ա��Χ��
			���������Ҳû���ҵ����ͻᱨ��
	super�������������		this�������������
		���ʳ�Ա������
			super.��Ա������;		this.��Ա������;
		���ʹ��췽����
			super(...);				this(...);
		���ʳ�Ա������
			super.��Ա������(...);	this.��Ա������(...);
	
	��Ա����
*/
class ExtendsDemo4{
	public static void main(String[] args){
		//Son3 s = new Son3();
		new Son3().show();
	}
}
class Father3{
	public int age = 10;
}
class Son3 extends Father3{
	public int age = 20;
	public void show(){
		int age = 30;
		System.out.println(super.age);
	}
}
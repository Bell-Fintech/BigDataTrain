/*
��̬�ı׶ˣ��޷������������еķ��������ǿ���ͨ��ת�������
��̬�ĺô���
	���ά����
	��ߴ���ĸ�����
*/
class DuoTaiDemo3{
	public static void main(String[] args){
		/*
		Area a = new America();
		a.goWhere();
		a.howMuch();
		Area j = new Japan();
		j.goWhere();
		j.howMuch();*/
		show(new America());
		show(new Japan());
		show(new Korea());
	}
	
	public static void show(Area a){
		//�ж�a�ǲ���America������
		if(a instanceof America){
			America america = (America)a;
			america.time();
		}
		a.goWhere();
		a.howMuch();
	}
}
class Area{
	public void goWhere(){
		sop("ȥ�й�");
	}
	public void howMuch(){
		sop("��Ҫ����2w�����");
	}
	public void sop(Object obj){
		System.out.println(obj);
	}
}
class America extends Area{
	public void goWhere(){
		sop("ȥ����");
	}
	public void howMuch(){
		sop("��Ҫ����2w����");
	}
	public void time(){
		sop("��ȡ������ǰʱ��");
	}
}
class Japan extends Area{
	public void goWhere(){
		sop("ȥ�ձ�");
	}
	public void howMuch(){
		sop("��Ҫ����200w��Ԫ");
	}
}
class Korea extends Area{
	public void goWhere(){
		sop("ȥ����");
	}
	public void howMuch(){
		sop("��Ҫ����2000w��Ԫ");
	}
}
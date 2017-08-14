/*
多态的弊端：无法访问子类特有的方法，但是可以通过转型来解决
多态的好处：
	提高维护性
	提高代码的复用性
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
		//判断a是不是America的类型
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
		sop("去中国");
	}
	public void howMuch(){
		sop("需要花费2w人民币");
	}
	public void sop(Object obj){
		System.out.println(obj);
	}
}
class America extends Area{
	public void goWhere(){
		sop("去美国");
	}
	public void howMuch(){
		sop("需要花费2w美金");
	}
	public void time(){
		sop("获取美国当前时间");
	}
}
class Japan extends Area{
	public void goWhere(){
		sop("去日本");
	}
	public void howMuch(){
		sop("需要花费200w日元");
	}
}
class Korea extends Area{
	public void goWhere(){
		sop("去韩国");
	}
	public void howMuch(){
		sop("需要花费2000w韩元");
	}
}
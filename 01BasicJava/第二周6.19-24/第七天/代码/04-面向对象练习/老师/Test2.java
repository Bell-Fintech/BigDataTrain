//����һ����������,���� ���ܳ�������ķ�����Ȼ����һ��������Test2�����в���

class Test2{
	public static void main(String[] args){
		int width = 10;
		int length = 20;
		
		Rectangle r = new Rectangle(width,length);
		System.out.println("�ܳ���"+r.perimeter()+",�����"+r.area());
	
		//Rectangle r2 = new Rectangle();
		//System.out.println("�ܳ���"+r.perimeter(20,length)+",�����"+r.area(20,length));
	}
}
class Rectangle{
	//private int width;
	//private int length;

	//public Rectangle(int width,int length){
	//	this.width = width;
	//	this.length = length;
	//}
	
	//public int perimeter(){
		//return (width+length)*2;
	//}
	//public int area(){
		//return width*length;
	//}
	
	public Rectangle(){
		
	}
	public int perimeter(int width,int length){
		return (width+length)*2;
	}
	public int area(int width,int length){
		return width*length;
	}
}
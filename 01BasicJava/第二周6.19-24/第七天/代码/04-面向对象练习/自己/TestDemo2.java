class TestDemo2{
	public static void main(String[] args){
		Rectangle re=new Rectangle();
		re.length=20;
		re.weigth=20;
		System.out.println("�����ε��ܳ�Ϊ:"+re.perimeter(re.length,re.weigth));
		System.out.println("�����ε����Ϊ:"+re.area(re.length,re.weigth));
	}
}
class Rectangle{
	public int length;
	public int weigth;
	public int perimeter(int length,int weigth){
		return 2*(length+weigth);
	}
	public int area(int length,int weigth){
		return length*weigth;
	}
}
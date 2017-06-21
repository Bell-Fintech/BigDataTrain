/*
	int a = 10;
	int b = 10;
	int c = 10;

	a = b++;
	c = --a;
	b = ++a;
	a = c--;
	请分别计算出a,b,c的值
*/
class Test{
	public static void main(String[] args){
		int a = 10;
		int b = 10;
		int c = 10;

		a = b++;//a=10,b=11,c=10
		c = --a;//a=9,b=11,c=9
		b = ++a;//a=10,b=10,c=9
		a = c--;//a=9,b=10,c=8
		System.out.println("a="+a+";b="+b+";c="+c);//a=9;b=10;c=8
	}
}
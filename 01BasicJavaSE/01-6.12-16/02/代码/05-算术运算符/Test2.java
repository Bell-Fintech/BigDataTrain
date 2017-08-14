/*
int a = 4;
int b = (a++)+(++a)+(a*10);
*/
class Test2{
	public static void main(String[] args){
		int a = 4;
				//(4)+(6)+(10)
		int b = (a++)+(++a)+(a*10);//70
		System.out.println("a="+a+";b="+b);//a=6;b=70
	}
}
/*
++：就是使自身的值+1
单独使用：前++和后++的结果是一样的
参与运算：
	前++：先使自身的值+1，然后再参与运算
	后++：先参与运算，然后再使自身的值+1
*/
class Demo2{
	public static void main(String[] args){
		int a = 3;
		//a++;
		//++a;
		//int b = a++;
		int b = ++a;
		System.out.println("a="+a);//a=4
		System.out.println("b="+b);//后++：b=3	前++：b=4
	}
}
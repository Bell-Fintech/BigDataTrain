/*
a=b++  b=11  a=10  
c=--a  a=9   c=9
b=++a  a=10  b=10
a=c--  c=8   a=9
 a=9 b=10 c=8
 

int a = 4;
int b = (a++)+(++a)+(a*10) 
       = 4+6+60
	   =70
 */
class Demo_Zizengjian{
	public static void main(String[] args){
		
	int a = 10;//Œ¥”√
	int b = 10;
	int c = 10;//Œ¥”√

	a = b++;
	c = --a;
	b = ++a;
	a = c--;
	
	System.out.println("a="+a+",b="+b+",c="+c);
	
	a = 4;
    b = (a++)+(++a)+(a*10);
	System.out.println("a="+a+",b="+b);

	
	}
}	   

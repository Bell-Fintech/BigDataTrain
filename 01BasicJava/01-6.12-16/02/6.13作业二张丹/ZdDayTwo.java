class ZdDayTwo{
	public static void main(String[] args){
	for(int a=0;a<26;a++){
			for(int b=0;b<26;b++){
				for(int c=0;c<52;c++){
					int rs=2*a+2*b+c-1;
					if(rs==50)
						System.out.print("a="+a+";b="+b+";c="+c);
				}
			}
			System.out.println();
		}
		
/*
			//int a=25,b=0,c=1;
			int result = (a++)+(--b+b++)+(c+++a--);
			System.out.println("result="+result);
*/
	}
}
class ZdDayThreeTest6{
	public static void main(String[] args){
		/*
		int x = 1,y = 1;

		if(x++==2 & ++y==2)
		{
			x =7;
		}
		System.out.println("x="+x+",y="+y);
		*/
		/*
	    int x = 1,y = 1;

		if(x++==2 && ++y==2)
		{
			x =7;
		}
		System.out.println("x="+x+",y="+y);
		*/
		/*
		int x = 1,y = 1;

		if(x++==1 | ++y==1)
		{
			x =7;
		}
		System.out.println("x="+x+",y="+y);
		*/
		int x = 1,y = 1;

		if(x++==1 || ++y==1)
		{
			x =7;
		}
		System.out.println("x="+x+",y="+y);
		
		boolean b = true;

		if(b==false) 
			System.out.println("a");
		else if(b)
			System.out.println("b");
		else if(!b)
			System.out.println("c");
		else
			System.out.println("d");


	}
}
//键盘录入三个数据，然后获取最大值

import java.util.Scanner;
class If3Test3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//int max=(max=a>b?a:b)>c?max:c;
		int max=0;
		if(a>=b&&a>=c){
			max=a;
		}else if(b>=a&&b>=c){
			max=b;
		}else if(c>=a&&c>=b){
			max=c;
		}
		
		/*
		//首先比较a和b的值
		if(a>b){
			//如果代码走到这里了，说明a比b大
			//比较a和c
			if(a>c){
				//如果代码走到了这里，说明最大值是a
				max = a;
			}else{
				//如果代码走到了这里，说明最大值是c
				max = c;
			}
		}else{
			//如果代码走到这里了，说明b比a大
			//比较b和c
			if(b>c){
				//如果代码走到这里，说明最大值是b
				max = b;
			}else{
				//如果代码走到这里，说明最大值是c
				max = c;
			}
		}*/
		/*
		if(a>b){
			//如果代码走到这里了，说明a比b大
			//比较a和c
			if(a>c){
				//如果代码走到了这里，说明最大值是a
				max = a;
			}else{
				//如果代码走到了这里，说明最大值是c
				max = c;
			}
		}else if(b>c){//如果代码走到这里了，说明b比a大
			//如果代码走到这里，说明最大值是b
			max = b;		
		}else{//如果代码走到这里，说明最大值是c
			max = c;
		}
		*/
		System.out.println("max="+max);
	}
}
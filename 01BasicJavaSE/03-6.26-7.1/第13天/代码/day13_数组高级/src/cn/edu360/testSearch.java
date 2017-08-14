package nuc.sw.zd.thirteen;


import java.util.Scanner;

public class testSearch {

	public static void main(String[] args) {
		int[] a = { 2, 3, -1, 0, 33 };
		ArraySort.show(a);
		ArraySort.select(a, true);
		ArraySort.show(a);
		System.out.println("输入你要查找的值：");
		Scanner scanner=new Scanner(System.in);
		int key=scanner.nextInt();
		int location=search(a, key);
		if(location==-1){
			System.out.println("查找的值不存在。");
		}
		else{
			System.out.println("查找的值的索引是："+location);
		}
	}

	private static int search(int[] a,int key) {
		int start=0,end=a.length-1;
		int middle=-1;
		while (start<=end) {
			middle=(start+end)/2;
			int value=a[middle];
			if(value==key)
				return middle;
			else if(a[0]-a[a.length-1]<0){
				 if (value<key) 
				    start=middle+1;
				else
					end=middle-1;
			}
			else {
				 if (value<key) 
				    end=middle-1;
				else
					start=middle+1;
			}	
		}
		return -1;
		
	}
}


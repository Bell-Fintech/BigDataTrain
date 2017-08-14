package 第六题;
//有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

	    int[] old={1,2,4,8,16};
	    int[] newArray=new int[old.length+1];
	    Scanner scanner =new Scanner(System.in);
	    System.out.println("请输入插入的数：");
	    int num=scanner.nextInt();
	    int location=0;
	    for(int i=0;i<old.length;i++){
	    	if(num<=old[i]){
	    		newArray[i]=num;
	    		location=i;
	    		break;
	    	}
	    	if (num>old[old.length-1]) {
				newArray[old.length]=num;
				location=old.length;
			}
	    }
	    for (int i = 0; i <location; i++) {
			newArray[i]=old[i];
		}
	    for (int i = location+1; i < newArray.length; i++) {
			newArray[i]=old[i-1];
		}
	    for(int i=0;i<newArray.length;i++){
	    	System.out.print(newArray[i]+" ");
	    }
	}
}

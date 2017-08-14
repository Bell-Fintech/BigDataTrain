/*
2°¢∑Ω∑® π”√Ã‚
∑‚◊∞“ª∏ˆ∑Ω∑®£∫
       ø…“‘Ω” ’“ª∏ˆ≤Œ ˝£∫ ˝◊÷¿‡–Õµƒ ˝◊È
       ∑µªÿΩ·π˚£∫ ˝◊È÷–µƒ‘™Àÿ∆¥Ω”∆¿¥µƒ◊÷∑˚¥Æ
*/
import java.util.Scanner;
class ZdTest2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] array=new int[5];
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		append(array);
	}
	public static String append(int[] arr){
		String rs="";
		for(int i=0;i<arr.length;i++){
            rs+=arr[i]；
		}
        System.out.print(rs);
		return rs;
	}
}

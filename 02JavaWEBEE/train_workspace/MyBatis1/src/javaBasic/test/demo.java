package javaBasic.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = sc.nextLine();
		char[] str1 = new char[str.length()];
		for (int i = 0; i < str1.length; i++) {
			str1[i] = str.charAt(i);
		}
		boolean desc = false;// false降序 true升序
		sort(str, str1, desc);
		System.out.print(str1);
		writeToFile(str1);
		      
	}

	private static void writeToFile(char[] str1) throws FileNotFoundException {
		String filePath="./result.txt";
		File file=new File(filePath);
		PrintStream ps=new PrintStream(new FileOutputStream(file));
		ps.println(str1);
	}

	private static void sort(String str, char[] str1, boolean desc) {
		for (int i = 0; i < str1.length - 1; i++) {
			for (int j = i + 1; j < str1.length; j++)
				if (desc == true) {
					if (str1[i] > str1[j]) {
						char temp = str1[i];
						str1[i] = str1[j];
						str1[j] = temp;
					}
				}else{
					if (str1[i] < str1[j]) {
						char temp = str1[i];
						str1[i] = str1[j];
						str1[j] = temp;
					}
				}
		}
	}

}

package zd.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		String regex = "[0-9]+";
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		while (m.find()) {
			m.group();
			list.add(Integer.parseInt(m.group()));
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}


}

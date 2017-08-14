package 第五题;

import java.util.Scanner;

/*企业发放的奖金根据利润提成。
 * 利润低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；
 * 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%，
 * 高于100万元时，超过100万元的部分按1%提成，
 * 从键盘输入当月利润，求应发放奖金总数？不考虑数据精度性，只考虑逻辑实现 
*/
public class Test {
  public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("请输入利润，以万元为单位：");
	float pro=scanner.nextFloat();
	float result=0,result1=0,result2=0,result3=0,result4=0,result5=0;
	result1=(float) (10*0.1);
	result2=(float) (result1+10*0.075);
	result3=(float) (result2+20*0.05);
	result4=(float) (result3+20*0.03);
	result5=(float) (result4+40*0.015);
	//单位：万元
	if (pro<0) {
		System.out.println("输入数据有误。");
	}else if (pro<=10) {
		 result=result1;
	}else if (pro<=20) {
		result=(float) (result1+(pro-10)*0.075);
	}else if (pro<=40) {
		result=(float) (result2+(pro-20)*0.05);
	}else if (pro<=60) {
		result=(float) (result3+(pro-40)*0.03);
	}else if (pro<=100) {
		result=(float) (result4+(pro-60)*0.015);
	}else {
		result=(float) (result5+(pro-100)*0.01);
	}
	
    System.out.println("奖金为："+result);
}
}

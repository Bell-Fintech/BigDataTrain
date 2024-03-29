package cn.edu360;

import java.util.Scanner;

/*
 * 企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，
 * 低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，
 * 可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，
 * 高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润，求应发放奖金总数？不考虑数据精度性，只考虑逻辑实现
 */
public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入当月的利润(以万为单位输入)：");
		double n = sc.nextDouble();
		//定义一个变量存储奖金
		double money = 0;
		//利润低于或等于10万元时，奖金可提10%
		if(n>0 && n<=10){
			money = n*0.1;
		}else if(n>10 && n<=20){
			money = 10*0.1+(n-10)*0.075;
		}else if(n>20 && n<=40){
			money = 10*0.175+(n-20)*0.05;
		}else if(n>40 && n<=60){
			money = 10*0.175+20*0.05+(n-40)*0.03;
		}else if(n>60 && n<=100){
			money = 10*0.175+20*0.08+(n-60)*0.015;
		}else if(n>100){
			money = 10*0.175+20*0.08+40*0.015+(n-100)*0.01;
		}
		System.out.println("应发放奖金总数："+money+"万元");
	}

}

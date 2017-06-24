/*
			同一类中	同一个包中(子类/其他类)		不同包子类		不同包其他类
public		√			√							√				√
protected	√			√							√				×
默认		√			√							×				×
private		√			×							×				×

public：权限最大，什么地方都可以访问
protected：只要子类都可以访问
默认：只要在同一个包中
private：只能在同一个类中
*/
package cn.edu360;
public class Father{
	public void show(){
		System.out.println("show");
	}
	protected void show2(){
		System.out.println("show2");
	}
	void show3(){
		System.out.println("sho3");
	}
	private void show4(){
		System.out.println("show4");
	}
	public static void main(String[] args){
		Father f = new Father();
		f.show();
		f.show2();
		f.show3();
		f.show4();
	}
}
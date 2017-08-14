package cn.edu360;

public class GenericDemo4 {

	public static void main(String[] args) {
		
	}

}
/*
 * 带有泛型的接口的子类：
 * 	如果不指定接口的泛型，那么子类也必须泛型下去
 * 	如果指定了接口的泛型具体类型了，那么子类自己还可以继续定义自己的泛型
 */
class InterImpl<T> implements Inter<String>{

	@Override
	public void show(String t) {
		// TODO Auto-generated method stub
		
	}

	
}
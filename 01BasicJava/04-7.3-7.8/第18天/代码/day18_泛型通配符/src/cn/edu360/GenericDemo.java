package cn.edu360;

import java.util.ArrayList;

/*
 * 	泛型通配符<?>
		任意类型，如果没有明确，那么就是Object以及任意的Java类了
 * 	? extends E
		向下限定，E及其子类，只能取元素，不能添加元素
 * 	? super E
		向上限定，E及其父类，可以添加E的类型，可以取元素
 */
public class GenericDemo {
	public static void main(String[] args) {
		/*
		 * ArrayList<Animal> list = new ArrayList<Animal>(); 
		 * ArrayList<?> list2 = new ArrayList<Animal>(); 
		 * ArrayList<?> list3 = new ArrayList<Object>(); 
		 * ArrayList<Object> list4 = new ArrayList<Animal>();
		 * 
		 * ArrayList<? extends Animal> list =new ArrayList<Animal>();
		 * ArrayList<? extends Animal> list2 =new ArrayList<Dog>(); 
		 * test(new ArrayList<Animal>()); 
		 * test(new ArrayList<Dog>()); 
		 * test(new ArrayList<Cat>());
		 */

		ArrayList<? super Animal> list = new ArrayList<Animal>();
		ArrayList<? super Animal> list2 = new ArrayList<Object>();
		test2(list);
		test2(list2);
		
		ArrayList<Animal> list3 = new ArrayList<Animal>();
		list3.add(new Dog());
		list3.add(new Animal());
		//list3.add(new Object());
	}
	
	public static void test2(ArrayList<? super Animal> list){
		
	}

	public static void test(ArrayList<? extends Animal> list) {
		
	}
}

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}
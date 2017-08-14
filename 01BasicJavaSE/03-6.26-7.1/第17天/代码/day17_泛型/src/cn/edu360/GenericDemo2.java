package cn.edu360;

public class GenericDemo2 {

	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList<String>();
		list.add("哈哈");
		list.add("呵呵");
		list.add("嘿嘿");
		list.add("哈哈");
		list.add("呵呵");
		list.add("嘿嘿");
		list.add("哈哈");
		list.add("呵呵");
		list.add("嘿嘿");
		System.out.println(list.get(0));
		System.out.println(list);
	}

}

/*
 * 泛型类 把泛型定义在类上 格式:
 * 	public class 类名<泛型类型1,…> 
 * 	注意:泛型类型必须是引用类型
 */
// 把泛型定义在类上面，一旦泛型指定的，那么类中所有使用了该泛型的类型都固定了
class MyArrayList<E> {
	private Object[] arr = new Object[10];

	public boolean add(E e) {
		// 判断数组中有哪些位置是没有值的，如果为null就说明没有值
		for (int i = 0; i < arr.length; i++) {
			// 首先把当前元素的值取出来
			Object value = arr[i];
			// 判断value是否是null
			if (null == value) {
				arr[i] = e;
				break;
			}
		}
		return true;
	}

	public E get(int index) {
		return (E) arr[index];
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			Object value = arr[i];
			if (null != value) {
				sb.append(value + ",");
			}
		}
		// 把最后面的那个逗号去掉
		String result = sb.substring(0, sb.length() - 1);
		// 在最右边添加一个"]"
		result += "]";
		return result;
	}

}
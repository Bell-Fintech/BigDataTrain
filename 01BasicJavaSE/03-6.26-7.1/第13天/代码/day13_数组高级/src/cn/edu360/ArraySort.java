package cn.edu360;

//数组元素：{2, 4, 11, 0, -4, 333, 90}
public class ArraySort {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 11, 0, -4, 333, 90 };
		show(arr);
		// bubbleSort(arr, true);
		selectSort(arr, false);
		show(arr);
	}

	/**
	 * 使用选择排序排序数组元素
	 * 
	 * @param arr
	 *            要被排序的数组
	 * @param asc
	 *            如果是true就表示升序，如果是false就表示降序
	 */
	public static void selectSort(int[] arr, boolean asc) {
		// 遍历的次数：数组的长度-1
		for (int i = 0; i < arr.length - 1; i++) {
			// 比较的次数：数组的长度-当前的遍历次数；判断后面的索引是否取到了最大索引处
			for (int j = i + 1; j < arr.length; j++) {
				if (!asc) {
					if (arr[i] < arr[j]) {
						swap(arr, i, j);
						
					}
				} else {
					if (arr[i] > arr[j]) {
						swap(arr, i, j);
					}
				}
			}
		}
	}

	/**
	 * 使用冒泡排序排序数组元素
	 * 
	 * @param arr
	 *            要被排序的数组
	 * @param asc
	 *            如果是true就表示升序，如果是false就表示降序
	 */
	private static void bubbleSort(int[] arr, boolean asc) {
		// 需要遍历的次数：数组长度-1
		for (int i = 1; i < arr.length; i++) {
			// 每一次需要比较的次数：数组长度-当前遍历的次数
			for (int j = 0; j < arr.length - i; j++) {
				// 元素两两之间进行比较
				if (asc) {
					if (arr[j] > arr[j + 1]) {
						swap(arr, j, j + 1);
					}
				} else {
					if (arr[j] < arr[j + 1]) {
						swap(arr, j, j + 1);
					}
				}
			}
		}
	}

	/**
	 * 将数组中指定索引的值进行互换
	 * 
	 * @param arr
	 *            数组
	 * @param i
	 *            索引1
	 * @param j
	 *            索引2
	 */
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * 遍历一维数组
	 * 
	 * @param arr
	 *            要被遍历的数组
	 */
	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr.length == 1) {
				System.out.println(arr[i]);
			} else if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}
}
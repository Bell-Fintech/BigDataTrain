/*
静态初始化：由我们指定元素的值，由jvm根据元素的个数决定数组的长度
	基本格式：
		数据类型[] 数组名 = new 数据类型[]{元素值1，元素值2，元素值3...};
	简化格式：
		数据类型[] 数组名 = {元素值1，元素值2，元素值3...};
静态初始化和动态初始化不能同时存在
*/
class ArrayDemo5{
	public static void main(String[] args){
		String[] arr2 = new String[2];
		System.out.println(arr2[0]);//null
		
		String[] arr = new String[]{"我的关注","推荐","导航","视频"};
		//String[] arr = {"我的关注","推荐","导航","视频"};
		System.out.println(arr);//[Ljava.lang.String;@15db9742
		System.out.println(arr[2]);//导航
		
		//System.out.println(arr[4]);//java.lang.ArrayIndexOutOfBoundsException:数组角标越界异常：访问了不存的下标
		arr = null;
		System.out.println(arr[0]);//java.lang.NullPointerException：空指针异常：用一个null的变量访问内容了
	}
}
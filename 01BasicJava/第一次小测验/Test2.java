/*
2、方法使用题
封装一个方法：
       可以接收一个参数：数字类型的数组
       返回结果：数组中的元素拼接起来的字符串
*/
class Test2{
	public static void main(String[] args){
		String[] arr = {"中国","你","好的狠"};
		System.out.println(append(arr));
	}
	
	public static String append(String[] arr){
		String result = "";
		for(int i=0; i<arr.length; i++){
			result += arr[i];
		}
		return result;
	}
}
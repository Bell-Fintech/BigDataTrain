/*
链式编程：就是返回值就是自身对象的一种现象
*/
class MyStringBuffer{
	private String str = "";
	//添加值
	public MyStringBuffer append(Object obj){
		str += obj;
		return this;
	}
	public String toString(){
		return str;
	}
}
class MyStringBufferDemo{
	public static void main(String[] args){
		MyStringBuffer msb = new MyStringBuffer();
		msb.append("哈哈").append("呵呵").append("嘻嘻").append(123);
		System.out.println(msb.toString());
	}
}
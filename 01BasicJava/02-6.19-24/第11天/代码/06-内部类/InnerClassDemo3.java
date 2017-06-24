/*
一个人可以封装成一个类，一个人有很多器官，每一个器官也可以封装成一个类；有些器官是比较重要的，不能直接暴露出来，这些器官就比心脏
可以定义成私有的内部类，然后提供一个公共的方法给外部调用，在这个方法内部可以做一些校验
*/
class InnerClassDemo3{
	public static void main(String[] args){
		Body b = new Body();
		while(true){
			//在多线程的时候会讲解，控制检查的时间频率
			b.checkHeart(123456);
		}
	}
}
class Body{
	private String name;
	private int age;
	
	private class Heart{
		public void beat(){
			System.out.println("心脏跳动...");
		}
	}
	//提供一个公共的方法
	public void checkHeart(int key){
		
		if(key!=123456){
			System.out.println("你不是医生，不给你看");
			return;
		}
		new Heart().beat();
	}
}
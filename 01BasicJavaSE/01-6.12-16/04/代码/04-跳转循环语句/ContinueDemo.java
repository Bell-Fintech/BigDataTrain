/*
continue：继续，结束本次循环，直接开始下次循环
	可以使用在for,while,do...while语句中
	注意事项：离开使用场景没有任何意义
*/
class ContinueDemo{
	public static void main(String[] args){
		/*continue;//continue 在 loop 外部
		for(int i=1; i<=10; i++){
			//当i==3的时候，continue一下
			if(i==3){
				continue;
			}
			System.out.println(i);
		}
		*/
		
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//我想在控制台输出2次:“Java基础班“
				//break;
				//我想在控制台输出7次:“Java基础班“
				//continue;
				//我想在控制台输出13次:“Java基础班“	
				System.out.println("Java基础班");
			}
			System.out.println("Java基础班");
		}
		
		
		
	}
}
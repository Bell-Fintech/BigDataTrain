/*
1.对一维数组进行增删改查：int[] arr = new int[10]; 
	要求：用方法实现 
		1.输入10个整数存入数组 
		2.删除指定位置上的数 
		3.修改指定位置上的数 
		4.查找某个数的位置（下标） 
		5.查找最大值 
		6.查找最小值 
		7.去掉一个最大值，去掉一个最小值，求平均值
		8.将数组排序(正序和逆序)
*/
import java.util.Scanner;
import java.util.Random;
class ArrayTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10]; 
		add(arr,sc);//1.输入10个整数存入数组 
		show(arr);
		
		/*
		//2.删除指定位置上的数 
		while(true){
			System.out.println("请输入要删除的索引对应的值(0-9)：");
			int index = sc.nextInt();
			if(index<0 || index>9){
				continue;
			}else{
				arr = delete(arr,index);
				show(arr);
				break;
			}
		}
				
		//3.修改指定位置上的数
		while(true){
			System.out.println("请输入要修改的索引的位置(0-9)：");
			int index = sc.nextInt();
			if(index<0 || index>9){
				continue;
			}else{
				System.out.println("请输入要替换的值：");
				int number = sc.nextInt();
				update(arr,index,number); 
				show(arr);
				break;
			}
			
		}
		
		//4.查找某个数的位置（下标） 
		System.out.println("请输入你想要查找的元素值：");
		int key = sc.nextInt();
		int location = searchKey(arr,key);
		if(-1==location){
			System.out.println("你输入的值在数组中不存在");
		}else{
			System.out.println("你输入的值在数组第"+location+"索引处");
		}
		
		
		//5.查找最大值
		System.out.println(getMaxValue(arr));
		//6.查找最小值 
		System.out.println(getMinValue(arr));
		
		
		//7.去掉一个最大值，去掉一个最小值，求平均值
		float averageNumber = getAverageNumber(arr);
		System.out.println("平均值是："+averageNumber);
		*/
		
		//8.将数组排序(正序和逆序)
		sort(arr,false);
		show(arr);
	}
	
	//8.将数组排序(正序和逆序)
	public static void sort(int[] arr,boolean desc){
		//新建一个数组
		int[] newArr = new int[arr.length];
		//新建一个中间者数组，这个数组的地址值和arr的一样
		int[] tempArr = arr;
		for(int i=0; i<arr.length; i++){
			if(desc){//降序
				//如果是逆序：可以将剩余没有复制的最靠前的位置赋值为最大值
				//找到剩余元素中的最大值
				int max = getMaxValue(tempArr);
				newArr[i] = max;
				//用完最大值之后，将最大值删除掉
				//查找到最大值的索引
				int index = searchKey(tempArr,max);
				tempArr = delete(tempArr,index);
			}else{//升序
				//如果正序：可以将剩余没有赋值的最靠前位置赋值为最小值
				//找到剩余元素中的最大值
				int min = getMinValue(tempArr);
				newArr[i] = min;
				//用完最大值之后，将最大值删除掉
				//查找到最大值的索引
				int index = searchKey(tempArr,min);
				tempArr = delete(tempArr,index);
			}
		}
		
		//将newArr中的值赋值给arr
		for(int i=0; i<arr.length; i++){
			arr[i] = newArr[i];
		}
	}
	
	//7.去掉一个最大值，去掉一个最小值，求平均值
	public static float getAverageNumber(int[] arr){
		//求出最大值和最小值
		int max = getMaxValue(arr);
		int min = getMinValue(arr);
		//定义计算和的变量
		int sum = 0;
		int uppCount = 0;//表示最大值的除去次数
		int lowCount = 0;//表示最小值的除去次数
		//遍历数组，除了最大值和最小值不参与计算和
		for(int i=0; i<arr.length; i++){
			//判断当前的值是不是最大值或者最小值
			int value = arr[i];
			if(value==max && uppCount==0){
				uppCount++;
				continue;//直接跳过本次循环
			}
			if(value==min && lowCount==0){
				lowCount++;
				continue;
			}
			sum += value;
		}
		return 1.0f*sum/(arr.length-2);
	}
	
	//6.查找最小值 
	public static int getMinValue(int[] arr){
		//假设第一个元素是最小值
		int min = arr[0];
		//从第二个 元素开始遍历和当前的最小值做比较，一旦发现当前遍历的元素值小于最小值了就进行互换
		for(int i=1; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
	
	//5.查找最大值
	public static int getMaxValue(int[] arr){
		//假设第一个元素是最大值
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	
	//4.查找某个数的位置（下标）
	public static int searchKey(int[] arr,int key){
		//遍历当前的数组，拿当前的元素值和key做比较，一旦发现相等就返回当前的索引值；当循环走完还没有找到就返回-1
		for(int i=0; i<arr.length; i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}
	
	//3.修改指定位置上的数 
	public static void update(int[] arr,int index,int number){
		//遍历原数组，比较当前遍历的索引是否等于index，如果等于就将当前索引对应的元素值改为number
		for(int i=0; i<arr.length; i++){
			if(i==index){
				arr[i] = number;
				break;
			}
		}
	}
	
	//2.删除指定位置上的数;比如数组的长度是10，删除一个之后长度变为9
	public static int[] delete(int[] arr,int index){
		//新建一个数组
		int[] newArr = new int[arr.length-1];
		//将删除之后的原数组中的值拷贝到新数组中
		//原数组中除了需要删除索引对应的值之外都拷贝到新数组中
		//i表示原数组的索引；j表示新数组的索引
		for(int i=0,j=0; i<arr.length; i++,j++){
			//如果当前的i等于了index当前的这个值不拷贝
			if(i==index){
				j--;//当前的j不能跳过，如果跳过了数组的长度就不够了
				continue;
			}
			newArr[j] = arr[i];
		}
		return newArr;
	}
	
	
	//1.输入10个整数存入数组 
	public static void add(int[] arr,Scanner sc){
		Random r = new Random();
		for(int i=0; i<arr.length; i++){
			//System.out.println("请输入第"+(i+1)+"个值：");
			//int number = sc.nextInt();
			arr[i] = r.nextInt(100);
		}
	}
	
	//遍历打印数组
	public static void show(int[] arr){
		for(int i=0; i<arr.length; i++){
			if(arr.length==1){
				System.out.println("["+arr[i]+"]");
			}else if(i==0){
				System.out.print("["+arr[i]+",");
			}else if(i==arr.length-1){
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
}
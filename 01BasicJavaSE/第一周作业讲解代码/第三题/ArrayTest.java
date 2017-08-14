//3.编写一个程序，读入数目确定的考试分数，并且判断有多少个分数高于或等于平均分，
//有多少个分数低于平均分。输入一个负数标志输入结束，假设最高分为100
import java.util.Scanner;
class ArrayTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入多少个人的考试分数：");
		int count = sc.nextInt();
		int[] arr = new int[count];
		
		count = 0;
		while(true){
			//数组没有被全部赋值时候再进行赋值
			if(count!=arr.length){
				System.out.println("请输入学生的成绩：");
				int score = sc.nextInt();
				//如果想提前结束就输入一个负数
				if(score<0){
					break;
				}
				arr[count] = score;
				count++;
			}else{
				break;
			}
		}
		float averageScore = 0;
		for(int i=0; i<arr.length; i++){
			averageScore+=arr[i];
		}
		averageScore /= arr.length;
		
		//定义一个存储高于或者等于平均分的变量
		int uppCount = 0;
		//定义一个存储低于平均分的变量
		int lowCount = 0;
		
		for(int i=0; i<arr.length; i++){
			int value = arr[i];
			if(value>=averageScore){
				uppCount++;
			}else{
				lowCount++;
			}
		}
		
		System.out.println("平均分是："+averageScore+",高于或者等于平均分的个数："+uppCount+",低于平均分的个数："+lowCount);
	}
}
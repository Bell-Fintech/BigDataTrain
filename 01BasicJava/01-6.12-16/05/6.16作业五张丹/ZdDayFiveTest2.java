
import java.util.Scanner;
class ZdDayFiveTest2 {
	static Scanner sc=new Scanner(System.in);
  public static void main(String[] args){
	  int[] num=new int[10];
	  input(num);
	  System.out.print("\n"+"请输入你的选择:");
	  int choose=sc.nextInt();
	  switch(choose){
	  		case 2: del(num);break;
	  		case 3: update(num);break;
	  		case 4: find(num);break;
	  		case 5: max(num);break;
	  		case 6: min(num);break;
	  		case 7: ave(num);break;
	  		case 8: sortCor(num);break;
	  		case 9: sortBack(num);break;
	  		default:input(num);
		  }	
	  }
  
  //1.输入10个整数存入数组
  public static void input(int[] num){
	  System.out.println("请输入数组中的10个数：");
	  for(int i=0;i<num.length;i++){
		  num[i]=sc.nextInt();
	  }
	  System.out.println("数组中的10个数为：");
	  //输出数组中的 10个整数
	  for(int i=0;i<num.length;i++){
		  System.out.print(num[i]+"	");
	  }
  }
  //2.删除指定位置上的数 
  public static void del(int[] num){
	  System.out.println("请输入删除的指定位置：");
	  int delIndex=sc.nextInt();
	  
	  if(delIndex<0||delIndex>9){
		  System.out.print("你输入的指定位置不存在。");
		  return;
	  }
	  if(delIndex==num.length-1){
		  for(int i=0;i<num.length-1;i++){
			  num[i]=num[i];
		  }
	  }
	  else{
		  for(int i=delIndex+1;i<num.length;i++){
			  num[i-1]=num[i];
		  }
	  }
	//删除指定位置后，输出数组中的 10个内容
	  System.out.println("删除指定位置的数后，数组中的"+(num.length-1)+"个数为：");
	  for(int i=0;i<num.length-1;i++){
		  System.out.print(num[i]+"	");
	  }
  }
//3.修改指定位置上的数 
  public static void update(int[] num){
	  System.out.println("请输入修改的指定位置：");
	  int updIndex=sc.nextInt();
	  System.out.println("请输入修改后的值：");
	  int updRs=sc.nextInt();
	  if(updIndex<0||updIndex>9){
		  System.out.print("你输入的指定位置不存在。");
		  return;
	  }
	  num[updIndex]=updRs;
	//修改指定位置后，输出数组中的 10个内容
	  System.out.println("修改指定位置的数后，数组中的10个数为：");
	  for(int i=0;i<num.length;i++){
		  System.out.print(num[i]+"	");
	  }
  }
//4.查找某个数的位置（下标） 
  public static void find(int[] num){
	  System.out.println("请输入所查找的值的索引为：");
	  int findNum=sc.nextInt();
	  for(int i=0;i<num.length;i++){
		  if(num[i]==findNum){
			  System.out.println("所查找的值的索引为："+i);
			  return;
		  }
		  if(num[num.length-1]!=findNum&&i==num.length-1)
			  System.out.println("所查找的值的索引不存在");
	    }
  }
//5.查找最大值
public static void max(int[] num){
	int max=num[0];
	  for(int i=1;i<num.length;i++){
		  if(num[i]>max)
			  max=num[i];
	  }
	  System.out.println("数组中最大值为："+max);
}
//6.查找最小值
public static void min(int[] num){
	  int min=num[0];
	  for(int i=1;i<num.length;i++){
		  if(num[i]<min)
			  min=num[i];
	  }
	  System.out.println("数组中最小值为："+min);
}
//7.去掉一个最大值，去掉一个最小值，求平均值
public static void ave(int[] num){
	  sortCor(num);
	  int sum=0;
	  for(int i=1;i<num.length-2;i++){
		  sum+=num[i];
	  }
	  float ave=  sum*1.0f/(num.length-2);
	  System.out.println("去掉一个最大值，去掉一个最小值，和为"+sum+";平均值为："+ave);
}
//8.将数组排序(正序和逆序)
public static void sortCor(int[] num){
	  //正序
	  for(int i=0;i<num.length;i++){
		  for(int j=i;j<num.length;j++){
			  if(num[i]>num[j]){
				  int t=num[i];
				  num[i]=num[j];
				  num[j]=t;
			  }
		  }
	  }
	  System.out.println("数组中的10个数升序排序为：");
	  //输出数组中的 10个整数
	  for(int i=0;i<num.length;i++){
		  System.out.print(num[i]+"	");
	  }
}
//9.将数组排序(正序和逆序)
public static void sortBack(int[] num){
	 //逆序
	  //冒泡排序 每一个都和剩余比较 已经排好的不再处理
	  for(int i=0;i<num.length;i++){
		  for(int j=i;j<num.length;j++){
			  if(num[i]<num[j]){
				  int t=num[i];
				  num[i]=num[j];
				  num[j]=t;
			  }
		  }
	  }
	  System.out.println("数组中的10个数降序排序为：");
	  //输出数组中的 10个整数
	  for(int i=0;i<num.length;i++){
		  System.out.print(num[i]+"	");
	  }
}
}

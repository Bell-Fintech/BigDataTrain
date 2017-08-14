/*
数组遍历(依次输出数组中的每一个元素)
数组获取最值(获取数组中的最大值最小值)
数组元素逆序 (就是把元素对调)
数组查表法(根据键盘录入索引,查找对应星期)
数组元素查找(查找指定元素第一次在数组中出现的索引)
*/
import java.util.Scanner;
class ArrayTest1

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		//数组遍历(依次输出数组中的每一个元素)
		int[] a={1,2,2};
		System.out.println("数组a中的值正序遍历结果：");
		for(int  i=0;i<a.length;i++){
			System.out.print(a[i]+"	");
		}
		System.out.println();
		
		
		//数组元素逆序 (就是把元素对调)
		System.out.println("数组a中的值逆序遍历结果：");
		for(int  i=a.length-1;i>=0;i--){
			System.out.print(a[i]+"	");
		}
		System.out.println();
		
		
		//键盘录入数组中的数据的方式  并数组遍历(依次输出数组中的每一个元素)
		int[] b=new int[5];
		System.out.println("输入数组b中的值：");
		for(int  i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		}
		System.out.println("数组b中的值正序遍历结果：");
		for(int  i=0;i<b.length;i++){
			System.out.print(b[i]+"	");
		}
		System.out.println();
		
		
		System.out.println("数组b中的值逆序遍历结果：");
		for(int  i=b.length-1;i>=0;i--){
			System.out.print(b[i]+"	");
		}
		System.out.println();
		
		//数组b获取最值(获取数组中的最大值最小值)
		int maxI=b[0];
		int minI=b[0];
	    for(int i=0;i<b.length;i++){
           if (b[i]<minI)
               minI=b[i];
           if(b[i]>maxI)
              maxI=b[i];
        }
		System.out.println("数组b中的最大值："+maxI+"；最小值："+minI);
		
		//数组a获取最值(获取数组中的最大值最小值)
		int max=(max=a[0]>a[1]?a[0]:a[1])>a[2]?max:a[2];
		int min=(max=a[0]<a[1]?a[0]:a[1])<a[2]?max:a[2];
		System.out.println("数组a中的最大值："+max+";最小值："+min);
		
		
		//数组查表法(根据键盘录入索引,查找对应星期)
		System.out.println("键盘录入周期索引：");
		String[] week={"不存在","周一","周二","周三","周四","周五","周六","周日"};
		int index=sc.nextInt();
		if(index>=0&&index<8){
			System.out.println("根据键盘录入的索引,查找到的对应星期为："+week[index]);
		}else{
			System.out.println("键盘录入的索引有误。");
		}
		
		//数组元素查找(查找指定元素第一次在数组中出现的索引)
		System.out.println("键盘录入指定元素，查看在数组a中的索引：");
		int rs=sc.nextInt();
		for(int  i=0;i<a.length;i++){
			if(rs==a[i]){			
				System.out.println("指定元素"+rs+"第一次在数组中出现的索引为："+i);
				break;
			}
			if(i==a.length-1&&rs!=a[i])
				System.out.println("您指定元素不存在");

		}
		
		
	}
}
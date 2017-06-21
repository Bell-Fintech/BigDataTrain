/*
1.��һά���������ɾ�Ĳ飺int[] arr = new int[10]; 
	Ҫ���÷���ʵ�� 
		1.����10�������������� 
		2.ɾ��ָ��λ���ϵ��� 
		3.�޸�ָ��λ���ϵ��� 
		4.����ĳ������λ�ã��±꣩ 
		5.�������ֵ 
		6.������Сֵ 
		7.ȥ��һ�����ֵ��ȥ��һ����Сֵ����ƽ��ֵ
		8.����������(���������)
*/
import java.util.Scanner;
import java.util.Random;
class ArrayTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10]; 
		add(arr,sc);//1.����10�������������� 
		show(arr);
		
		/*
		//2.ɾ��ָ��λ���ϵ��� 
		while(true){
			System.out.println("������Ҫɾ����������Ӧ��ֵ(0-9)��");
			int index = sc.nextInt();
			if(index<0 || index>9){
				continue;
			}else{
				arr = delete(arr,index);
				show(arr);
				break;
			}
		}
				
		//3.�޸�ָ��λ���ϵ���
		while(true){
			System.out.println("������Ҫ�޸ĵ�������λ��(0-9)��");
			int index = sc.nextInt();
			if(index<0 || index>9){
				continue;
			}else{
				System.out.println("������Ҫ�滻��ֵ��");
				int number = sc.nextInt();
				update(arr,index,number); 
				show(arr);
				break;
			}
			
		}
		
		//4.����ĳ������λ�ã��±꣩ 
		System.out.println("����������Ҫ���ҵ�Ԫ��ֵ��");
		int key = sc.nextInt();
		int location = searchKey(arr,key);
		if(-1==location){
			System.out.println("�������ֵ�������в�����");
		}else{
			System.out.println("�������ֵ�������"+location+"������");
		}
		
		
		//5.�������ֵ
		System.out.println(getMaxValue(arr));
		//6.������Сֵ 
		System.out.println(getMinValue(arr));
		
		
		//7.ȥ��һ�����ֵ��ȥ��һ����Сֵ����ƽ��ֵ
		float averageNumber = getAverageNumber(arr);
		System.out.println("ƽ��ֵ�ǣ�"+averageNumber);
		*/
		
		//8.����������(���������)
		sort(arr,false);
		show(arr);
	}
	
	//8.����������(���������)
	public static void sort(int[] arr,boolean desc){
		//�½�һ������
		int[] newArr = new int[arr.length];
		//�½�һ���м������飬�������ĵ�ֵַ��arr��һ��
		int[] tempArr = arr;
		for(int i=0; i<arr.length; i++){
			if(desc){//����
				//��������򣺿��Խ�ʣ��û�и��Ƶ��ǰ��λ�ø�ֵΪ���ֵ
				//�ҵ�ʣ��Ԫ���е����ֵ
				int max = getMaxValue(tempArr);
				newArr[i] = max;
				//�������ֵ֮�󣬽����ֵɾ����
				//���ҵ����ֵ������
				int index = searchKey(tempArr,max);
				tempArr = delete(tempArr,index);
			}else{//����
				//������򣺿��Խ�ʣ��û�и�ֵ���ǰλ�ø�ֵΪ��Сֵ
				//�ҵ�ʣ��Ԫ���е����ֵ
				int min = getMinValue(tempArr);
				newArr[i] = min;
				//�������ֵ֮�󣬽����ֵɾ����
				//���ҵ����ֵ������
				int index = searchKey(tempArr,min);
				tempArr = delete(tempArr,index);
			}
		}
		
		//��newArr�е�ֵ��ֵ��arr
		for(int i=0; i<arr.length; i++){
			arr[i] = newArr[i];
		}
	}
	
	//7.ȥ��һ�����ֵ��ȥ��һ����Сֵ����ƽ��ֵ
	public static float getAverageNumber(int[] arr){
		//������ֵ����Сֵ
		int max = getMaxValue(arr);
		int min = getMinValue(arr);
		//�������͵ı���
		int sum = 0;
		int uppCount = 0;//��ʾ���ֵ�ĳ�ȥ����
		int lowCount = 0;//��ʾ��Сֵ�ĳ�ȥ����
		//�������飬�������ֵ����Сֵ����������
		for(int i=0; i<arr.length; i++){
			//�жϵ�ǰ��ֵ�ǲ������ֵ������Сֵ
			int value = arr[i];
			if(value==max && uppCount==0){
				uppCount++;
				continue;//ֱ����������ѭ��
			}
			if(value==min && lowCount==0){
				lowCount++;
				continue;
			}
			sum += value;
		}
		return 1.0f*sum/(arr.length-2);
	}
	
	//6.������Сֵ 
	public static int getMinValue(int[] arr){
		//�����һ��Ԫ������Сֵ
		int min = arr[0];
		//�ӵڶ��� Ԫ�ؿ�ʼ�����͵�ǰ����Сֵ���Ƚϣ�һ�����ֵ�ǰ������Ԫ��ֵС����Сֵ�˾ͽ��л���
		for(int i=1; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
	
	//5.�������ֵ
	public static int getMaxValue(int[] arr){
		//�����һ��Ԫ�������ֵ
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	
	//4.����ĳ������λ�ã��±꣩
	public static int searchKey(int[] arr,int key){
		//������ǰ�����飬�õ�ǰ��Ԫ��ֵ��key���Ƚϣ�һ��������Ⱦͷ��ص�ǰ������ֵ����ѭ�����껹û���ҵ��ͷ���-1
		for(int i=0; i<arr.length; i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}
	
	//3.�޸�ָ��λ���ϵ��� 
	public static void update(int[] arr,int index,int number){
		//����ԭ���飬�Ƚϵ�ǰ�����������Ƿ����index��������ھͽ���ǰ������Ӧ��Ԫ��ֵ��Ϊnumber
		for(int i=0; i<arr.length; i++){
			if(i==index){
				arr[i] = number;
				break;
			}
		}
	}
	
	//2.ɾ��ָ��λ���ϵ���;��������ĳ�����10��ɾ��һ��֮�󳤶ȱ�Ϊ9
	public static int[] delete(int[] arr,int index){
		//�½�һ������
		int[] newArr = new int[arr.length-1];
		//��ɾ��֮���ԭ�����е�ֵ��������������
		//ԭ�����г�����Ҫɾ��������Ӧ��ֵ֮�ⶼ��������������
		//i��ʾԭ�����������j��ʾ�����������
		for(int i=0,j=0; i<arr.length; i++,j++){
			//�����ǰ��i������index��ǰ�����ֵ������
			if(i==index){
				j--;//��ǰ��j�����������������������ĳ��ȾͲ�����
				continue;
			}
			newArr[j] = arr[i];
		}
		return newArr;
	}
	
	
	//1.����10�������������� 
	public static void add(int[] arr,Scanner sc){
		Random r = new Random();
		for(int i=0; i<arr.length; i++){
			//System.out.println("�������"+(i+1)+"��ֵ��");
			//int number = sc.nextInt();
			arr[i] = r.nextInt(100);
		}
	}
	
	//������ӡ����
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
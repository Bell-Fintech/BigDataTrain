//��дһ������ʹ���ܹ�����10�����������Ҵ洢���л�����ͬ�����������10�������
import java.util.Scanner;
class ArrayTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		show(arr);
		int index = 0;//�տ�ʼ������±���0
		while(true){
			System.out.println("������Ҫ�洢��ֵ��");
			int value = sc.nextInt();
			boolean flag = true;//����value�ǲ����������е�
			//�жϵ�ǰ��������û��value
			for(int i=0; i<arr.length; i++){
				if(arr[i]==value){
					flag = false;
					break;
				}
			}
			//���flagΪtrue������value����������
			if(flag){
				arr[index] = value;
				//��ֵһ��֮��index+1
				index++;
			}
			//�ж�һ��index�ǲ��ǵ���10���������10��˵���������Ѿ�����10������ͬ����ֵ��
			if(index==10){
				//�˳���ѭ��
				break;
			}
		}
		show(arr);
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
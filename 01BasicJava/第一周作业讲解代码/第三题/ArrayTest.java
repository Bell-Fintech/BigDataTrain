//3.��дһ�����򣬶�����Ŀȷ���Ŀ��Է����������ж��ж��ٸ��������ڻ����ƽ���֣�
//�ж��ٸ���������ƽ���֡�����һ��������־���������������߷�Ϊ100
import java.util.Scanner;
class ArrayTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ٸ��˵Ŀ��Է�����");
		int count = sc.nextInt();
		int[] arr = new int[count];
		
		count = 0;
		while(true){
			//����û�б�ȫ����ֵʱ���ٽ��и�ֵ
			if(count!=arr.length){
				System.out.println("������ѧ���ĳɼ���");
				int score = sc.nextInt();
				//�������ǰ����������һ������
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
		
		//����һ���洢���ڻ��ߵ���ƽ���ֵı���
		int uppCount = 0;
		//����һ���洢����ƽ���ֵı���
		int lowCount = 0;
		
		for(int i=0; i<arr.length; i++){
			int value = arr[i];
			if(value>=averageScore){
				uppCount++;
			}else{
				lowCount++;
			}
		}
		
		System.out.println("ƽ�����ǣ�"+averageScore+",���ڻ��ߵ���ƽ���ֵĸ�����"+uppCount+",����ƽ���ֵĸ�����"+lowCount);
	}
}
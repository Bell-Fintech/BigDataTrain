/*
���ڿ���̨�������1-10
���ڿ���̨�������10-1
���1-10֮������֮��
���1-100֮��ż����
���1-100֮��������

��ͳ��1-1000֮��ֱ��������������������ж��ٸ���
��3������2
��5������3
��7������2
*/
class ForTest{
	public static void main(String[] args){
		System.out.print("����1-10:");
		for(int i=1;i<11;i++){
			System.out.print(i+";");
		}
		System.out.println();

		System.out.print("����10-1:");
		for(int i=10;i>0;i--){
			System.out.print(i+";");
		}
		System.out.println();
		
		int sum=0,sum1=0;
		for(int i=1;i<11;i++){
			sum+=i;
		}
		System.out.println("1-10֮������֮��sum="+sum);
		
		for(int i=1;i<101;i++){
			if(i%2==0){
				sum+=i;
			}
			else{
				sum1+=i;
			}
		}
		System.out.println("1-100֮��ż����sum="+sum);
		System.out.println("1-100֮��������sum1="+sum1);

		
		//��ͳ��1-1000֮��ֱ��������������������ж��ٸ���
        //��3������2   ��5������3   ��7������2
		int count0=0,count1=0,count2=0;
		for(int i=1;i<1001;i++){
			if(i%3==2){
				count0++;
			}
			if(i%5==3){
				count1++;
			}
			if(i%7==2){
				count2++;
			}
		}
		System.out.println("1-1000֮��:��3������2�����У�"+count0+"����"+"��5������3�����У�"+count1+"����"+"��7������2�����У�"+count2);
		
	}
}
/*
11.���1-1000֮�ڵ�������
�����Ǵ���1����Ȼ��
�����ǳ���1���������ܱ���������������������3����һ��������
��Ϊ��ֻ�ܱ�1��3������
�ֱ���4����һ����������Ϊ������ͬʱ��1,2,4����
*/

class ZdDayThreeTest11{
	public static void main(String[] args){
	    int j;
		boolean flag;
		  for(int i=2;i<1000;i++){
			flag=false;
			for(j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
				flag=true;
				break;
				}
			}
			if(flag==false){
				System.out.print(i+" ");
			}
		  }
	}
}
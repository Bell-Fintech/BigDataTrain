/*
С�������ÿ�����3ԪǮ���������������
���ǣ�ÿ����һ��������Ǵ�Ǯ�ĵ�6�����6�ı����Ļ���
�����Ứȥ5ԪǮ�����ʣ����������죬С��ſ��Դ浽100ԪǮ��

*/
class BreakTest{
	public static void main(String[] args){
		int money=0,count=0;
		//for
		for(;money<100;){
			count++;
			money+=3;
			if(count%6==0){
				money-=5;
			}
			
		}
		System.out.println("������"+count+";money="+money);
		
		
		//while
		money=0;
		count=0;
		while(true){
			count++;//�����Ѿ��н�� ����ִֻ��һ��
			money+=3;
			if(count%6==0){
				money-=5;
			}
			if(money>=100)
				break;
		}
		System.out.println("money="+money+";������"+count);
	}
}
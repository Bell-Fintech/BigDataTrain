/*
for����while���������ڳ�ʼ��������������Ǹ���������ѭ������֮��for���֮������Ͳ����ٷ�����������ˣ�
while���֮�����仹���Լ�������������������������ѭ��������֮�����ʹ�������������while��䣻����㲻��ʹ����������ˣ�����for��䣬��Ϊfor����ڽ���֮��
��������ʹ��ڴ�����ʧ�ˣ��Ӷ��������������Ч��

forѭ�������ʺ����̶���Χ�ڵ�ѭ���ж�
whileѭ�������ʺ�δ֪��Χ�ڵ�ѭ���жϣ����ʺ���δ֪��
*/
class WhileAndForDemo{
	public static void main(String[] args){
		//��1-100֮���������ż������
		/*
		//���屣�����������ı���
		int singleCount = 0;
		//���屣��ż�������ı���
		int doubleCount = 0;
		
		����forʵ��
		//����1-100
		for(int i=1; i<=100; i++){
			//�жϵ�ǰi����������ż��
			if(i%2==0){
				doubleCount++;
			}else{
				singleCount++;
			}
		}
		System.out.println("1-100֮�������������"+singleCount);
		System.out.println("1-100֮���ż��������"+doubleCount);
		
		//��whileʵ��
		int i = 1;
		while(i<=100){
			//�жϵ�ǰi����������ż��
			if(i%2==0){
				doubleCount++;
			}else{
				singleCount++;
			}
			i++;
		}
		System.out.println("1-100֮�������������"+singleCount);
		System.out.println("1-100֮���ż��������"+doubleCount);
		*/
		
		//һ����5��Ǯ��ʲôʱ���ܹ�1024��Ǯ
		/*��forѭ��ʵ��
		int count=0;
		for(; count*5<1024; count++);*/
		//��whileѭ��
		int count = 0;
		while(count*5<1024){
			count++;
		}
		System.out.println("����"+count+"�Σ�һ������"+count*5+"ԪǮ");
	}
}
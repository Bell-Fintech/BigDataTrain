/*
���Ҹ߶ȣ�48m����������һ���㹻���ֽ�ţ����Ϊ��0.12m��
���ʣ����۵����ٴΣ��Ϳ��Ա�֤��Ȳ����ڽ��ҵĸ߶�?

48m=48000mm
0.12m=120mm

������0
������floor
��ȣ�����*120
��һ�εĲ�������ǰһ�εĲ���*2

*/
class WhileTest{
	public static void main(String[] args){
	float i=0.12f;
	int count=0;
	while(i<48.0){
		count++;
		i*=2;
	}
	System.out.println("�۵�"+count+"�Σ����Ϊ��"+i);
	
		//�۵�����
		int count1 = 0;
		//����
		int floor = 1;
		while(floor*120<48000){
			count1++;
			floor *= 2;
		}
		System.out.println("����"+count1+"���۵������յĺ���ǣ�"+floor*120);//����9���۵������յĺ���ǣ�61440
	
}
}
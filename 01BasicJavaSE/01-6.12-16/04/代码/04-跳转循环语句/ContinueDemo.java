/*
continue����������������ѭ����ֱ�ӿ�ʼ�´�ѭ��
	����ʹ����for,while,do...while�����
	ע������뿪ʹ�ó���û���κ�����
*/
class ContinueDemo{
	public static void main(String[] args){
		/*continue;//continue �� loop �ⲿ
		for(int i=1; i<=10; i++){
			//��i==3��ʱ��continueһ��
			if(i==3){
				continue;
			}
			System.out.println(i);
		}
		*/
		
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//�����ڿ���̨���2��:��Java�����ࡰ
				//break;
				//�����ڿ���̨���7��:��Java�����ࡰ
				//continue;
				//�����ڿ���̨���13��:��Java�����ࡰ	
				System.out.println("Java������");
			}
			System.out.println("Java������");
		}
		
		
		
	}
}
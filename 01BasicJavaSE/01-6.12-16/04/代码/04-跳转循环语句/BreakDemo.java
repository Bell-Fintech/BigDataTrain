/*ѧ������Ϊֹ��������ѭ�������дﵽĳһ������ʱ��ͽ���ѭ������ôʵ���أ�Ϊ��ʵ���������Java���ṩ��break��continue��return��ʵ�ֿ���������ת���жϡ�
break��������ǰ��ѭ�����
	�ж�while��for��do...while��switch���
	ע�����break�뿪ʹ�ó���û���κε�����
continue ����
return ���� 
*/
class BreakDemo{
	public static void main(String[] args){
		//break;// �� switch �� loop �ⲿ�ж�
		//��ӡ1-10��ֵ
		for(int i=1; i<=10; i++){
			//��i����3��ʱ��breakһ��
			if(i==3){
				break;
			}
			System.out.println(i);
		}
		System.out.println("over");
	}
}
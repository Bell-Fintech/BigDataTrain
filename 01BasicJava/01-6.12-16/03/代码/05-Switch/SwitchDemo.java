/*
ѡ��ṹswitch��䣺
	switch(���ʽ){
		case ����ֵ1:
			�����1;
			break;
		case ����ֵ2:
			�����2;
			break;
		case ����ֵ3:
			�����3;
			break;
		default:
			�����n+1;
			break;
	}
	��ʽ������
		switch����һ���ؼ��֣������֧���
		���ʽ������ȡֵΪbyte,short,int,long,char,String��JDK1.7��
		case����ƥ�����˼���ǽ����ʽ��ֵ�ͺ���ĳ���ֵ����ƥ���
		����壺������һ�����߶������
		break���ǽ���switch���
		default�������е�case����ƥ��ʱ����ִ��default��������
	ִ�����̣�
		���ȼ�������ʽ��ֵ��Ȼ���case�����һһƥ�䣬һ��ƥ��ɹ��ͻ�ִ�ж�Ӧ������壻�����е�case����ƥ��ʱ����defaultʱ��
		��ô�ͻ�ִ��default���������壬���default�����൱��if��������else
	ע�����
		case�������ֻ���ǳ���ֵ�������Ǳ���
		break����ʡ����
			���Եģ�����ʡ��֮��switch��䲻������������������ִ�е��µ���һ��case��������
		default����ʡ����
			�ǿ��Եģ�����㲻��ҪĬ��ֵʱ�Ϳ���ʡ��
		default��case��˳�������������
			��������
		switch����ʱ������
			������breakʱ
			�Զ�ִ�е�����ĩβ
	���ݼ���¼�����ֵ1��2��3����7�����Ӧ������һ�����ڶ����������������ա�
*/
import java.util.Scanner;
class SwitchDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������(1-7)��");
		int week = sc.nextInt();
		int i = 1;
		switch(week){
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;	
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("����������ڲ�����");
				break;
			case 1://��Ҫ�������ʽ
				System.out.println("����һ");
				break;
		}
	}
}
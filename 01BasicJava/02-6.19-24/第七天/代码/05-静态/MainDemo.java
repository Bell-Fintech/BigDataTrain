/*
public����ʾ����Ȩ���㹻��
static����ʾmain�����Ǿ�̬�ģ�����JVM�ĵ���
void����ʾJVM����Ҫ����ֵ
main������һ���ؼ��֣�������һ�����ⵥ�ʣ���JVMʶ��
String[] args���������ڼ���¼�����ݵģ�����ʹ��Scanner������
main��������Ĵ����ž���JVMҪִ�еĴ��룬Ҳ���ǳ������ڣ�������Ҫ��JVMִ�еĴ���ͷ��ڴ���������
*/
class MainDemo{
	public static void main(String[] args){
		System.out.println(args.length);
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
	}
}
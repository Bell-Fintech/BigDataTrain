/*
������֮��Ĺ�ϵ��
	�̳й�ϵ�����̳У����ܶ�̳У����Զ��̳�
����ӿڣ�
	ʵ�ֹ�ϵ����ʵ�֣���ʵ�֣����ʵ�֣��������ڼ̳�һ�����ͬʱʵ�ֶ���ӿ�
�ӿ���ӿڣ�
	�̳й�ϵ�����̳У���̳У����̳�
*/
interface Inter{}
interface Inter2 extends Inter,Inter3{}
interface Inter3{}
class Test2{}
class Test extends Test2 implements Inter,Inter2,Inter3{}
import java.util.Scanner;
class MonthTest1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String month=sc.nextLine();
		switch(month){
			case "����":
				System.out.println("3-5��");
				break;
			case "�ļ�":
				System.out.println("6-8��");
				break;
			case "�＾":
				System.out.println("9-11��");
				break;
			case "����":
				System.out.println("12-2��");
				break;
			default:
				System.out.println("������Ч");
		}
	}
}
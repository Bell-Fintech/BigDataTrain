class XunHuanTest{
	public static void main(String[] args){
		//�����һ��4��5�е�����(*)ͼ��
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		//�ڿ���̨����žų˷���
		/*
		1x1=1
		1x2=2   2x2=4
		1x3=3   2x3=6   3x3=9
		*/
		for(int i=1;i<10;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"	");
			}
			System.out.println();
		}
	}
}
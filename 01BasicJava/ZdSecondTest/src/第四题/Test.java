package 第四题;
//一球从100米高度自由落下，每次落地后反跳回原高度的一半；
//再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
public class Test {
	public static void main(String[] args) {
		 //定义2个变量,h代表高度,s是经过的路程
        double h = 100, count = 100;           //第一次落地：经过100米
        for (int i = 0; i < 9; i++){                //第二次落地开始，循环9次
                count = count + h;        			//一次落地=下+上，路程=2*反弹高度  所以先+后／2
                h = h / 2;             //本次开始反弹高度
        }
        System.out.println("经过：" + count+"米");
        System.out.println("反弹高度：" + h / 2+"米");//第n次反弹 ／2   因为第一次不反弹
}
}

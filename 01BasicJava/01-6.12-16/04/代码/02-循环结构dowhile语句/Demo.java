/*
循环结构：for语句，while语句，do...while语句
for语句和while语句：它们的循环体语句想要被执行，只要在判断条件返回结果为true的时候才能够被执行
do...while语句：循环体语句至少可以被执行一次

for语句：更适合做固定范围内的循环
while语句：更合适做未知数的求解
do...while语句：更适合循环体语句至少被执行一次的场景

死循环：
	while(true){}
	for(;;){}
*/
class Demo{
	public static void main(String[] args){
		/*int y= 3;
		do {
			System.out.println("你们喜欢凤姐");
			y++;
		}while(y<3);*/

		int y = 3;
		while(y<3) {
			System.out.println("我喜欢刘亦菲");
			y++;
		}

	}
}
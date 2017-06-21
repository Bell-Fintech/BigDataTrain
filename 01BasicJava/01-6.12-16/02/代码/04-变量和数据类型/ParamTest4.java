//byte  by = 130;有没有问题?有问题如何解决?结果是多少呢?
class ParamTest4{
	public static void main(String[] args){
		byte by = (byte)130;//不兼容的类型: 从int转换到byte可能会有损失
		System.out.println(by);//-126
	}
}
/*
输出语句会将by转换成原码然后再转换成十进制进行输出

130的补码：00000000 00000000 00000000 10000010

截取之后的补码：10000010
反码：10000001
原码：11111110=-126
*/
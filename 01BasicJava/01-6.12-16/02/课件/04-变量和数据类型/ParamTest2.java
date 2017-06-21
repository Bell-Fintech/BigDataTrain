/*
思考题1：请问下面这个有没有问题
	double d = 12.345;
	float f = d;
		
思考题2：看看下面两个定义有没有区别呢?
	float f1 = (float)12.345;
	float f2 = 12.345f;
*/
class ParamTest2{
	public static void main(String[] args){
		//思考题1：请问下面这个有没有问题
		//double d = 12.345;
		//float f = (float)d;// 不兼容的类型: 从double转换到float可能会有损失
		
		//思考题2：看看下面两个定义有没有区别呢?
		float f1 = (float)12.345;//首先在内存中开辟8个字节存储12.345，然后再开辟一个4个字节的空间截取12.345
		float f2 = 12.345f;//直接开辟4个字节的空间存放12.345
	}
}
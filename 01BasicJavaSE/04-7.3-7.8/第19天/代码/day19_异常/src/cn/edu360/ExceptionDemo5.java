package cn.edu360;

import java.rmi.activation.ActivationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * 	子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类。
	如果父类抛出了多个异常,子类重写父类时,只能抛出相同的异常或者是他的子集,子类不能抛出父类没有的异常
	如果被重写的方法没有异常抛出,那么子类的方法绝对不可以抛出异常,如果子类方法内有异常发生,那么子类只能try,不能throws

 */
public class ExceptionDemo5 {

	public static void main(String[] args) {
		
	}

}
class Father{
	public void show()throws ActivationException,ParseException{
		
	}
	
	public void run(){
		
	}
}
class SonException extends ActivationException{}
class Son2Exception extends SonException{}

class Son extends Father{
	//子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类。
	/*@Override
	public void show() throws UnknownObjectException,ParseException  {
	
	}*/
	
	//如果父类抛出了多个异常,子类重写父类时,只能抛出相同的异常或者是他的子集,子类不能抛出父类没有的异常
	/*@Override
	public void show() throws  SonException,Son2Exception,BrokenBarrierException{
	}*/
	
	//如果被重写的方法没有异常抛出,那么子类的方法绝对不可以抛出异常,如果子类方法内有异常发生,那么子类只能try,不能throws
	@Override
	public void run()  {
		try {
			new SimpleDateFormat().parse("");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

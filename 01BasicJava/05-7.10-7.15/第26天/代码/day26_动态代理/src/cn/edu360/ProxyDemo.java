package cn.edu360;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo {
	public static void main(String[] args) {
		StudentTableDao dao = new StudentTableDao();
		// dao.create();
		// dao.delete();
		// dao.update();
		// dao.select();
		
		//现在我要找一个代理给我实现检查权限和记录日志的功能
		/*
		 * public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序
		 * 
		 * 	loader - 定义代理类的类加载器
			interfaces - 代理类要实现的接口列表
			h - 指派方法调用的调用处理程序
		 */
		//返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序
		InvocationHandler h = new MyInvocationHandler(dao);
		Object obj = Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), h );
		// TableInter ti = (TableInter)obj;
		// ti.create();
		// ti.delete();
		// ti.update();
		// ti.select();
		TestInter ti = (TestInter)obj;
		ti.Test("哈哈，测试");
	}
}
class MyInvocationHandler implements InvocationHandler{
	 private Object obj;

	public MyInvocationHandler(Object obj) {
		 this.obj = obj;
	}
	
	//proxy - 在其上调用方法的代理实例
	//method - 对应于在代理实例上调用的接口方法的 Method 实例
	//args - 运行method方法的参数
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("检查权限");
		Object object = method.invoke(obj, args);//才是我们真正执行的方法
		System.out.println("记录日志");
		System.out.println("----------------------------");
		return object;//将方法执行的结果进行返回
	}
}

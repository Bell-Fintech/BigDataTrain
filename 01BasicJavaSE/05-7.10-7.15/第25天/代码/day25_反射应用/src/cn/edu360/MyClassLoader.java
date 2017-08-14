package cn.edu360;

public class MyClassLoader extends ClassLoader {
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		try {
			//解密字节文件
			byte[] byteArray = ClassLoaderUtils.XORClass(name);
			
			//将字节数组转换成字节码文件对象
			//protected final Class<?> defineClass(String name,byte[] b, int off,int len)
			return defineClass(null, byteArray, 0, byteArray.length);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
}

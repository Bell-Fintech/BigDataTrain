package cn.edu360;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 序列化：就是把java对象转换成字节序列
 * 反序列化：把字节序列转换成java对象
 * java中的序列化的使用场景：当两个java程序想进行对象的传递时，发送方可以将java对象转换成字节在网络上传输；接收方法将接收到的字节转换成对象
 * 
 * 注意：想要被序列化的对象的类必须实现Serializable接口
 * 
 * ObjectOutputStream 将 Java 对象的基本数据类型和图形写入 OutputStream
 * public ObjectOutputStream(OutputStream out)创建写入指定 OutputStream 的 ObjectOutputStream
 * 
 * 对象中的被transient修饰的成员变量不能被实例化
 */
public class Demo {
	public static void main(String[] args) {
		// java序列化
		 //objectToFile();
		//java反序列化
		fileToObject();
	}

	private static void fileToObject() {
		// ObjectInputStream 对以前使用 ObjectOutputStream 写入的基本数据和对象进行反序列化
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/person.txt"))) {
			//public final Object readObject()从 ObjectInputStream 读取对象
			Object obj = ois.readObject();
			System.out.println(obj);
			Person p = (Person)obj;
			p.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void objectToFile() {
		// public ObjectOutputStream(OutputStream out)创建写入指定 OutputStream
		// 的ObjectOutputStream
		Person p = new Person("张三", 18, '男');
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/person.txt"));) {
			oos.writeObject(p);
			System.out.println("序列化成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

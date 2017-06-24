/*
1.看程序写结果（先判断有没有问题，如果没有，写出结果）
向上转型：两个类之间需要存在子父类关系
	从子到父
	父类引用指向子类对象
向下转型：想要强转的类型必须是在堆内存中存在的对象类型一致
	从父到子
	将父类引用转成子类引用
*/
class Fu{
	public void show(){
		System.out.println("fu show");
	}
}

class Zi extends Fu{
	public void show(){
		System.out.println("zi show");
	}

	public void method(){
		System.out.println("zi method");
	}
}
class Zi2 extends Fu{
	
}
class DuoTaiTest{
	public static void main(String[] args){
		//子类特有的方法，用父类引用无法访问
		Fu f = new Zi();
		Zi z = (Zi)f;
		z.method();
	}
}
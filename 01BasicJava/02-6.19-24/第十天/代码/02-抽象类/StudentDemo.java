package nuc.sw.zd.ten;

import javax.sound.midi.VoiceStatus;

class StudentDemo {
    public static void main(String[] args){
    	show(new StudentZhang());
    }
    public static void show(Student s){
    	s.study();
    	s.eat();
    }
}
abstract class Student{
	   private String name;
	   private int age;
	   private int classNum;
	   public Student(){}
	   public Student(String name,int age,int classNum){
		   this.name=name;
		   this.age=age;
		   this.classNum=classNum;
	   }
	   public abstract void study();
	   public abstract void eat();
	   
	   public void setName(String name){
		   this.name=name;
	   }
	   public String getName(){
		   return name;
	   }
	  public void setAge(int age){
		  this.age=age;
	  }
	  public int setAge(){
		  return age;
	  }
	  public void setClassNum(int classNum){
		  this.classNum=classNum;
	  }
	  public int getClassNum(){
		  return classNum;
	  }
	  public void show(){
			System.out.println("name="+name+",age="+age+",classNum"+classNum);
		}
}
class StudentZhang extends Student{
	public  StudentZhang(){
		super("zd", 20, 1);
	}
	public void study(){
		System.out.println("学习大数据课程");
	}
	public void eat(){
		System.out.println("喝粥");
	}
}

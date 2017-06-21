class GroupDemo{
   public static void main(String[] args){
	Group g1=new Group();
	g1.name="zd";
	g1.age=20;
	g1.study();
	}
}
class Group{
  public String name;
  public int age;
  public void study(){
	System.out.println("Ò»ÆðÑ§Ï°");  
  }
  public void print(){
	System.out.println("name="+name+",age="+age);
  }
	
}
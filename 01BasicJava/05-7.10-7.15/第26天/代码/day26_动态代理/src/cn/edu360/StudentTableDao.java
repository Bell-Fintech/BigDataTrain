package cn.edu360;

public class StudentTableDao implements TableInter,TestInter {

	@Override
	public void create() {
		
		System.out.println("增加学生");
		
	}

	@Override
	public void delete() {
		System.out.println("删除学生");

	}

	@Override
	public void update() {
		System.out.println("更新学生信息");

	}

	@Override
	public void select() {
		System.out.println("查询学生信息");

	}

	@Override
	public void Test(String msg) {
		System.out.println(msg);
	}

}

package cn.edu360;

//每一个数据表的DAO都需要实现这个接口，这个接口强制定义了四个方法：CRUD
public interface TableInter {
	void create();
	void delete();
	void update();
	void select();
}

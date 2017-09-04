package zd.dao;

import zd.model.Items;

public abstract class baseDao<T> {
	abstract int deleteByPrimaryKey(Integer id);

    abstract int insert(T t);

    abstract int insertSelective(T t);

    abstract Items selectByPrimaryKey(Integer id);

    abstract int updateByPrimaryKeySelective(T t);

    abstract int updateByPrimaryKey(T t);
	
}

package zd.dao;

import zd.model.Items;
import zd.model.User;

public abstract class UserDao<T> extends baseDao{

	@Override
	int deleteByPrimaryKey(Integer id) {
		return 0;
	}

	int insert(User user) {
		return 0;
	}

	int insertSelective(User user) {
		return 0;
	}

	@Override
	Items selectByPrimaryKey(Integer id) {
		return null;
	}

	int updateByPrimaryKeySelective(User user) {
		return 0;
	}

	int updateByPrimaryKey(User user) {
		return 0;
	}

}

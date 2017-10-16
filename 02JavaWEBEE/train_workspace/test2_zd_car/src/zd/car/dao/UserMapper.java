package zd.car.dao;

import java.util.List;

import zd.car.base.BaseDao;
import zd.car.base.Page;
import zd.car.bean.User;
import zd.car.vo.LoginVo;

public interface UserMapper extends BaseDao<User>{

	User findUserByLoginNameAndPassword(LoginVo vo);

	User findUserByLoginName(String loginName);

	User findUserByPhone(String phone);

	User findUserByEmail(String email);

	User findUserByLoginNameAndEmail(User user);

	List<User> findByPageQuery(Page<User> page);

	int findTotalRowsByPageQuery(Page<User> page);
	
}
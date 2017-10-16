package zd.car.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import zd.car.base.Page;
import zd.car.bean.Menu;
import zd.car.service.MenuService;
@Service
public class MenuServiceImpl implements MenuService {

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Menu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Menu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Menu selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Menu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Menu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Menu> findByPageQuery(Page<Menu> page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findTotalRowsByPageQuery(Page<Menu> page) {
		// TODO Auto-generated method stub
		return 0;
	}

}

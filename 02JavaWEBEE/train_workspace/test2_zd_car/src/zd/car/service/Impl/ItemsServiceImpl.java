package zd.car.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import zd.car.base.Page;
import zd.car.bean.Items;
import zd.car.dao.ItemsMapper;
import zd.car.service.ItemsService;
@Service
public class ItemsServiceImpl implements ItemsService {
	
	@Resource
	private ItemsMapper itemsMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Items t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Items t) {
		// TODO Auto-generated method stub
		return itemsMapper.insertSelective(t);
	}

	@Override
	public Items selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return itemsMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Items t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Items t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Items> findByPageQuery(Page<Items> page) {
		// TODO Auto-generated method stub
		return itemsMapper.findByPageQuery(page);
	}

	@Override
	public int findTotalRowsByPageQuery(Page<Items> page) {
		// TODO Auto-generated method stub
		return itemsMapper.findTotalRowsByPageQuery(page);
	}

}
package cn.edu360.sm.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.edu360.sm.dao.ItemsMapper;
import cn.edu360.sm.model.Items;
import cn.edu360.sm.service.ItemsService;
import cn.edu360.sm.util.MybatisUtil;
import cn.edu360.sm.vo.ItemsVo;

public class ItemsServiceImpl implements ItemsService {

	@Override
	public List<Items> findItemsByVo(ItemsVo vo) {
		 SqlSession session=MybatisUtil.getFactory().openSession();
		 ItemsMapper daili=session.getMapper(ItemsMapper.class);
		 return daili.findItemsByVo(vo);
		 
	}

	@Override
	public List<Items> findItemsByCart(String ids) {
		 SqlSession session=MybatisUtil.getFactory().openSession();
		 ItemsMapper daili=session.getMapper(ItemsMapper.class);
		 return daili.findItemsByCart(ids);
	}

	@Override
	public Items findItemsById(int id) {
		SqlSession session=MybatisUtil.getFactory().openSession();
		 ItemsMapper daili=session.getMapper(ItemsMapper.class);
		  return daili.selectByPrimaryKey(id);
		
	}

	@Override
	public void updateItemsBySelective(Items items) {
		SqlSession session=MybatisUtil.getFactory().openSession();
		ItemsMapper daili=session.getMapper(ItemsMapper.class);
		daili.updateByPrimaryKeySelective(items);
		session.commit();
		
	}

	@Override
	public void insertBySelective(Items items) {
		SqlSession session=MybatisUtil.getFactory().openSession();
		ItemsMapper daili=session.getMapper(ItemsMapper.class);
		daili.insertSelective(items);
		session.commit();
	}

}

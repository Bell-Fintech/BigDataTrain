package zd.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import zd.dao.ItemsDao;
import zd.model.Items;
import zd.service.ItemsService;
import zd.util.MybatisUtil;
import zd.vo.ItemsVo;

public class ItemsServiceImpl implements ItemsService {

	@Override
	public List<Items> findItemsByVo(Items vo) {
		SqlSession session=MybatisUtil.getFactory().openSession();
		ItemsDao itemsDao=session.getMapper(ItemsDao.class);
		return itemsDao.findItemsByVo(vo);
	}

	@Override
	public void deleteItemsByIds(ItemsVo vo) {
		SqlSession session=MybatisUtil.getFactory().openSession();
		ItemsDao itemsDao=session.getMapper(ItemsDao.class);
		itemsDao.deleteItemsByIds(vo);
		session.commit();
	}

}

package zd.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import zd.dao.ItemsMapper;
import zd.model.Items;
import zd.service.ItemsService;
import zd.util.MybatisUtil;
import zd.vo.ItemsVo;

public class ItemsServiceImpl implements ItemsService {

	@Override
	public List<Items> findItemsByVo(ItemsVo vo) {
		SqlSession session = MybatisUtil.getFactory().openSession();
		ItemsMapper daili = session.getMapper(ItemsMapper.class);
		return daili.findItemsByVo(vo);
	}

	@Override
	public List<Items> findItemsByCart(String ids) {
		SqlSession session = MybatisUtil.getFactory().openSession();
		ItemsMapper daili = session.getMapper(ItemsMapper.class);
		return daili.findItemsByCart(ids);
	}

}

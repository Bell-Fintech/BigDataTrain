package zd.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import zd.dao.OrdersMapper;
import zd.model.Orders;
import zd.service.OrdersService;
import zd.util.MybatisUtil;
import zd.vo.OrdersVo;

public class OrdersServiceImpl implements OrdersService {

	@Override
	public List<Orders> findOrdersAndItemsAndPost(OrdersVo vo) {
		SqlSession session = MybatisUtil.getFactory().openSession();
		OrdersMapper ordersMapper = session.getMapper(OrdersMapper.class);
		return ordersMapper.findOrdersAndItemsAndPost(vo);
	}

}

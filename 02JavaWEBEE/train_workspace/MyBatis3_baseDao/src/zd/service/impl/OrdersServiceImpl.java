package zd.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import zd.dao.OrdersMapper;
import zd.model.Orders;
import zd.service.OrdersService;
import zd.util.MybatisUtil;

public class OrdersServiceImpl implements OrdersService {

	@Override
	public List<Orders> findAllOrdersAndItemsAndPost() {
		SqlSession session=MybatisUtil.getFactory().openSession();
		OrdersMapper daili=session.getMapper(OrdersMapper.class);
		return daili.findAllOrdersAndItemsAndPost();
	}

}

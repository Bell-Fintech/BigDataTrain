package cn.edu360.sm.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.edu360.sm.dao.OrdersMapper;
import cn.edu360.sm.model.Orders;
import cn.edu360.sm.service.OrdersService;
import cn.edu360.sm.util.MybatisUtil;
import cn.edu360.sm.vo.OrdersItemsVo;
import cn.edu360.sm.vo.OrdersVo;

public class OrdersServiceImpl implements OrdersService {

	@Override
	public List<Orders> findOrdersAndItemsAndPost(OrdersVo vo) {
		SqlSession session=MybatisUtil.getFactory().openSession();
		OrdersMapper ordersMapper=session.getMapper(OrdersMapper.class);
		return ordersMapper.findOrdersAndItemsAndPost(vo);
	}

	@Override
	public void insertOrdersBySelective(Orders orders) {
		SqlSession session=MybatisUtil.getFactory().openSession();
		OrdersMapper ordersMapper=session.getMapper(OrdersMapper.class);
		ordersMapper.insertSelective(orders);
		session.commit();
		
	}

	@Override
	public void insertOrdersItemsRelation(OrdersItemsVo vo) {
		SqlSession session=MybatisUtil.getFactory().openSession();
		OrdersMapper ordersMapper=session.getMapper(OrdersMapper.class);
		ordersMapper.insertOrdersItemsRelation(vo);
		session.commit();
		
	}

}

package cn.edu360.sm.service;

import java.util.List;

import cn.edu360.sm.model.Orders;
import cn.edu360.sm.vo.OrdersItemsVo;
import cn.edu360.sm.vo.OrdersVo;

public interface OrdersService {
	public List<Orders> findOrdersAndItemsAndPost(OrdersVo vo);
	public void insertOrdersBySelective(Orders orders);
	public void insertOrdersItemsRelation(OrdersItemsVo vo);

}

package zd.service;

import java.util.List;

import zd.model.Orders;
import zd.vo.OrdersVo;

public interface OrdersService {
	public List<Orders> findOrdersAndItemsAndPost(OrdersVo vo);
}

package zd.dao;

import java.util.List;

import zd.model.Orders;
import zd.vo.OrdersVo;

public interface OrdersDao {
	public List<Orders> findOrdersByVo(OrdersVo vo);
	public List<Orders> findAllOrdersAndUser();
	public List<Orders> findAllOrdersAndItemsAndPosts();
}

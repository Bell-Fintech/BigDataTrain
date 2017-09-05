package zd.dao;

import java.util.List;

import zd.base.BaseDao;
import zd.model.Orders;

public interface OrdersMapper extends BaseDao<Orders> {
	public List<Orders> findAllOrdersAndItemsAndPost();
}
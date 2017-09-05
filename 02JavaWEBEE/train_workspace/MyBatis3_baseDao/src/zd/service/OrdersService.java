package zd.service;

import java.util.List;

import zd.model.Orders;

public interface OrdersService {
	public List<Orders> findAllOrdersAndItemsAndPost();

}

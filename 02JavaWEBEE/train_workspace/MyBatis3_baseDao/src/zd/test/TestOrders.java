package zd.test;

import java.util.List;

import zd.model.Orders;
import zd.service.OrdersService;
import zd.service.impl.OrdersServiceImpl;

public class TestOrders {

	public static void main(String[] args) {
		OrdersService ordersService=new OrdersServiceImpl();
		List<Orders> ordersList=ordersService.findAllOrdersAndItemsAndPost();
		for(Orders orders:ordersList){
			System.out.println(orders);
		}

	}

}

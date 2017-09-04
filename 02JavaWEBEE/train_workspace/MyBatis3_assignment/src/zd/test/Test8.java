package zd.test;

import java.util.List;


import zd.model.Orders;
import zd.service.OrdersService;
import zd.service.impl.OrdersServiceImpl;

public class Test8 {
	public static void main(String[] args) {
		OrdersService ordersService=new OrdersServiceImpl();
		List<Orders> list=ordersService.findAllOrdersAndItemsAndPosts();
		for(Orders orders:list){
			System.out.println(orders);
		}

	}
}

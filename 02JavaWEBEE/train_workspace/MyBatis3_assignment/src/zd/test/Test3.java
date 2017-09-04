package zd.test;

import java.util.List;

import org.junit.Test;

import zd.model.Items;
import zd.model.Orders;
import zd.service.OrdersService;
import zd.service.impl.OrdersServiceImpl;
import zd.vo.OrdersVo;

public class Test3 {
   @Test
   public void test(){
	   OrdersService ordersService=new OrdersServiceImpl();
	   OrdersVo vo=new OrdersVo();
	   /*Orders orders=new Orders();
	   orders.setOrders_id(1);
	   vo.setOrders(orders);*/
	   Items items=new Items();
	   items.setItems_name("iphone");
	   items.setPrice("3000");
	   vo.setItems(items);
	  
	   List<Orders> list=ordersService.findOrdersByVo(vo);
	   System.out.println(list);
	   
   }
   
   
   

}

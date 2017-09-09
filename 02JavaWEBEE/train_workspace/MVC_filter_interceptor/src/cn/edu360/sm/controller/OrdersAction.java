package cn.edu360.sm.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu360.sm.model.Orders;
import cn.edu360.sm.model.User;
import cn.edu360.sm.service.OrdersService;
import cn.edu360.sm.service.impl.OrdersServiceImpl;
import cn.edu360.sm.vo.OrdersItemsVo;
import cn.edu360.sm.vo.OrdersVo;

@Controller
public class OrdersAction {
	/**
	 * springmvc提供了参数绑定的机制，如果参数的名字和对象的属性名一样，
	 * 就会自动绑定到对象的属性当中
	 */
	
   @RequestMapping("/ordersList.shtml")
   public String ordersList(OrdersVo vo,HttpSession session,Model model){
	   if(vo==null){
		   vo=new OrdersVo();
	   }
	   User user=(User)session.getAttribute("user");
	   vo.setUserId(user.getUserId());
	   //查询用户的订单以及商品、收货人等信息
	   OrdersService ordersService=new OrdersServiceImpl();
	   List<Orders> ordersList=ordersService.findOrdersAndItemsAndPost(vo);
	   model.addAttribute("ordersList", ordersList);
	   model.addAttribute("vo", vo);
	   return "ordersList";
   }
   
   /**
    * 生成订单
 * @throws Exception 
    */
   @RequestMapping("/addOrders.shtml")
   public void addOrders(String id,HttpServletResponse response,HttpSession session,HttpServletRequest request,String post) throws Exception{
	   id=id.substring(0, id.length()-1);
	   String[] ids=id.split(",");
	   //先插入一条订单记录，再插入多条订单商品关系表的记录.
	   User user=(User)session.getAttribute("user");
	   int userId=user.getUserId();
	   Orders orders=new Orders();
	   orders.setUserId(userId);
	   orders.setStatus(1);
	   orders.setCount(ids.length);
	   orders.setPostId(Integer.parseInt(post));
	   OrdersService ordersService=new OrdersServiceImpl();
	   ordersService.insertOrdersBySelective(orders);
	   //插入订单商品关系表
	   for(String s:ids){
		   //创建vo对象
		   OrdersItemsVo vo=new OrdersItemsVo();
		   vo.setOrdersId(orders.getOrdersId());
		   vo.setItemsId(Integer.parseInt(s));
		   ordersService.insertOrdersItemsRelation(vo);
	   }
	   //清除已购买商品的cookie
	   Cookie[] cookies=request.getCookies();
		if(cookies!=null){
			for(int i=0;i<cookies.length;i++){
				 for(String s:ids){
					 String key="items"+s;
					 if(key.equals(cookies[i].getName())){
						 cookies[i].setMaxAge(0);
						 response.addCookie(cookies[i]);
					 }
				 }
			}
		}
	   response.getWriter().write("1");
	      
   }
}

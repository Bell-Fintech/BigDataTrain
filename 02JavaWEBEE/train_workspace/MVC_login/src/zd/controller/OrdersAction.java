package zd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zd.model.Orders;
import zd.model.User;
import zd.service.OrdersService;
import zd.service.impl.OrdersServiceImpl;
import zd.vo.OrdersItemsVo;
import zd.vo.OrdersVo;

@Controller
public class OrdersAction {
	/**
	 * springmvc提供了参数绑定的机制，如果参数的名字和对象的属性名一样， 就会自动绑定到对象的属性当中
	 */
	@RequestMapping("/ordersList.shtml")
	public String ordersList(OrdersVo vo, HttpSession session, Model model) {
		if (vo == null) {
			vo = new OrdersVo();
		}
		User user = (User) session.getAttribute("user");
		System.out.println("++" + user);
		vo.setUserId(user.getUserId());
		// 查询用户的订单以及商品、收货人等信息
		OrdersService ordersService = new OrdersServiceImpl();
		List<Orders> ordersList = ordersService.findOrdersAndItemsAndPost(vo);
		model.addAttribute("ordersList", ordersList);
		model.addAttribute("vo", vo);
		return "ordersList";
	}

	@RequestMapping("/addOrders.shtml")
	// ajax中的参数和这里参数一致
	public void addOrders(String id, HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String post) throws IOException {
		id = id.substring(0, id.length() - 1);
		String[] ids = id.split(",");
		User user = (User) session.getAttribute("user");
		int userId = user.getUserId();
		Orders orders = new Orders();
		orders.setUserId(userId);
		orders.setStatus(1);
		orders.setCount(id.length());
		orders.setPostId(Integer.parseInt(post));
		OrdersService orderService = new OrdersServiceImpl();
		orderService.insertOrdersBySelective(orders);
		for (String s : ids) {
			OrdersItemsVo vo = new OrdersItemsVo();
			vo.setItemsId(Integer.parseInt(s));
			vo.setOrdersId(orders.getOrdersId());
			orderService.insertOrdersItemsRelation(vo);
		}
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

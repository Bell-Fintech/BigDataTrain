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
	 * springmvc�ṩ�˲����󶨵Ļ��ƣ�������������ֺͶ����������һ����
	 * �ͻ��Զ��󶨵���������Ե���
	 */
	
   @RequestMapping("/ordersList.shtml")
   public String ordersList(OrdersVo vo,HttpSession session,Model model){
	   if(vo==null){
		   vo=new OrdersVo();
	   }
	   User user=(User)session.getAttribute("user");
	   vo.setUserId(user.getUserId());
	   //��ѯ�û��Ķ����Լ���Ʒ���ջ��˵���Ϣ
	   OrdersService ordersService=new OrdersServiceImpl();
	   List<Orders> ordersList=ordersService.findOrdersAndItemsAndPost(vo);
	   model.addAttribute("ordersList", ordersList);
	   model.addAttribute("vo", vo);
	   return "ordersList";
   }
   
   /**
    * ���ɶ���
 * @throws Exception 
    */
   @RequestMapping("/addOrders.shtml")
   public void addOrders(String id,HttpServletResponse response,HttpSession session,HttpServletRequest request,String post) throws Exception{
	   id=id.substring(0, id.length()-1);
	   String[] ids=id.split(",");
	   //�Ȳ���һ��������¼���ٲ������������Ʒ��ϵ��ļ�¼.
	   User user=(User)session.getAttribute("user");
	   int userId=user.getUserId();
	   Orders orders=new Orders();
	   orders.setUserId(userId);
	   orders.setStatus(1);
	   orders.setCount(ids.length);
	   orders.setPostId(Integer.parseInt(post));
	   OrdersService ordersService=new OrdersServiceImpl();
	   ordersService.insertOrdersBySelective(orders);
	   //���붩����Ʒ��ϵ��
	   for(String s:ids){
		   //����vo����
		   OrdersItemsVo vo=new OrdersItemsVo();
		   vo.setOrdersId(orders.getOrdersId());
		   vo.setItemsId(Integer.parseInt(s));
		   ordersService.insertOrdersItemsRelation(vo);
	   }
	   //����ѹ�����Ʒ��cookie
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

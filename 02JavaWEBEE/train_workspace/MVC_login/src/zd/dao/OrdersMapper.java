package zd.dao;

import java.util.List;

import zd.model.Orders;
import zd.vo.OrdersItemsVo;
import zd.vo.OrdersVo;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer ordersId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer ordersId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
    public List<Orders> findOrdersAndItemsAndPost(OrdersVo vo);
    
    public void insertOrdersBySelective(Orders orders);
    
	public void insertOrdersItemsRelation(OrdersItemsVo vo);
}
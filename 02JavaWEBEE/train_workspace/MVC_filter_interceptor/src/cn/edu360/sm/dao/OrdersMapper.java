package cn.edu360.sm.dao;

import java.util.List;

import cn.edu360.sm.model.Orders;
import cn.edu360.sm.vo.OrdersItemsVo;
import cn.edu360.sm.vo.OrdersVo;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer ordersId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer ordersId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
    
    public List<Orders> findOrdersAndItemsAndPost(OrdersVo vo);
    
    public void insertOrdersItemsRelation(OrdersItemsVo vo);
}
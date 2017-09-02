//查询出张三丰所下的未付款订单以及购买的商品

SELECT orders.*,items.* FROM USER,orders,orders_items_relation,items
WHERE user.username='张三丰' AND orders.user_id=user.user_id AND orders.status=0 AND 
orders_items_relation.orders_id=orders.orders_id AND 
items.items_id=orders_items_relation.items_id

//查询出所有的订单以及用户信息
SELECT orders.*,user.* FROM orders,USER WHERE orders.user_id=user.user_id

//查询出购买过iphone6的订单以及用户信息
SELECT orders.*,user.* FROM items,orders_items_relation,orders,USER WHERE 
items.items_name='iphone6' AND orders_items_relation.items_id=items.items_id
AND orders.orders_id=orders_items_relation.orders_id AND user.user_id=orders.user_id
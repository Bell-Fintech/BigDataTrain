package zd.car.dao;

import java.util.List;

import zd.car.base.BaseDao;
import zd.car.base.Page;
import zd.car.bean.Items;

public interface ItemsMapper extends BaseDao<Items>{

	List<Items> findByPageQuery(Page<Items> page);

	int findTotalRowsByPageQuery(Page<Items> page);
    
}
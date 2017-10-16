package zd.car.dao;

import zd.car.base.BaseDao;
import zd.car.bean.Collections;
import zd.car.vo.CollectionVo;

public interface CollectionsMapper extends BaseDao<Collections>{

	Integer findCount(CollectionVo cv);

	Collections selectByVo(CollectionVo cv);
    
}
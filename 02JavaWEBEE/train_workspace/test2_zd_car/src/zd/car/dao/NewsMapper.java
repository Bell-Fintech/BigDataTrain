package zd.car.dao;

import java.util.List;

import zd.car.base.BaseDao;
import zd.car.base.Page;
import zd.car.bean.News;

public interface NewsMapper extends BaseDao<News>{

	List<News> findByPageQuery(Page<News> page);

	int findTotalRowsByPageQuery(Page<News> page);
    
}
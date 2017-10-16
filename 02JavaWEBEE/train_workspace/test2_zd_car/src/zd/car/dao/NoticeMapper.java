package zd.car.dao;

import java.util.List;

import zd.car.base.BaseDao;
import zd.car.base.Page;
import zd.car.bean.Notice;

public interface NoticeMapper extends BaseDao<Notice>{

	List<Notice> findByPageQuery(Page<Notice> page);

	int findTotalRowsByPageQuery(Page<Notice> page);
    
}
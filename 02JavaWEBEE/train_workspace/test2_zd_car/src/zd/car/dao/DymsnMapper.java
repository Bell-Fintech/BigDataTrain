package zd.car.dao;

import java.util.List;

import zd.car.base.BaseDao;
import zd.car.bean.Dymsn;
import zd.car.service.DymsnService;

public interface DymsnMapper extends BaseDao<Dymsn>{

	List<Dymsn> findDysmn();
     
}
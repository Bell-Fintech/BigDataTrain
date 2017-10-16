package zd.car.dao;

import java.util.List;

import zd.car.base.BaseDao;
import zd.car.bean.Prime;

public interface PrimeMapper extends BaseDao<Prime>{

	List<Prime> findAllPrime();
    
}
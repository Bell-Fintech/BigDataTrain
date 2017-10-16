package zd.car.service;

import java.util.List;

import zd.car.base.BaseService;
import zd.car.bean.Prime;

public interface PrimeService extends BaseService<Prime> {

	List<Prime> findAllPrime();

}

package zd.car.service;

import java.util.List;

import zd.car.base.BaseService;
import zd.car.bean.Dymsn;

public interface DymsnService extends BaseService<Dymsn> {

	List<Dymsn> findDysmn();

}

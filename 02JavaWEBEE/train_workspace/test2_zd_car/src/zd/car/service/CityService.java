package zd.car.service;

import java.util.List;

import zd.car.base.BaseService;
import zd.car.bean.City;

public interface CityService extends BaseService<City> {

	List<City> findAllProvinces();

	List<City> findCityByParentId(int id);

}

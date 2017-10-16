package zd.car.service;

import java.util.List;

import zd.car.base.BaseService;
import zd.car.bean.Brand;

public interface BrandService extends BaseService<Brand> {

	List<Brand> findAllBrand();

}

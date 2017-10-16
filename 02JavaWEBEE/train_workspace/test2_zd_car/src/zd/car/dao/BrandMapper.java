package zd.car.dao;

import java.util.List;

import zd.car.base.BaseDao;
import zd.car.bean.Brand;

public interface BrandMapper extends BaseDao<Brand> {

	List<Brand> findAllBrand();
    
}
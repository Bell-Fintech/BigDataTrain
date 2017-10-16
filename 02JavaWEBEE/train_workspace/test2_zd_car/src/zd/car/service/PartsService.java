package zd.car.service;

import java.util.List;

import zd.car.base.BaseService;
import zd.car.bean.Parts;

public interface PartsService extends BaseService<Parts> {

	List<Parts> findAllParts();

}

package zd.car.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import zd.car.base.Page;
import zd.car.bean.Company;
import zd.car.dao.CompanyMapper;
import zd.car.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Resource
	private CompanyMapper companyMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Company t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Company t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Company selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return companyMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Company t) {
		// TODO Auto-generated method stub
		return companyMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int updateByPrimaryKey(Company t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Company> findByPageQuery(Page<Company> page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findTotalRowsByPageQuery(Page<Company> page) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Company findCompanyByName(String companyname) {
		// TODO Auto-generated method stub
		return companyMapper.findCompanyByName(companyname);
	}

}
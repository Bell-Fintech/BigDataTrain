package zd.car.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import zd.car.base.Page;
import zd.car.bean.Notice;
import zd.car.dao.NoticeMapper;
import zd.car.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Resource
	private NoticeMapper noticeMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Notice t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Notice t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Notice selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Notice t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Notice t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Notice> findByPageQuery(Page<Notice> page) {
		// TODO Auto-generated method stub
		return noticeMapper.findByPageQuery(page);
	}

	@Override
	public int findTotalRowsByPageQuery(Page<Notice> page) {
		// TODO Auto-generated method stub
		return noticeMapper.findTotalRowsByPageQuery(page);
	}

}

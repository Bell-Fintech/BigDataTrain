package zd.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import zd.dao.PostMapper;
import zd.model.Post;
import zd.service.PostService;
import zd.util.MybatisUtil;

public class PostServiceImpl implements PostService {

	@Override
	public List<Post> findPostsByUserId(int userId) {
		SqlSession session=MybatisUtil.getFactory().openSession();
		PostMapper daili=session.getMapper(PostMapper.class);
		return daili.findPostsByUserId(userId);
	}

}

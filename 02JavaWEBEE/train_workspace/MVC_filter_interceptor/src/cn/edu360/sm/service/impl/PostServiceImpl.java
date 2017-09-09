package cn.edu360.sm.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.edu360.sm.dao.PostMapper;
import cn.edu360.sm.model.Post;
import cn.edu360.sm.service.PostService;
import cn.edu360.sm.util.MybatisUtil;

public class PostServiceImpl implements PostService {

	@Override
	public List<Post> findPostsByUserId(int userId) {
		SqlSession session=MybatisUtil.getFactory().openSession();
		PostMapper daili=session.getMapper(PostMapper.class);
		return daili.findPostsByUserId(userId);
	}

}

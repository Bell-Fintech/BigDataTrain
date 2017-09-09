package cn.edu360.sm.service;

import java.util.List;

import cn.edu360.sm.model.Post;

public interface PostService {
	public List<Post> findPostsByUserId(int userId);

}

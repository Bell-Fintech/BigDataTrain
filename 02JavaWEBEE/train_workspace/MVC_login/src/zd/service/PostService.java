package zd.service;

import java.util.List;

import zd.model.Post;

public interface PostService {
	public List<Post> findPostsByUserId(int userId);
}

package zd.dao;

import zd.model.Posts;

public interface PostsDao {
	public Posts findPostsByOrdersId(int id);
}

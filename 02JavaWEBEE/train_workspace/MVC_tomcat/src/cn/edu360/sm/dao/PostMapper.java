package cn.edu360.sm.dao;

import java.util.List;

import cn.edu360.sm.model.Post;

public interface PostMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
    
    public List<Post> findPostsByUserId(int userId);
}
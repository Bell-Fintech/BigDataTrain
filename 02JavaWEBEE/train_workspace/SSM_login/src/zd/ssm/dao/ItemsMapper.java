package zd.ssm.dao;

import zd.ssm.model.Items;

public interface ItemsMapper {
    int deleteByPrimaryKey(Integer itemsId);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(Integer itemsId);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);
}
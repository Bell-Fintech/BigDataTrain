package cn.edu360.sm.dao;

import java.util.List;

import cn.edu360.sm.model.Items;
import cn.edu360.sm.vo.ItemsVo;

public interface ItemsMapper {
    int deleteByPrimaryKey(Integer itemsId);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(Integer itemsId);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);
    
    public List<Items> findItemsByVo(ItemsVo vo);
    public List<Items> findItemsByCart(String ids);
}
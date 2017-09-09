package cn.edu360.sm.service;

import java.util.List;

import cn.edu360.sm.model.Items;
import cn.edu360.sm.vo.ItemsVo;

public interface ItemsService {
	public List<Items> findItemsByVo(ItemsVo vo);
	public List<Items> findItemsByCart(String ids);
	public Items findItemsById(int id);
	public void updateItemsBySelective(Items items);
	public void insertBySelective(Items items);

}

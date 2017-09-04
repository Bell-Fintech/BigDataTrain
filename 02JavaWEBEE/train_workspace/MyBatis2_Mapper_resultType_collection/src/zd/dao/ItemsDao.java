package zd.dao;

import java.util.List;

import zd.model.Items;
import zd.vo.ItemsVo;

public interface ItemsDao {
	public List<Items> findItemsByVo(Items vo);
	public void deleteItemsByIds(ItemsVo vo);
}

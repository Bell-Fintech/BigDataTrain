package zd.service;

import java.util.List;

import zd.model.Items;
import zd.vo.ItemsVo;

public interface ItemsService {
	public List<Items> findItemsByVo(Items vo);
	public void deleteItemsByIds(ItemsVo vo);
}

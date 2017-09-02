package zd.service;

import java.util.List;

import zd.model.Items;

public interface ItemsService {
	public List<Items> findItemsByVo(Items vo);

}

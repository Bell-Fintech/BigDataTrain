package zd.test;

import java.util.List;

import org.junit.Test;

import zd.model.Items;
import zd.service.ItemsService;
import zd.service.impl.ItemsServiceImpl;

public class Test2 {
	@Test
	public void test(){
		ItemsService itemsService=new ItemsServiceImpl();
		Items vo=new Items();
		vo.setItems_name("iphone");
		vo.setPrice("3000");
		List<Items> list=itemsService.findItemsByVo(vo);
		System.out.println(list);
	}

}

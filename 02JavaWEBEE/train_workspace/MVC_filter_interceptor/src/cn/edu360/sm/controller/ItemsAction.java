package cn.edu360.sm.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.edu360.sm.model.Items;
import cn.edu360.sm.model.Post;
import cn.edu360.sm.model.User;
import cn.edu360.sm.service.ItemsService;
import cn.edu360.sm.service.PostService;
import cn.edu360.sm.service.impl.ItemsServiceImpl;
import cn.edu360.sm.service.impl.PostServiceImpl;
import cn.edu360.sm.vo.ItemsVo;

@Controller
public class ItemsAction {
	public static final String VIS_PATH="/pic/";
	public static final String REAL_PATH="D:\\pic\\";
    // /items/itemsList.shtml
	@RequestMapping(value="/itemsList.shtml")
	public String itemsList(ItemsVo itemsVo,HttpServletRequest request){
		//查询所有商品
		ItemsService itemsService=new ItemsServiceImpl();
		List<Items> itemsList=itemsService.findItemsByVo(itemsVo);
		request.setAttribute("itemsList", itemsList);
		request.setAttribute("vo", itemsVo);
		return "itemsList";
	}
	
	@RequestMapping("/addCart.shtml")
	public String addCart(HttpServletResponse response,int id){
		 String key="items"+id;
		 String value=id+"";
		 Cookie cookie=new Cookie(key,value);
		 //如果参数是正数代表是存储在浏览器的硬盘当中，如果是负整数代表永久浏览器内存
		 cookie.setMaxAge(1000);
		 response.addCookie(cookie);
		 //将该请求交给购物车的查询的处理器
		return "redirect:cart.shtml";
	}
	/**
	 * 购物车
	 */
	@RequestMapping("/cart.shtml")
	public String cart(HttpServletRequest request,HttpSession session){
		//将请求当中所有的cookie查询到
		Cookie[] cookies=request.getCookies();
		//拼接多个id的字符串  10,13,16
		String ids="";
		if(cookies!=null){
			for(int i=0;i<cookies.length;i++){
				if(cookies[i].getName().contains("items")){
					String id=cookies[i].getValue();
					ids+=id+",";
				}
			}
		}
		List<Items> itemsList;
		if(ids!=""){
			ids=ids.substring(0, ids.length()-1);
			//调用service去查询
			ItemsService itemsService=new ItemsServiceImpl();
			 itemsList=itemsService.findItemsByCart(ids);
		}else{
			 itemsList=null;
		}
		PostService postService=new PostServiceImpl();
		User user=(User)session.getAttribute("user");
		List<Post> postList=postService.findPostsByUserId(user.getUserId());
		request.setAttribute("postList", postList);
		request.setAttribute("itemsList", itemsList);
		return "cart";
		
	}
	@RequestMapping("/delCart.shtml")
	public String delCart(HttpServletRequest request,int id,HttpServletResponse response){
		String key="items"+id;
		Cookie[] cookies=request.getCookies();
		if(cookies!=null){
			for(int i=0;i<cookies.length;i++){
				if(cookies[i].getName().equals(key)){
					//设置cookie超时
                    cookies[i].setMaxAge(0);
                    //发送该cookie，让浏览器生效
                    response.addCookie(cookies[i]);
				}
			}
		}
		return "redirect:cart.shtml";
	}
	
	@RequestMapping("/toUpdateItems.shtml")
	public String toUpdateItems(@RequestParam(value="id",required=true) int id,Model model){
		//调用service去查询一下
		ItemsService itemsService=new ItemsServiceImpl();
		Items items=itemsService.findItemsById(id);
		model.addAttribute("items", items);
		return "updateItems";
	}
	
	@RequestMapping("/updateItems.shtml")
	public String updateItems(Items items){
		ItemsService itemsService=new ItemsServiceImpl();
		itemsService.updateItemsBySelective(items);
		//如果是处理器方法之间的转发或者重定向
		return "redirect:itemsList.shtml";
	}
    //去添加商品的页面
	@RequestMapping("/toAddItems.shtml")
	public String toAddItems(){
		return "addItems";
	}
	
	//添加商品
	@RequestMapping("/addItems.shtml")
	public String addItems(MultipartFile file,Items items) throws Exception, Exception{
		/**
		 * 添加商品分为2部分
		 * 1:取到上传的图片，将图片存储到虚拟目录对应的真实物理路径下
		 * 2:调用itemsService插入一条记录到数据库
		 */
		//1:取到原文件的文件名
		String oldname=file.getOriginalFilename();
		//2:取到文件名的后缀
		String suffix=oldname.substring(oldname.lastIndexOf("."));
		//3:生成前缀(时间戳或者是uuid都可以)
		String prefix=UUID.randomUUID().toString();
		//4:组成新文件名
		String newname=prefix+suffix;
		//5:定义生成文件的路径
		String real_path=REAL_PATH+newname;
	    //6:复制过去
		file.transferTo(new File(real_path));
		//生成数据库的记录
		String vis_path=VIS_PATH+newname;
		items.setUrl(vis_path);
		ItemsService itemsService=new ItemsServiceImpl();
		itemsService.insertBySelective(items);
		return "redirect:itemsList.shtml";
	}
}

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
		//��ѯ������Ʒ
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
		 //������������������Ǵ洢���������Ӳ�̵��У�����Ǹ�������������������ڴ�
		 cookie.setMaxAge(1000);
		 response.addCookie(cookie);
		 //�������󽻸����ﳵ�Ĳ�ѯ�Ĵ�����
		return "redirect:cart.shtml";
	}
	/**
	 * ���ﳵ
	 */
	@RequestMapping("/cart.shtml")
	public String cart(HttpServletRequest request,HttpSession session){
		//�����������е�cookie��ѯ��
		Cookie[] cookies=request.getCookies();
		//ƴ�Ӷ��id���ַ���  10,13,16
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
			//����serviceȥ��ѯ
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
					//����cookie��ʱ
                    cookies[i].setMaxAge(0);
                    //���͸�cookie�����������Ч
                    response.addCookie(cookies[i]);
				}
			}
		}
		return "redirect:cart.shtml";
	}
	
	@RequestMapping("/toUpdateItems.shtml")
	public String toUpdateItems(@RequestParam(value="id",required=true) int id,Model model){
		//����serviceȥ��ѯһ��
		ItemsService itemsService=new ItemsServiceImpl();
		Items items=itemsService.findItemsById(id);
		model.addAttribute("items", items);
		return "updateItems";
	}
	
	@RequestMapping("/updateItems.shtml")
	public String updateItems(Items items){
		ItemsService itemsService=new ItemsServiceImpl();
		itemsService.updateItemsBySelective(items);
		//����Ǵ���������֮���ת�������ض���
		return "redirect:itemsList.shtml";
	}
    //ȥ�����Ʒ��ҳ��
	@RequestMapping("/toAddItems.shtml")
	public String toAddItems(){
		return "addItems";
	}
	
	//�����Ʒ
	@RequestMapping("/addItems.shtml")
	public String addItems(MultipartFile file,Items items) throws Exception, Exception{
		/**
		 * �����Ʒ��Ϊ2����
		 * 1:ȡ���ϴ���ͼƬ����ͼƬ�洢������Ŀ¼��Ӧ����ʵ����·����
		 * 2:����itemsService����һ����¼�����ݿ�
		 */
		//1:ȡ��ԭ�ļ����ļ���
		String oldname=file.getOriginalFilename();
		//2:ȡ���ļ����ĺ�׺
		String suffix=oldname.substring(oldname.lastIndexOf("."));
		//3:����ǰ׺(ʱ���������uuid������)
		String prefix=UUID.randomUUID().toString();
		//4:������ļ���
		String newname=prefix+suffix;
		//5:���������ļ���·��
		String real_path=REAL_PATH+newname;
	    //6:���ƹ�ȥ
		file.transferTo(new File(real_path));
		//�������ݿ�ļ�¼
		String vis_path=VIS_PATH+newname;
		items.setUrl(vis_path);
		ItemsService itemsService=new ItemsServiceImpl();
		itemsService.insertBySelective(items);
		return "redirect:itemsList.shtml";
	}
}

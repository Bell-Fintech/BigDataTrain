package zd.car.controller;

import java.io.File;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import zd.car.bean.Company;
import zd.car.bean.User;
import zd.car.constant.SysConstant;
import zd.car.service.CompanyService;

@Controller
@RequestMapping("/companyManage")
public class CompanyAction {
	
	@Resource
	private CompanyService companyService;
	
	@RequestMapping("/companyImgUpload.shtml")
	public String companyImgUpload(MultipartFile file,Integer picNum,Company company,HttpServletRequest request) throws Exception{
		String oldname=file.getOriginalFilename();
		String suffix=oldname.substring(oldname.lastIndexOf("."));
		long priffix=new Date().getTime();
		String newName=priffix+suffix;
		String realPath=SysConstant.REAL_PATH+newName;
		file.transferTo(new File(realPath));
		String path=SysConstant.UPLOAD_PATH+newName;
		if(picNum==1){
			company.setImg1(path);
		}else if(picNum==2){
			company.setImg2(path);
		}else{
			company.setImg3(path);
		}
		companyService.updateByPrimaryKeySelective(company);
		return "CompanyManage/companyManage";
	}
	
	@RequestMapping("/updatePic.shtml")
	public String updatePic(Integer img,HttpServletRequest request){
		request.setAttribute("picNum", img);
		return "CompanManage/updatePic";
	}
	
	@RequestMapping("/addPic.shtml")
	public String addPic(Integer img,HttpServletRequest request){
		request.setAttribute("picNum", img);
		return "CompanManage/addPic";
	}
	
	@RequestMapping("/companyManage.shtml")
	public String companyManage(HttpSession session,HttpServletRequest request){
		User user  = (User)session.getAttribute("user");
		Company company = companyService.selectByPrimaryKey(user.getCompanyId());
		request.setAttribute("company", company);
		return "CompanyManage/companyManage";
	}
	
}

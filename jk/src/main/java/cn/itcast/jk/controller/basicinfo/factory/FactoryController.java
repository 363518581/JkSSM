package cn.itcast.jk.controller.basicinfo.factory;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.jk.controller.BaseController;
import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.service.FactoryService;

@Controller
public class FactoryController extends BaseController {
	@Resource
	FactoryService factoryService;
	
	//查询
	@RequestMapping("/basicinfo/factory/list.action")
	public String list(Model model){
		List<Factory> dataList = factoryService.find(null);
		model.addAttribute("dataList", dataList);
		
		return "/basicinfo/factory/jFactoryList.jsp";
	}
	
	//转向新增页面
	@RequestMapping("/basicinfo/factory/tocreate.action")
	public String tocreate(){
		return "/basicinfo/factory/jFactoryCreate.jsp";
	}
	
	//新增保存
	@RequestMapping("/basicinfo/factory/insert.action")
	public String insert(Factory factory){
		factoryService.insert(factory);
		
		return "redirect:/basicinfo/factory/list.action";
	}
}

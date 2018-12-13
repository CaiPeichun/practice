package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.InittestService;

@Controller
public class Inittest {

	@Autowired
	private InittestService initservice;
	//测试springmvc用
	@RequestMapping("/test")
	public String test() {
		return "index";
	}
	
	//测试spring+springmvc集成（controller调用service）
	@RequestMapping("/test1")
	public String test1() {
		return initservice.test();
	}
}

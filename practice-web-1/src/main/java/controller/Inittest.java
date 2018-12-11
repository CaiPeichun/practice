package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.InittestService;

@Controller
public class Inittest {

	@Autowired
	private InittestService initservice;
	//����springmvc��
	
	@RequestMapping("/test")
	public String test() {
		return "index";
	}
	
	//����spring+springmvc���ɣ�controller����service��
	@RequestMapping("/test1")
	public String test1() {
		return initservice.test();
	}
}

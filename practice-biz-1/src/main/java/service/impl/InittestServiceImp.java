package service.impl;

import org.springframework.stereotype.Service;

import service.InittestService;

@Service
public class InittestServiceImp implements InittestService{

	public String test() {
		System.out.println("������óɹ�");
		return "index";
	}

	

}

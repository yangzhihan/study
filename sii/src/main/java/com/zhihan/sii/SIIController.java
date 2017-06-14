package com.zhihan.sii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhihan.sii.service.IUser;

@Controller("SIIController")
@RequestMapping("/con")
public class SIIController {
	
	@Autowired
	IUser iuser;
	
	
	@ResponseBody
	@RequestMapping("/getString")
	public String getString(){
		iuser.getUser();
		System.out.println("********");
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value="add")
	public String addObject(){
		iuser.addObject();
		return "add";
	}
}

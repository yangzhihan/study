package com.springboot.boot_test;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SpringBootTestController 
{
	
	private Logger logger = LoggerFactory.getLogger(SpringBootTestController.class);
	
	@Value("${spring.profiles.active}")
	private String active;
	@Value("${schema}")
	private String schema;
	
	@RequestMapping("/bootTest")
	@ResponseBody
	public String bootTest(){
		logger.info("active : " + active + ";	schema:" + schema);
		return "active : " + active + ";	schema:" + schema;
	}
}

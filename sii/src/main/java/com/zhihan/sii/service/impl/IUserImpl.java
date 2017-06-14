package com.zhihan.sii.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.zhihan.sii.dao.A1Dao;
import com.zhihan.sii.model.Sale;
import com.zhihan.sii.service.IUser;

@Service
public class IUserImpl implements IUser {

	@Autowired
	private A1Dao a1Dao;
	
	public void getUser() {
		Sale sale = a1Dao.getUser();
		System.out.println(JSONObject.toJSONString(sale));
		System.out.println("user************");

	}

//	@Transactional(propagation = Propagation.REQUIRES_NEW)
//	@Transactional(propagation = Propagation.REQUIRED)
//	@Transactional(propagation = Propagation.MANDATORY)
//	@Transactional(propagation = Propagation.SUPPORTS)
//	@Transactional(propagation = Propagation.NOT_SUPPORTED)
//	@Transactional(propagation = Propagation.NEVER)
	@Transactional(propagation = Propagation.NESTED)
	public void addObject() {
		Sale sale = new Sale();
		sale.setId(11);
		sale.setName("11");
		sale.setNumber(11);
		sale.setPrice(11);
		a1Dao.addObject(sale);
	}

}

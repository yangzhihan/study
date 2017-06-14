package com.zhihan.sii.dao;

import org.springframework.stereotype.Repository;

import com.zhihan.sii.model.Sale;

@Repository("a1Dao")
public interface A1Dao {

	public Sale getUser();
	
	public void addObject(Sale sale);
}

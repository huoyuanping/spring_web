package com.et.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et.dao.GoodDao;
import com.et.entity.Good;
import com.et.service.GoodService;
/**
 * ÒµÎñÂß¼­²ã
 * @author Administrator
 *
 */
@Service
public class GoodServiceImpl implements GoodService {
	@Autowired
	private GoodDao dao;
	public List<Good> queryGoodByName(String name) {
		if(name==null){
			name="";
		}
		return dao.queryGoodByName(name);
	}
	
	
}

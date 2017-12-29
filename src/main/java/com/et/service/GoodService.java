package com.et.service;

import java.util.List;

import com.et.entity.Good;


public interface GoodService {
	/**
	 * 根据商品名称模糊查找
	 * @param name 商品名称
	 * @return 返回商品对象
	 */
	public List<Good> queryGoodByName(String name);
	
	

}

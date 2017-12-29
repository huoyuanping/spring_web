package com.et.dao;

import java.util.List;

import com.et.entity.Good;

/**
 * 处理数据的接口
 * @author Administrator
 *
 */

public interface GoodDao {
	/**
	 * 查询所有的商品
	 * @return 返回商品对象
	 */
	public List<Good> queryAll();
	
	/**
	 * 根据商品名称模糊查找
	 * @param name 商品名称
	 * @return 返回商品对象
	 */
	
	public List<Good> queryGoodByName(String name);
	
}

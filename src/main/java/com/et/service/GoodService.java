package com.et.service;

import java.util.List;

import com.et.entity.Good;


public interface GoodService {
	/**
	 * ������Ʒ����ģ������
	 * @param name ��Ʒ����
	 * @return ������Ʒ����
	 */
	public List<Good> queryGoodByName(String name);
	
	

}

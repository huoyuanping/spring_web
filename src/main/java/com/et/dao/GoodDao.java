package com.et.dao;

import java.util.List;

import com.et.entity.Good;

/**
 * �������ݵĽӿ�
 * @author Administrator
 *
 */

public interface GoodDao {
	/**
	 * ��ѯ���е���Ʒ
	 * @return ������Ʒ����
	 */
	public List<Good> queryAll();
	
	/**
	 * ������Ʒ����ģ������
	 * @param name ��Ʒ����
	 * @return ������Ʒ����
	 */
	
	public List<Good> queryGoodByName(String name);
	
}

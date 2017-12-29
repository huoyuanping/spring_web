package com.et.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.et.dao.GoodDao;
import com.et.entity.Good;
@Repository 
public class GoodDaoImpl implements GoodDao {
	@Autowired
	private JdbcTemplate jdbc;
	/**
	 * 查询所有的方法
	 */
	public List<Good> queryAll() {
		String sql="select ID,NAME,MODEL,STOCK,PRICE,IMAGEPATH,DESCP from goods";
		
		
		List<Good> list=jdbc.query(sql,new BeanPropertyRowMapper<Good>(Good.class));
		return list;
		
	}
	/**
	 * 模糊查询
	 */
	public List<Good> queryGoodByName(String name) {
		String sql="select * from goods where name like '%"+name+"%'";

		List<Good> list=jdbc.query(sql,new BeanPropertyRowMapper<Good>(Good.class));
		return list;
	}
	


}

package com.et.conf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * ����spring.xml��
 * @author Administrator
 *@Bean ���÷�������bean ��bean��ʵ������JdbcTemplate��ʵ��
 */
@Configuration
public class MyConf {
	@Value("${url}")
	private String url;
	@Value("${username1}")
	private String username;
	@Value("${password2}")
	private String password;
	@Value("${driverClass}")
	private String driverClassName;
	/**
	 * �൱�������ļ��е�"jdbcTemplate"
	 * @param dataSource
	 * @return
	 */
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		
		return new JdbcTemplate(dataSource);
	}
	/**
	 * �൱�������ļ��е�"dataSource" ��ȡ����
	 * @return
	 */
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dmd=new DriverManagerDataSource();
		dmd.setUrl(url);
		dmd.setUsername(username);
		dmd.setPassword(password);
		dmd.setDriverClassName(driverClassName);
		return dmd;
	}
}

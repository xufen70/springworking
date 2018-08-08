package com.kuukuu.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbDbcpConfig {
	@Bean(destroyMethod="close")
	public DataSource dataSource() throws Exception{
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///wwhqj");
		dataSource.setUsername("root");
		dataSource.setPassword("wuqian");
		return dataSource;
	}
}

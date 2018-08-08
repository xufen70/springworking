package com.kuukuu.spring.ch4;

import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class DataBaseConfig {
	@Bean
	public DataSource dataSource() {
		InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		Properties info = new Properties();
		DriverManagerDataSource dataSource = null;
		//SingleConnectionDataSource dataSource = null;
		try {
		info.load(in);
		String driver = info.getProperty("driver");
		String url = info.getProperty("url");
		String user = info.getProperty("user");
		String pass = info.getProperty("password");
		dataSource = new DriverManagerDataSource();
		//dataSource = new SingleConnectionDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(pass);
		}catch(Exception e) {
			
		}
		if (null == dataSource) System.out.println("null found");
		return dataSource;
	}
	
	@Bean
    public JdbcTemplate jdbcTemplate() {
        //JdbcTemplate jdbcTemplate = new JdbcTemplate();
       // jdbcTemplate.setDataSource(dataSource());
        return null;
    }

    @Bean
    public BankDao accountDao() {
        BankDaoImpl bankDao = new BankDaoImpl();
        //bankDao.setJdbcTemplate(jdbcTemplate());
        return bankDao;
    }
}

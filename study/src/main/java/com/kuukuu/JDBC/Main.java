package com.kuukuu.JDBC;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kuukuu.config.DbConfig;

public class Main {
	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext app = 
				new AnnotationConfigApplicationContext(DbConfig.class);
		DataSource dataSource = app.getBean("dataSource",DataSource.class);
		Connection connection = dataSource.getConnection();
		System.out.println(connection.isClosed());
//		connection.close();
//		System.out.println(connection.isClosed());
		//BankDao bankDao = app.getBean(BankDao.class);
		app.close();
	}
}

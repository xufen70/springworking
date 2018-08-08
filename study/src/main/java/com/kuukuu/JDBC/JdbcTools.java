package com.kuukuu.JDBC;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcTools {

	public static Connection connection() {
		String driver = null;
		String url = null;
		String user = null;
		String password = null;
		Connection connect = null;
		
		try {
			InputStream in = JdbcTools.class.getClassLoader().getResourceAsStream("jdbc.properties");
			Properties properties = new Properties();
			properties.load(in);
			driver =properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			Class.forName(driver);
			connect = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			
		}
		
		return connect;
	}
}

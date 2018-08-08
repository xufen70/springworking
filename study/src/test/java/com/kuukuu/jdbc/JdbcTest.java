package com.kuukuu.jdbc;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import org.junit.jupiter.api.Test;

import com.kuukuu.JDBC.JdbcTools;

class JdbcTest {

	@Test
	public void connectTest() {
		Connection connect = JdbcTools.connection();
		System.out.println(connect);
	}

}

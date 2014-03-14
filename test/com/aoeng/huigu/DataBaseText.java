package com.aoeng.huigu;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataBaseText {

	@Test
	public void getConn() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
		DataSource dataSource = (DataSource) context.getBean("dataSource");
		Connection conn = dataSource.getConnection();
		// System.out.println(dataSource.toString());
		System.out.println(conn.toString());
	}

}

package com.OMM.application.server.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private final static String DATABASE = "";
	private final static String USERNAME = "";
	private final static String PASSWORD = "";
	
	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection(DATABASE, USERNAME, PASSWORD);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

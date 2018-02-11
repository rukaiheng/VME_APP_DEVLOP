package com.vme.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseUtil {
	
	static private String userName = null;
	
	static private String passWord = null;
	
	static private String JDBCDriver = null;
	
	static private String url = null;
	
	static private Connection connection = null;
	
	static private boolean InitializeConfigurationParameter()
	{
		Properties properties = new Properties();
		url = properties.getProperty("url");
		userName = properties.getProperty("username");
		passWord = properties.getProperty("password");
		JDBCDriver = properties.getProperty("driver");
		
		try {
			
			Class.forName(JDBCDriver);
			connection = DriverManager.getConnection(url, userName, passWord);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //initialize JDBC driver
		
		if(connection != null)
		{
			return true;
		}
		return false;
	}
	
	static public Connection GetConnection()
	{
		try {
			if(connection != null && connection.isClosed())
			{
				return connection;
			}
			if(InitializeConfigurationParameter())
			{
				return connection;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

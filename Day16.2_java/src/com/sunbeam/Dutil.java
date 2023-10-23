package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Dutil {
	public static String dbName="com.mysql.cj.jdbc.Driver";
	public static String dbURL="jdbc:mysql://localhost:3306/java";
	public static String userName="KD3_80153_Asad";
	public static String userPasswrd="manager";
	static {
		try {
			Class.forName(dbName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	public static Connection getCon() throws SQLException {
		Connection con=DriverManager.getConnection(dbURL, userName, userPasswrd);
		return con;
	}
}
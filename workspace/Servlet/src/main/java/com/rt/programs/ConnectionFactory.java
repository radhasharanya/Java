package com.rt.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			;
		}

		try {

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/petclinic?characterEncoding=UTF-8&useSSL=false", "root", "root");

		} catch (SQLException e) {
			System.out.println("ERROR: Unable to Connect to Database." + e);
		}
		return connection;

	}

}

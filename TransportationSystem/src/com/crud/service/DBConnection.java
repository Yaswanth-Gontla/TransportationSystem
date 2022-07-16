package com.crud.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection()
	{
		Connection con = null;
		String host = "localhost:3306";  // if DB is another machine , that machine IP address should be given
        String database = "transport";
        String url = "jdbc:mysql://"+ host+"/"+database;
        String username = "root";
        String password = "admin";
        try {


            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            
		} catch (Exception e) {
			System.out.println(" Exception during DB Connection "+e);
		}
		return con;
	}	
}
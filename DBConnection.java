package com.student;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	 static final String DB_URL = "jdbc:mysql://localhost:3306/student_management";
	    static final String USER = "root";
	    static final String PASS = "password";
	    
	    public static Connection getConnection() {
	        Connection conn = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conn = DriverManager.getConnection(DB_URL, USER, PASS);
	            System.out.println("Database connected!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return conn;
	    }

}

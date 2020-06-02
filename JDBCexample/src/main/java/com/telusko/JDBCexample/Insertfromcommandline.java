package com.telusko.JDBCexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Insertfromcommandline
{

	public static void main(String[] args)
	{
		
  	 try {
  		String dbrul="jdbc:mysql://localhost:3306/jdbc?";
    	  String uname="root1";
    	  String password="root1";
		Connection con=DriverManager.getConnection(dbrul, uname, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}

package com.telusko.JDBCexample;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Insertfromcommandline
{

	
	public static void main(String[] args) throws IOException
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		
  	 try {
  		//String dbrul="jdbc:mysql://localhost:3306/jdbc?";
    	  //String uname="root1";
    	  //String password="root1";
  		FileReader fileReader=new FileReader("C:/Users/Abhilash Pramod/Desktop/abhishek/ABHISHEK/path/abi.txt");
  		Properties properties=new Properties();
  		properties.load(fileReader);
  		String dburl=properties.getProperty("dburl");
  		String uname=properties.getProperty("uname");
  		String password=properties.getProperty("password");
  		
  		
		 con=DriverManager.getConnection(dburl, uname, password);
		 String query="insert into firstjdbc values(?,?)";
		 pstmt=con.prepareStatement(query);
		 pstmt.setInt(1, Integer.parseInt(args[0]));
		 pstmt.setString(2, args[1]);
		 int rs=pstmt.executeUpdate();
		 if(rs!=0)
		 {
			 System.out.println("inserted");
		 }
		 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  	finally
    {
  	  try
  	  {
  		  if(con!=null)
  		  {
  		  con.close();
  		  }
  		  if(pstmt!=null)
  		  {
  		  pstmt.close();
  		  }
  	  }
  	  catch (SQLException e)
        {
  		e.printStackTrace();
  	}
    }
	}

}

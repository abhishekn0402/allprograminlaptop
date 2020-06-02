package com.telusko.JDBCexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class App 
{
    public static void main( String[] args )
    {
    	Connection con=null;
    	Statement stmt=null;
      try
      {
    	  Driver driver=new Driver() ;
    	  DriverManager.registerDriver(driver);
    	  String dbrul="jdbc:mysql://localhost:3306?jdbc:usename=root1:password=root1";
    	  con=DriverManager.getConnection(dbrul);
    	  String query="insert into firstjdbc(id,name) values(10,Abhi)";
    	  stmt=con.createStatement();
    	  int res=stmt.executeUpdate(query);
    	  while(res!=0)
    	  {
    		  System.out.println("inserted");
    	  }
    	    
	  } 
      catch (SQLException e)
      {
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
    		  if(stmt!=null)
    		  {
    		  stmt.close();
    		  }
    	  }
    	  catch (SQLException e)
          {
    		e.printStackTrace();
    	}
      }
    }
}

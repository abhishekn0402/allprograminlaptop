package com.telusko.JDBCexample;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SelectExample
{

	public static void main(String[] args) throws IOException
	{
		FileReader fileReader=null;
		Connection con=null;
		ResultSet res=null;
		Statement stmt=null;
		try 
		{
			//String dbrul="jdbc:mysql://localhost:3306/jdbc?";
			//String uname="root1";
			//String password="root1";
			fileReader=new FileReader("C:/Users/Abhilash Pramod/Desktop/abhishek/ABHISHEK/path/abi.txt");
			Properties properties=new Properties();
			properties.load(fileReader);
			String dburl=properties.getProperty("dburl");
			String uname=properties.getProperty("uname");
			String password=properties.getProperty("password");


			con=DriverManager.getConnection(dburl, uname, password);
			String query=" select * from firstjdbc ";
			stmt=con.createStatement();
			res= stmt.executeQuery(query);
			while(res.next())
			{
				int id=res.getInt("id");
				String name=res.getString("name");
				System.out.println("id is :"+id);
				System.out.println("name is :"+name);
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
				if(res!=null)
				{
					res.close();
				}
				if(fileReader!=null)
				{
					fileReader.close();
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
		System.out.println("Retrived.......");
	}

}

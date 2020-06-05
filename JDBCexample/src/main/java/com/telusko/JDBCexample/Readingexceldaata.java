package com.telusko.JDBCexample;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingexceldaata
{
	public static int[] jdbcmethod(PreparedStatement pstmt, Sheet firstSheet) throws SQLException
	{

		try
		{
			for (int i = 1; i <= firstSheet.getLastRowNum(); i++)
			{
				Row nextRow = firstSheet.getRow(i);

				for (int j = 0; j < nextRow.getLastCellNum(); j++)
				{

					Cell nextCellinsheet = nextRow.getCell(j);

					if (nextCellinsheet == null)
					{
						nextCellinsheet = nextRow.getCell(j, Row.CREATE_NULL_AS_BLANK);
					}
					int columnIndexinsheet = nextCellinsheet.getColumnIndex();
					switch (columnIndexinsheet)
					{
					case 0:
						int id = (int) nextCellinsheet.getNumericCellValue();
						pstmt.setInt(1,id);
						break;
					case 1:
						String name = nextCellinsheet.getStringCellValue();
						pstmt.setString(2, name);
						break;
					}
				}
				// adding to batch after completion of each row.
				pstmt.addBatch();
			}
			// execution of whole rows i.e batch
		}

		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return pstmt.executeBatch();
	}
	public static void main(String[] args) throws IOException 
	{
		FileReader fileReader=null;
		Connection con=null;
		ResultSet res=null;
		PreparedStatement pstmt=null;
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
			String query="insert into firstexcel1(id,name) values(?,?)";

			pstmt=con.prepareStatement(query);
			FileInputStream fileInputStream=new FileInputStream("C:/Users/Abhilash Pramod/Desktop/abhishek/ABHISHEK/New folder/excelreadingdata.xlsx");
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet firstSheet = workbook.getSheetAt(0);
			int[] rows = jdbcmethod( pstmt, firstSheet);
			System.out.println(rows.length);
			System.out.println("inserted");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (res != null) {
					res.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
} 







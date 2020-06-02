package com.readfile.pkg1;

import java.io.File;
import java.io.IOException;
public class ReadFileNumberofOccurance
{
	public static void file() throws IOException
	{
		File file=new File("C:/Users/Abhilash Pramod/Desktop/abhishek/ABHISHEK/task.txt");
		file.mkdir();
	}
	public static void main(String[] args) throws IOException
	{
		file();
	}
}

package com.synchronizedexample.pkg;

public class Mainclass
{
	public static void main(String[] args)
	{
	
		 Display d1=new Display();
		 Display d2=new Display();
		 Mythread mythread1=new Mythread(d1,"Abhi");
		 Mythread mythread2=new Mythread(d2,"Manju");
		 mythread1.start();
		 mythread2.start();
		 
		 
	}
}

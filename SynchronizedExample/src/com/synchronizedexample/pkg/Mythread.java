package com.synchronizedexample.pkg;

class Display
{
	public void display(String name)
	{
		synchronized(this)
		{
			for(int i=0;i<=10;i++)	
			{
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
				}
				System.out.println("the name is :"+name);
			}
		}
	}
}
public class Mythread extends Thread
{
	Display d;
	String name;

	public Mythread(Display d, String name)
	{
		super();
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.display(name);
	}
}

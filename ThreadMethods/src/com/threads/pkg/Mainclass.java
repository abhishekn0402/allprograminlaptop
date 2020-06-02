package com.threads.pkg;
class ChildThread extends Thread
{
	int sum=0;
	
public void run()
{
	//main thread get lock of b this means it is 'b' only
	synchronized(this)
	{
		System.out.println("child thread trying to calculate");
	for(int i=0; i<=100;i++)
	{
		sum=sum+i;
	}
	System.out.println("child thread trying to give notification to main thread");
	this.notify();
	}
}
}
public class Mainclass
{

	public static void main(String[] args) throws InterruptedException
	{
		ChildThread childThread=new ChildThread();
		childThread.start();
		//main thread get lock of b
		synchronized(childThread)
		{
			System.out.println("Main thread trying to call wait()");
			childThread.wait();
			System.out.println("Main thread got notifcation");
		
		}
	}

}

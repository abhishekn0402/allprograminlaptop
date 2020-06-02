package pkg1;

import java.util.ArrayList;

class Example1
{
	int id=10;
	String name="Abhishek";
	String city="Mandya";
}
public class Arraylistexample 
{

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		Object a1=new ArrayList();
		
		Example1 e=new Example1();
		a.add(e.id);
		a.add(e.name);
		a.add(e.city);
		a.add(3, "karnataka");
		//a.clear();
		a1=a.clone();
		
		
		for (int i = 0; i < a.size(); i++)
		{
		System.out.println(a.get(i));	
		}
		for (int i = 0; i < a.size(); i++)
		{
		System.out.println(a.get(i));	
		}
	}

}

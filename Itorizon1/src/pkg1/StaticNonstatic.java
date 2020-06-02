package pkg1;
class Abhi1
{
	int a=100;// static member outside of  the same class
	static int b=200;// static member outside of the same class
}
public class StaticNonstatic 
{
	int x=10;//non static member within the same class
	static int y=20;//static member within the same class

	public static void main(String[] args) 
	{
		StaticNonstatic s=new StaticNonstatic();
		System.out.println(s.x);
		System.out.println(StaticNonstatic.y);
		Abhi1 aa=new Abhi1();
        System.out.println(aa.a);
        System.out.println(Abhi1.b);
	}

}

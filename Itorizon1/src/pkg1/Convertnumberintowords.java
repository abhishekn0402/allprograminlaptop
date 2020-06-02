package pkg1;

public class Convertnumberintowords
{
static String[] onetoninteen= {"","one ","two ","three ","four ","five ","six ","seven ",
		                   "eight","nine","ten","eleven","twelve ","thirteen ",
		                   "fouteen ","fifteen ","sixteen ",
		                   "seventeen ","eighteen ","nineteen "};

static String[] multiplesoTen= {"","","twenty ","thirty ","fourty ","fifty ",
		                    "sixty ","seventy ","eighty ","ninety "};
public static String conversion(int number)
{
	String out="";
	if(number==0)
	{
		return "Zero";
	}
	if(number < 0|| number>10000000)
	{
		return "Please number between 0 and 10000000";
	}
	
	out=out+numToWords((int)(number/10000000),"crore ");
	out=out+numToWords((int)((number/100000)%100),"Lakh ");
	out=out+numToWords((int)((number/1000)%100),"thousand ");
	out=out+numToWords((int)((number/100)%10),"hundred and ");
	out=out+numToWords((int)(number%100),"");
	return out;
	
}
public static String numToWords(int n, String s)
{ 
	String str = ""; 

	if (n > 19)
	{ 
		str = str + multiplesoTen[n / 10] + onetoninteen[n % 10]; 
	} else
	{ 
		str = str + onetoninteen[n]; 
	} 
	if (n != 0)
	{ 
		str = str + s; 
	} 
	return str; 
}
	public static void main(String[] args)
	{
		int num=101;
		System.out.println(conversion(num));
	}

}

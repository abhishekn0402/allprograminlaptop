package com.application.ito.pakagename;

import java.time.LocalDate;
import java.time.Month;

class DateBand
{
	public LocalDate startDate;
	public LocalDate endDate;
	public DateBand()
	{
		
	}
	public DateBand(LocalDate startDate, LocalDate endDate)
	{
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
}

public class Firstclass
{
	public static void main(String[] args)
	{
		DateBand dateBand=new DateBand(LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 31));
		DateBand dateBand1 = new DateBand(LocalDate.of(2020, Month.JANUARY, 15), LocalDate.of(2020, Month.FEBRUARY, 20));
		DateBand dateBand3=new DateBand();
		
		
	}
}

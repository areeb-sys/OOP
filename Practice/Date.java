public class Date
{
	private int month;
	private int day;
	private int year;

	public Date(int month , int day , int year)
	{
		if(month != 0 && month <= 12)
			this.month = month;
		if(day != 0 && day <= 31)
			this.day = day;
		if(year != 0 && year <=2019)
			this.year = year;
	}
	public void setMonth(int month)
	{
		if(month != 0 && month <= 12)
			this.month = month;
	}
	public int getMonth()
	{
		return month;
	}
	public void setDay(int day)
	{
		if(day != 0 && day <= 31)
			this.day = day;
	}
	public int getDay()
	{
		return day;
	}
	public void setYear(int year)
	{
		if(year != 0 && year <=2019)
			this.year = year;
	}
	public int getYear()
	{
		return year;
	}
}
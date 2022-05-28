public class DateTest
{
	public static void main(String[] args)
	{
		Date d1 = new Date(12,14,2000);
		System.out.printf("%nDate is %d/%d/%d",d1.getMonth(),d1.getDay(),d1.getYear());
	}
}
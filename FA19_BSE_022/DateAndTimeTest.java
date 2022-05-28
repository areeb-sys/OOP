public class DateAndTimeTest
	{
		public static void main(String[] args)
		{
			DateAndTime Dt = new DateAndTime(12, 31, 2019, 23, 59, 57);
			System.out.println();
			int i = 0;
			while(i < 6)
			{
				
				Dt.tick();
				System.out.printf("Date & Time after a second: %s (such that %s) %n", Dt, Dt.toUniversalString());
				i++;
			}
		}
	}

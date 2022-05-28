// Auther : AREEB AHMED FA19_BSE_022
public class DateAndTime
{
    private int mon;
    private int day;
    private int yr;
    private int hr;
    private int min;
    private int sec;
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public DateAndTime(int mon, int day, int yr, int hr, int min, int sec)
    {
        if(mon <= 0 || mon > 12)
            throw new IllegalArgumentException("month (" + mon + ") must be 1-12");
        if(day <= 0 || (day > daysPerMonth[mon] && !(mon == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        if(mon == 2 && day == 29 && !(yr % 400 == 0 || (yr % 4 == 0 && yr % 100 != 0))) //for Leap Year
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        if(yr <= 0)
            throw new IllegalArgumentException("year (" + yr + ") must be greater than 0");
        if(hr < 0 || hr >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if(min < 0 || min >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if(sec < 0 || sec >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        this.mon = mon;
        this.day = day;
        this.yr = yr;
        System.out.printf("DateAndTime object constructor for %s%n", this);
    }
    public void setDate(int mon, int day, int yr)
    {
        if(mon <= 0 || mon > 12)
            throw new IllegalArgumentException("month (" + mon + ") must be 1-12");
        if(day <= 0 || (day > daysPerMonth[mon] && !(mon == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        if(mon == 2 && day == 29 && !(yr % 400 == 0 || (yr % 4 == 0 && yr % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        if(yr <= 0)
            throw new IllegalArgumentException("year (" + yr + ") must be greater than 0");
        this.mon = mon;
        this.day = day;
        this.yr = yr;
    }
    public void setTime(int hr, int min, int sec)
    {
        if(hr < 0 || hr >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if(min < 0 || min >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if(sec < 0 || sec >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public void setHour(int hr)
    {
        if(hr < 0 || hr >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        this.hr = hr;
    }
    public void setMinute(int min)
    {
        if(min < 0 || min >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        this.min = min;
    }
    public void setSecond(int sec)
    {
        if(sec < 0 || sec >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        this.sec = sec;
    }
    public int getHour()
    {
        return hr;
    }
    public int getMinute()
    {
        return min;
    }
    public int getSecond()
    {
        return sec;
    }
    public String toString()
    {
        return String.format("%02d/%02d/%04d - %d:%02d:%02d %s", mon, day, yr, ((hr == 0 || hr == 12) ? 12 : hr % 12), min, sec, (hr < 12 ? "AM" : "PM"));
    }
    public String toUniversalString()
    {
        return String.format("%02d/%02d/%04d - %02d:%02d:%02d", mon, day, yr, hr, min, sec);
    }
    public void tick()
    {
        if(this.sec == 59)
        {
            this.sec = 0;
            this.incrementMinute();
            return;
        }
        this.sec += 1;
        return;
    }
    public void incrementMinute()
    {
        if(this.min == 59)
        {
            this.min = 0;
            this.incrementHour();
            return;
        }
        this.min += 1;
        return;
    }
    public void incrementHour()
    {
        if(this.hr == 23)
        {
            this.hr = 0;
            this.nextDay();
            return;
        }
        this.hr += 1;
        return;
    }
    public void nextDay()
    {
        int num = daysPerMonth[mon];
        if(day == num)
        {
            day = 1;
            nextMonth();
            return;
        }
        day += 1;
        return;
    }
    private void nextMonth()
    {
        if(mon == 12)
        {
            mon = 1;
            yr += 1;
            return;
        }
        mon += 1;
        return;
    }
	
	
}
 




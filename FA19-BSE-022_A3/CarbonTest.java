// Author : Areeb Ahmed FA19_BSE_022

public class CarbonTest
{
	public static void main(String[] args)
	{
		
		int[] array = new int [100];
		
		for(int x= 0 ; x<args.length ;x++)
		{
		   array[x] = Integer.parseInt(args[x]);
		}
		
		Building b = new Building(array[0]);
		Car car = new Car(array[1]);
		Cycle cy = new Cycle(array[2]);
		
		CarbonFootprint[] carbonfootprint = new CarbonFootprint[3];
		
		carbonfootprint[0] = b;
		carbonfootprint[1] = car;
		carbonfootprint[2] = cy;
		
		 int sum = 0;
		for(int i=0 ;i<carbonfootprint.length;i++)
		{
			System.out.printf("%s%n" ,carbonfootprint[i]);
			sum = sum + carbonfootprint[i].getCarbonFootprint();
		}
		System.out.printf("The total CO2 generated is %d gm" ,sum); 
		
	}
}

interface CarbonFootprint
{
	int getCarbonFootprint();
}

class Building implements CarbonFootprint
{
	private int area;
	private int carbonAmount = 40;
	
	Building(int area)
	{
		this.area = area;
	}
	
	public int getCarbonFootprint()
	{
		return area*carbonAmount;
	}
	
	public String toString()
	{
		return String.format("A %d sq feet house will generate %d gm of CO2" ,area,getCarbonFootprint());
	}
}

class Car implements CarbonFootprint
{
	private int engine;
	private int carbonAmount = 10;
	
	Car(int engine)
	{
		this.engine = engine;
	}
	
	public int getCarbonFootprint()
	{
		return engine*carbonAmount;
	}
	
	public String toString()
	{
		return String.format("A %d CC car will generate %d gm of CO2" , engine,getCarbonFootprint());
	}
}

class Cycle implements CarbonFootprint
{
	private int gears;
	private int carbonAmount = 1;
	
	Cycle(int gears)
	{
		this.gears = gears;
	}
	
	public int getCarbonFootprint()
	{
		return gears*carbonAmount;
	}
	
	public String toString()
	{
		return String.format("A %d gear bicycle will generate %d gm of CO2" ,gears ,getCarbonFootprint());
	}
	
}

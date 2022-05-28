public class CarbonTest1
{
	public static void main(String[] args)
	{
		double[] array = new double [100];
		
		for(int i = 0 ; i<args.length ;i++)
		{
		   array[i] = Double.parseDouble(args[i]);
		}
		
		Building b = new Building(array[0]);
		Car c = new Car(array[1]);
		Cycle cy = new Cycle(array[2]);
		
		Carbon[] carbon = new Carbon[4];
		double carbOfBuilding=0,carbOfCar=0,carbOfCycle=0;
		carbon[0] = b;
		carbon[1] = c;
		carbon[2] = cy;
		
		for(Carbon x : carbon){
		
		
		if(x instanceof Building){
			
			Building bu = (Building) x;
			carbOfBuilding = bu.getResult();

		}
		if(x instanceof Car){
		
			Car ca = (Car) x;
			carbOfCar = ca.getResult();
		}
		if(x instanceof Cycle){
		
			Cycle cyc = (Cycle) x;
			carbOfCycle = cyc.getResult();
		}
		
	}
	System.out.printf("A %.1f sq feet house will generate %.2f gm of CO2.%n",array[0],carbOfBuilding);
	System.out.printf("A %.1f CC car will generate %.2f gm of CO2%n",array[1],carbOfCar);
	System.out.printf("A %.1f gear bicycle will generate %.2f gm of CO2%n",array[2],carbOfCycle);
	System.out.printf("Total CO2 generated is %.2f gm%n",carbOfBuilding+carbOfCar+carbOfCycle);
		
		
	}
	
	
}
abstract class Carbon
{
	private double area;
	Carbon(double area)
	{
		this.area = area;
	}
	public double getArea()
	{
		return area;
	}
	public abstract double getData();
	
}
class Building extends Carbon
{
	public double area;
	private double massOfC=40.0 ;
	Building(double area)
	{
		super(area);
	}
	public double getData()
	{
		return massOfC;
	}
	double getResult()
	{
		return getArea()*getData();
	}
}
class Car extends Carbon
{
	public double area;
	private double massOfC=10;
	Car(double area)
	{
		super(area);
	}
	public double getData()
	{
		return massOfC;
	}
	double getResult()
	{
		return getArea()*getData();
	}
	
}
class Cycle extends Carbon
{
	public double area;
	private double massOfC=1;
	Cycle(double area)
	{
		super(area);
	}
	public double getData()
	{
		return massOfC;
	}
	double getResult()
	{
		return getArea()*getData();
	}
	
}
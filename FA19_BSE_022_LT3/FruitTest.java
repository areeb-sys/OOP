//Author : Areeb Ahmed (FA19_BSE_022)

public class FruitTest{
	public static void main(String[] args)
	{
		double[] array = new double [100];
		
		for(int i = 0 ; i<args.length ;i++)
		{
		   array[i] = Double.parseDouble(args[i]);
		}
		
		Kinu kinu = new Kinu(array[0]);
		Malta malta = new Malta(array[1]);
		Kharbooza kharbooza = new Kharbooza(array[2]);
		Tarbooz tarbooz = new Tarbooz(array[3]);
		
		Fruit[] fruit = new Fruit[4];
		double vitKi=0,vitMa=0,antKh=0,antTa=0;
		
	fruit[0] = kinu;
	fruit[1] = malta;
	fruit[2] = kharbooza;
	fruit[3] = tarbooz;
	
	for(Fruit x : fruit){
		
		if(x instanceof Kinu){
			
			Kinu knu = (Kinu) x;
			vitKi = knu.getResult();
			
		}
		if(x instanceof Malta){
			
			Malta mlta = (Malta) x;
			vitMa = mlta.getResult();

		}
		if(x instanceof Kharbooza){
		
			Kharbooza kharboza = (Kharbooza) x;
			antKh = kharboza.getResult();
		}
		if(x instanceof Tarbooz){
		
			Tarbooz tarboz = (Tarbooz) x;
			antTa = tarboz.getResult();
		}
		
	}
	System.out.printf("You will get VitaminC of %.4f gm %nYou will get Antioxidents of  %.4f gm",vitKi+vitMa,antKh+antTa);
}
}
	
abstract class Fruit{
	private double value;
	
	Fruit(double value){
		this.value = value;
	}
	public double getValue(){
		return value;
	}
	public abstract double getdet();
	
}

abstract class Citrus extends Fruit{

	Citrus(double value)
	{
		super(value);
	}
	public abstract double getdet();
}

abstract class Melon extends Fruit{

	Melon(double value)
	{
		super(value);
	}
	public abstract double getdet();
}

class Malta extends Citrus{
	private double percentage=2.0;
	Malta(double value)
	{
		super(value);
	}
	public double getdet()
	{
		return percentage;
	}
	double getResult()
	{
	
		return getValue()*(getdet()/100);
		
	}
		
}

class Kinu extends Citrus{
	public double value;
	private double percentage=3.0;
	Kinu(double value)
	{
		super(value);
	}
	public double getdet()
	{
		return percentage;
	}
	double getResult()
	{
	
		return getValue()*(getdet()/100);
	}
}

class Tarbooz extends Melon{
	public double value;
	private double percentage=0.008;
	Tarbooz(double value)
	{
		super(value);
	}
		public double getdet()
	{
		return percentage;
	}
	double getResult()
	{
	
		return (getValue()*getdet())/100;
	}
}

class Kharbooza extends Melon{
	public double mass;
	private double percentage=0.001;
	Kharbooza(double mass)
	{
		super(mass);
	}
	public double getdet()
	{
		return percentage;
	}
	double getResult()
	{
		
		return (getValue()*getdet())/100;
	}
}


		
	
	
	
	
import java.util.Scanner;

public class Area
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double radius = input.nextDouble();
		System.out.println("Perimeter is = " + (2 * Math.PI* radius));
		System.out.println("Area is = " + (Math.PI * radius * radius ));
		
		
	}
	
	
	
	
}
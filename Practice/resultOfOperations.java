import java.util.Scanner;

public class resultOfOperations
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = input.nextInt();
		System.out.println("Enter the second number");
		int y = input.nextInt();
		int sum = x+y;
		int sub = x-y;
		int mult = x*y; 
		int div = x/y;
		System.out.printf("Sum is %d%n Subtraction iS %d%n Multiplication is %d%n Division is %d%n" , sum,sub,mult,div);
		
		
	}
	
	
	
	
}

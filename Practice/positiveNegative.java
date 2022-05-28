import java.util.Scanner;

public class positiveNegative
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number!");
		int number = input.nextInt();
		if(number>0)
			System.out.printf("%d is a positive Number",number);
		else
			System.out.printf("%d is negative number",number);	
		
		
		
		
	}
	
	
}
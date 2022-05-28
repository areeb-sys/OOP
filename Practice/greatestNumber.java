import java.util.Scanner;
public class greatestNumber
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = input.nextInt();
		System.out.println("Enter a number");
		int num2 = input.nextInt();
		System.out.println("Enter a number");
		int num3 = input.nextInt();
		
		if(num1>num2)
			if(num1>num3)
				System.out.printf("%d is greater ",num1);
		if(num2>num1)
			if(num2>num3)
				System.out.printf("%d is greater ",num2);	
		if(num3>num1)
			if(num3>num2)
				System.out.printf("%d is greater ",num3);
		
		
		
	}
	
	
	
}
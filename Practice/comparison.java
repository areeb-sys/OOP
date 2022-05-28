import java.util.Scanner;

public class comparison
{	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Enter first number: ");
		num1 = input.nextInt();
		System.out.println("Enter second number: ");
		num2 = input.nextInt();
		if(num1==num2)
			System.out.printf("%d == %d",num1,num2);
		if(num1>=num2)
			System.out.printf("%d >= %d",num1,num2);	
		if(num1<=num2)
			System.out.printf("%d <= %d",num1,num2);
		if(num1!=num2)
			System.out.printf("%d != %d",num1,num2);		
	
	
	}



}
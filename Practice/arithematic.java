import java.util.Scanner;
public class arithematic
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st integer:");
		int num1 = input.nextInt();
		System.out.println("Enter 2nd integer:");
		int num2 = input.nextInt();
		System.out.println("Enter 3rd integer:");
		int num3 = input.nextInt();
		
		int sum = num1+num2+num3;
		int prod = num1*num2*num3;
		int avg = sum/3;
		System.out.printf("Sum is %d%n",sum);
		System.out.printf("product is %d%n",prod);
		System.out.printf("Average is %d%n",avg);
		
		if(num1>num2 && num1>num3)
			System.out.printf("%d is greatest number",num1);
		if(num2>num1 && num2>num3)
			System.out.printf("%d is greatest number",num2);
		if(num3>num1 && num3>num2)
			System.out.printf("%d is greatest number",num3);
		
		
		
		
	}
	
}

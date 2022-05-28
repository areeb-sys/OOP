import java.util.Scanner;

public class even
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input.nextInt();
		if(num % 2==0)
			System.out.printf("1");
		else
			System.out.printf("0");
		
	}
	
}

//Author : Areeb Ahmed FA19_BSE_022

import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		Account account1 = new Account("Jane Green",50.00);
		Account account2 = new Account("John Blue",-7.53);
		
		System.out.printf("%s balance : %.2f%n",account1.getName() , account1.getBalance());
		System.out.printf("%s balance : %.2f%n",account2.getName() , account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the deposit amount in account 1 : ");
		double depositAmount = input.nextDouble();
		account1.deposit(depositAmount);
		
		
		System.out.printf("%s balance : %.2f%n",account1.getName() , account1.getBalance());
		System.out.printf("%s balance : %.2f%n",account2.getName() , account2.getBalance());
		
		System.out.printf("Enter the deposit amount in account 2 : ");
		depositAmount = input.nextDouble();
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance : %.2f%n",account1.getName() , account1.getBalance());
		System.out.printf("%s balance : %.2f%n",account2.getName() , account2.getBalance());
		
		
		System.out.printf("Enter the withdrawl amount for account1: ");
		double withdrawlAmount = input.nextDouble();
		account1.withdraw(withdrawlAmount);
		System.out.printf("Withdrawl Amount from account1 is %.2f%n",account1.getWithdraw());
		
		System.out.printf("Enter the withdrawl amount for account2: ");
		withdrawlAmount = input.nextDouble();
		account2.withdraw(withdrawlAmount);
		System.out.printf("Withdrawl Amount from account2 is %.2f%n",account2.getWithdraw());
		
	
	
	}




}
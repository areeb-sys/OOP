//Author : Areeb Ahmed FA19_BSE_022

import java.security.SecureRandom;

public class MatrixSquare
{
	
	public static SecureRandom randomNumbers = new SecureRandom();	
	public static void main(String[] args)
	{
		int a=0;
		int  b = Integer.parseInt(args[a]);
		int[][] array1 = new int[b][b];
		int[][] array2 = new int[b][b];
		int[][] array3 = new int[b][b];
		
		
		System.out.println("Enter the elements of array:");
		for(int row = 0 ; row < b ;row++)
		{
			for(int coloumn=0 ; coloumn< b ;coloumn++)
			{	int x = 5 + randomNumbers.nextInt(10);
				System.out.printf("%d \t",x);
				array1[row][coloumn] = x;
				array2[row][coloumn] = x;
			}
			System.out.println();
		}
		System.out.println("Copy of array is:");
		for(int row= 0;row < b ; row++)
		{
			for(int coloumn = 0 ; coloumn < b ;coloumn++)
			{
				System.out.printf("%d \t",array2[row][coloumn]);
			}
			System.out.println();
		}
		
		System.out.println("Multiplicatin is :");
		
		for(int row=0;row<b;row++)
		{    
			for(int coloumn=0;coloumn<b;coloumn++)
			{          
				for(int i=0;i<b;i++)            
					array3[row][coloumn]+=array1[row][i]*array2[i][coloumn];     
			  
			}
			 
		} 
		for(int row=0;row<b;row++)
		{    
			for(int coloumn=0;coloumn<b;coloumn++)
			{          
				System.out.printf("%d  \t",array3[row][coloumn]);     
			  
			}
			System.out.println();
			 
		} 	
		
	}  
		
		
		
		
        
		
}		
		
	
	
		
		
	
	
	
	
